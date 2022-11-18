package model;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class Usuario {
    private Database database = new Database();
    
    private Integer idUsuario;
    private String nomeUsuario;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }    

    public List<Usuario> getAuthLogin(String email, String senha) {
        // CÓDIGO PARA MYSQL
        /*return database.getConnection().query(
                "SELECT * FROM usuario WHERE emailUsuario = '" + email + 
                        "' AND senhaUsuario = AES_ENCRYPT('" + senha + "', 'miracle')", 
                new BeanPropertyRowMapper(Usuario.class)
        );*/        
        
        //CÓDIGO PARA SQL
        return database.getConnection().query(
                "SELECT * FROM usuario WHERE emailUsuario = '" + email + 
                        "' AND senhaUsuario = '" + senha + "'", 
                new BeanPropertyRowMapper(Usuario.class)
        );
    }
    
    public Usuario getUserLocalDataForId(Integer idUsuario) {
        List<Usuario> lista = database.getConnection().query("SELECT * FROM usuario WHERE idUsuario = " + idUsuario,
                new BeanPropertyRowMapper(Usuario.class));
        
        if(lista.isEmpty()){
            return null;
        }
        
        return lista.get(0);
    }
}
