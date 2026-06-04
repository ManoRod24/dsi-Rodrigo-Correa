package Exercícios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {

        Scanner Funcionario = new Scanner(System.in);

        //Entrada do código de funcionário.
        System.out.println("Escreva seu código: ");
        int codigo = Funcionario.nextInt();

        // limpa o buffer
        Funcionario.nextLine(); 

        //Entrada do sexo do funcionário.
        System.out.println("Sexo (masc/fem): ");
        String sexo = Funcionario.nextLine();

        //Tempo de trabalhado (em Anos).
        System.out.println("Digite seu tempo de trabalho(Anos): ");
        int tempo_trabalho = Funcionario.nextInt();

        //Entrada do salário do(a) Funcionário(a).
        System.out.println("Digite o seu salário: ");
        double salario = Funcionario.nextDouble();

        //Calcular bônus para funcionários.
        if (sexo.equalsIgnoreCase("masc") && tempo_trabalho > 15) {
            salario = (salario * 1.20);
        }

        else if (sexo.equalsIgnoreCase("fem") && tempo_trabalho > 10) {
            salario = (salario * 1.25);
        }
        
        else {
            salario = (salario + 100);
        }

        System.out.println("Olá, Funcionário(a) do código: " + codigo + ". Seu salário junto ao bônus é de: R$" + salario);

        Funcionario.close();
    }
}
