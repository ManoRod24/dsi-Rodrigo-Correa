
package com.mycompany.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {

    public String inserir(CarroBean carro) {
        String sql = "INSERT INTO carro (placa, cor, descricao) VALUES (?, ?, ?)";

        try (Connection conexao = Conexao.abrirConexao();
                PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, carro.getPlaca());
            stmt.setString(2, carro.getCor());
            stmt.setString(3, carro.getDescricao());

            stmt.executeUpdate();

            return "Carro cadastrado com sucesso!";

        } catch (SQLException e) {
            return "Erro ao cadastrar: " + e.getMessage();
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


    public List<CarroBean> listarTodos() {
        List<CarroBean> carros = new ArrayList<>();

        String sql = "SELECT placa, cor, descricao FROM carro";

        try (Connection conexao = Conexao.abrirConexao();
                PreparedStatement stmt = conexao.prepareStatement(sql);
                ResultSet resultado = stmt.executeQuery()) {

            while (resultado.next()) {
                CarroBean carro = new CarroBean();

                carro.setPlaca(resultado.getString("placa"));
                carro.setCor(resultado.getString("cor"));
                carro.setDescricao(resultado.getString("descricao"));

                carros.add(carro);
            }

        } catch (SQLException e) {
            throw new RuntimeException(
                    "Erro ao consultar carros: " + e.getMessage(), e);
        }

        return carros;
    }

    public String alterar(CarroBean carro, String placaOriginal) {
        String sql = "UPDATE carro SET placa = ?, cor = ?, descricao = ? WHERE placa = ?";

        try (Connection conexao = Conexao.abrirConexao();
                PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, carro.getPlaca());
            stmt.setString(2, carro.getCor());
            stmt.setString(3, carro.getDescricao());
            stmt.setString(4, placaOriginal);

            int linhasAlteradas = stmt.executeUpdate();

            if (linhasAlteradas > 0) {
                return "Carro alterado com sucesso!";
            }

            return "Nenhum carro foi alterado.";

        } catch (SQLException e) {
            return "Erro ao alterar carro: " + e.getMessage();
        }
    }

    public String excluir(String placa) {
        String sql = "DELETE FROM carro WHERE placa = ?";

        try (Connection conexao = Conexao.abrirConexao();
                PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, placa);

            int linhasExcluidas = stmt.executeUpdate();

            if (linhasExcluidas > 0) {
                return "Carro excluído com sucesso!";
            }

            return "Carro não encontrado.";

        } catch (SQLException e) {
            return "Erro ao excluir carro: " + e.getMessage();
        }
    }
}

//Rodrigo Correa do Nascimento