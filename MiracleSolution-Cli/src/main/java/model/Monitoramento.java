package model;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Monitoramento {

    private Looca looca = new Looca();
    private Database database = new Database();

    private Integer idMonitoramento;
    private Integer dado;
    private Integer fkComputador;

    public Integer getIdMonitoramento() {
        return idMonitoramento;
    }

    public void setIdMonitoramento(Integer idMonitoramento) {
        this.idMonitoramento = idMonitoramento;
    }

    public Integer getDado() {
        return dado;
    }

    public void setDado(Integer dado) {
        this.dado = dado;
    }

    public Integer getFkComputador() {
        return fkComputador;
    }

    public void setFkComputador(Integer fkComputador) {
        this.fkComputador = fkComputador;
    }

    public void setDadoAtual(Integer idUsuario) {
        Componente componentes = new Componente();
        Computador computador = new Computador();

        for (Componente componente : componentes.getComponenteLocalData(idUsuario, computador.getIpComputadorLocalData())) {
            if ("DISCO".equals(componente.getTipoComponente())) {
                DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();

                List<Disco> discos = grupoDeDiscos.getDiscos();

                for (Disco disco : discos) {
                    database.getConnection().update(
                            "INSERT INTO monitoramento (dado, fkComponente) VALUES (?,?)",
                            disco.getLeituras(), componente.getIdComponente()
                    );
                    database.getBackup().update(
                            "INSERT INTO Monitoramento (dado, fkComponente) VALUES (?,?)",
                            disco.getLeituras(), componente.getIdComponente()
                    );
                }
            } else if ("RAM".equals(componente.getTipoComponente())) {
                Memoria memoria = looca.getMemoria();
                
                Double emUso = (double) memoria.getEmUso();
                Double total = (double) memoria.getTotal();
                
                Long porcentagem = Math.round((emUso/total) * 100);
                
                database.getConnection().update(
                        "INSERT INTO monitoramento (dado, fkComponente) VALUES (?,?)",
                        porcentagem, componente.getIdComponente()
                );
                database.getBackup().update(
                        "INSERT INTO Monitoramento (dado, fkComponente) VALUES (?,?)",
                        memoria.getEmUso(), componente.getIdComponente()
                );
            } else {
                Processador processador = looca.getProcessador();
                
//                System.out.println("Processador: " + processador.getUso());
                database.getConnection().update(
                        "INSERT INTO monitoramento (dado, fkComponente) VALUES (?,?)",
                        Math.round(processador.getUso()), componente.getIdComponente()
                );
                database.getBackup().update(
                        "INSERT INTO Monitoramento (dado, fkComponente) VALUES (?,?)",
                        Math.round(processador.getUso()), componente.getIdComponente()
                );
            }
        }
    }

    public void setTimeOut(Integer idUsuario) {
        Timer timer = null;
        if (timer == null) {
            timer = new Timer();
            TimerTask monitorar = new TimerTask() {

                public void run() {
                    try {
                        setDadoAtual(idUsuario);
                    } catch (Exception e) {
                        System.out.println("Problemas ao obter dados da máquina erro: " + e);
                    }
                }
            };
            timer.scheduleAtFixedRate(monitorar, 10000, 10000);
        }
    }
}
