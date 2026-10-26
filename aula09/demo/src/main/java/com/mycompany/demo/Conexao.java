package com.mycompany.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection abrirConexao() {
        Connection con = null;

        String url = "jdbc:mysql://localhost:3306/Estacionamento";
        String usuario = "root";
        String senha = "";

        try {
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão aberta.");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }

        return con;
    }

    public static void fecharConexao(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Conexão fechada.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão: " + e.getMessage());
        }
    }
}

//Rodrigo Correa do Nascimento