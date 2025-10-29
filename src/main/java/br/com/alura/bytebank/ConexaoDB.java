package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {
    public static void main(String[] args) throws Exception {
        getConnection();
    }

    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/byte_bank";
        String user = "root";
        String password = "1234";

        try {
            Connection conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso!");
            conexao.close();
            return conexao;

        } catch (Exception erro) {
            System.out.println("Erro ao conectar no banco de dados: " + erro.getMessage());
            throw erro;
        }
    }

}
