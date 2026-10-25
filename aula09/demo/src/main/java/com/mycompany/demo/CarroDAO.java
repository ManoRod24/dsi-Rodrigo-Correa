
package com.mycompany.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarroDAO {

    public void inserir(CarroBean carro) {
        String sql = "INSERT INTO carro (placa, cor, descricao) VALUES (?, ?, ?)";

        try (Connection conexao = Conexao.abrirConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, carro.getPlaca());
            stmt.setString(2, carro.getCor());
            stmt.setString(3, carro.getDescricao());

            stmt.executeUpdate();
            System.out.println("Carro cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar carro: " + e.getMessage());
        }
    }

    public void listar() {
        String sql = "SELECT placa, cor, descricao FROM carro";

        try (Connection conexao = Conexao.abrirConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet resultado = stmt.executeQuery()) {

            while (resultado.next()) {
                System.out.println("Placa: " + resultado.getString("placa"));
                System.out.println("Cor: " + resultado.getString("cor"));
                System.out.println("Descrição: " + resultado.getString("descricao"));
                System.out.println("-------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar carros: " + e.getMessage());
        }
    }
}
