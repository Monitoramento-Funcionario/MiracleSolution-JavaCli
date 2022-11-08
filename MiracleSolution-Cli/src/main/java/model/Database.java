package model;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Database {
    // ATRIBUTO

    private JdbcTemplate connection;

    // CONSTRUTOR
    public Database() {

        BasicDataSource dataSource = new BasicDataSource();
        //CONEXÃO PARA MYSQL
        /*dataSource​.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource​.setUrl("jdbc:mysql://localhost:3306/miraclesolutions");
        dataSource​.setUsername("aluno");
        dataSource​.setPassword("sptech");*/
        
        // CONEXÃO PARA AZURE
        dataSource​.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource​.setUrl("jdbc:sqlserver://miraclesolutions.database.windows.net:1433;database=miraclesolutions;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;");
        dataSource​.setUsername("admin-projeto-miraclesolutions");
        dataSource​.setPassword("#Gfgrupo8");
        this.connection = new JdbcTemplate(dataSource);
        
    }

    // GETTER
    public JdbcTemplate getConnection() {
        return connection;
    }    
}
