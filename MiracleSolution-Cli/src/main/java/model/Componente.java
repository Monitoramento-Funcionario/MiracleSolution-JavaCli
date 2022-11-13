package model;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.util.Conversor;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class Componente {

    private Database database = new Database();
    private Looca looca = new Looca();

    private Integer idComponente;
    private String tipoComponente;
    private Integer velocidade;
    private Integer capacidade;
    private Integer processadorLogico;
    private Integer fkComputador;

    public Integer getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Integer getProcessadorLogico() {
        return processadorLogico;
    }

    public void setProcessadorLogico(Integer processadorLogico) {
        this.processadorLogico = processadorLogico;
    }

    public Integer getFkComputador() {
        return fkComputador;
    }

    public void setFkComputador(Integer fkComputador) {
        this.fkComputador = fkComputador;
    }

    public void setRegisterComponente(Integer idComputador) {
        Memoria memoria = looca.getMemoria();
        Processador processador = looca.getProcessador();
        DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();

        List<Disco> disco = grupoDeDiscos.getDiscos();

        database.getConnection().update(
                "INSERT INTO componente ( tipoComponente, velocidade, processadorLogico, fkComputador, nome, nucleo, unidadeMedida ) VALUES (?,?,?,?,?,?,?)",
                "CPU", processador.getFrequencia(), processador.getNumeroCpusLogicas(), idComputador, processador.getNome(), processador.getNumeroCpusFisicas(), "GHZ"
        );
        database.getBackup().update(
                "INSERT INTO componente ( tipoComponente, velocidade, processadorLogico, fkComputador, nome, nucleo, unidadeMedida ) VALUES (?,?,?,?,?,?,?)",
                "CPU", processador.getFrequencia(), processador.getNumeroCpusLogicas(), idComputador, processador.getNome(), processador.getNumeroCpusFisicas(), "GHZ"
        );

        for (Disco discos : disco) {
            database.getConnection().update(
                    "INSERT INTO componente ( tipoComponente, capacidade, fkComputador, nome, unidadeMedida ) VALUES (?,?,?,?,?)",
                    "DISCO", discos.getTamanho(), idComputador, discos.getNome(), "GB"
            );
        }

        database.getConnection().update(
                "INSERT INTO componente ( tipoComponente, capacidade, fkComputador, unidadeMedida ) VALUES (?,?,?,?)",
                "RAM", memoria.getTotal(), idComputador, "GB"
        );
        database.getBackup().update(
                "INSERT INTO componente ( tipoComponente, capacidade, fkComputador, unidadeMedida ) VALUES (?,?,?,?)",
                "RAM", memoria.getTotal(), idComputador, "GB"
        );
    }

    public List<Componente> getComponenteLocalData(Integer idUsuario, String ipMaquina) {
        return database.getConnection().query(
                "select idComponente, tipoComponente from componente join computador on fkComputador = idComputador join usuario on idUsuario = fkUsuario where ipComputador = '" + ipMaquina + "' and fkUsuario = '" + idUsuario + "'",
                new BeanPropertyRowMapper(Componente.class)
        );
    }
}
