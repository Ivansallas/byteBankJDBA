package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
   
    public  Connection recuperarConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/byte_bank";
        String user = "root";
        String password = "1234";

        try {
            return DriverManager.getConnection(url, user, password);
            
        } catch (Exception erro) {
            System.out.println("Erro ao conectar no banco de dados: " + erro.getMessage());
            throw erro;
        }
    }

}
