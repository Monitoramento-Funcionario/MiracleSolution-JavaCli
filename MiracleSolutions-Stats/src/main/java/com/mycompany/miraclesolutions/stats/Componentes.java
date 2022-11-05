package com.mycompany.miraclesolutions.stats;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.servicos.Servico;
import com.github.britooo.looca.api.group.servicos.ServicosGroup;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.temperatura.Temperatura;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Componentes {
    public static void main(String[] args) throws SQLException {
        /*try {
            //INSERINDO O JDBC
            Class.forName("com.mysql.jdbc.Driver");
            Connection  conexao = DriverManager.getConnection("jdbc:mysql://localhost/miraclesolutions", "aluno", "sptech");
            ResultSet resClient = conexao.createStatement().executeQuery("select * from Empresa");
            while (resClient.next()){
                System.out.println("Empresa: " + resClient.getString("nomeEmpresa"));
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Drive do JDBC não localizado!");
        } catch (SQLException ex){
            System.out.println("Ocorreu um erro ao acessar o banco:" + ex.getMessage());
        }*/
        
        //INSTANCIANDO A CLASSE LOOCA
        Looca looca = new Looca();
        
        //COLETANDO DADOS DO SISTEMA
        System.out.println("-".repeat(50));
        Sistema sistema = looca.getSistema();
        
        System.out.println(sistema);
        
        //COLETANDO DADOS DA MEMORIA
        System.out.println("-".repeat(50));
        Memoria memoria = looca.getMemoria();
        
        System.out.println(memoria);
        
        //COLETANDO DADOS DO PROCESSADOR
        System.out.println("-".repeat(50));
        Processador processador = looca.getProcessador();
        
        System.out.println(processador);
        
        //COLETANDO DADOS DA TEMPERATURA
        System.out.println("-".repeat(50));
        Temperatura temperatura = looca.getTemperatura();
        
        System.out.println(temperatura);
        
        
        DiscosGroup grupoDeDiscos = looca.getGrupoDeDiscos();
        
        List<Disco> disco = grupoDeDiscos.getDiscos();
        
        System.out.println(disco);
        
        
        System.out.println(Math.round(processador.getUso()));
        
    }
}
