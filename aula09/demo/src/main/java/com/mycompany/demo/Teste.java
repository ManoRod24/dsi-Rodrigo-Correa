
package com.mycompany.demo;

public class Teste {

    public static void main(String[] args) {

        CarroBean carro = new CarroBean();

        carro.setPlaca("ABC1234");
        carro.setCor("Preto");
        carro.setDescricao("Carro de teste");

        CarroDAO dao = new CarroDAO();

        // Cadastra o carro
        dao.inserir(carro);

        // Lista os carros cadastrados
        dao.listar();
    }
}
