package model;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class Computador {

    private Looca looca = new Looca();
    private Database database = new Database();

    private Integer idComputador;
    private String ipMaquina;
    private String sistemaOperacional;
    private String fkUsuario;

    public Integer getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(Integer idComputador) {
        this.idComputador = idComputador;
    }

    public String getIpMaquina() throws UnknownHostException, UnknownHostException, UnknownHostException {
        return ipMaquina;
    }

    public void setIpMaquina(String ipMaquina) {
        this.ipMaquina = ipMaquina;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(String fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public void setRegisterComputador(Integer idUsuario) {
        Sistema sistema = new Sistema();
        Componente componente = new Componente();

        if (getComputadorLocalData(idUsuario) != null && getComputadorLocalData(idUsuario).isEmpty()) {
            database.getConnection().update(
                    "INSERT INTO computador ( ipComputador, sistemaOperacional, arquitetura, fkUsuario) VALUES (?,?,?,?)",
                    getIpComputadorLocalData(), sistema.getSistemaOperacional(), sistema.getArquitetura(), idUsuario
            );
            database.getBackup().update(
                    "INSERT INTO computador ( ipComputador, sistemaOperacional, arquitetura, fkUsuario) VALUES (?,?,?,?)",
                    getIpComputadorLocalData(), sistema.getSistemaOperacional(), sistema.getArquitetura(), idUsuario
            );
            componente.setRegisterComponente(
                    getComputadorLocalData(idUsuario).get(0).getIdComputador());

            System.out.println("Computador Cadastrado com Sucesso!");
        }
    }

    public List<Computador> getComputadorLocalData(Integer idUsuario) {
        if (getIpComputadorLocalData() == null) {
            return null;
        }

        return database.getConnection().query(
                "SELECT * FROM computador WHERE ipComputador = '" + getIpComputadorLocalData() + "' AND fkUsuario = '" + idUsuario + "'",
                new BeanPropertyRowMapper(Computador.class)
        );
    }

    public String getIpComputadorLocalData() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {
            Logger.getLogger(Computador.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}
