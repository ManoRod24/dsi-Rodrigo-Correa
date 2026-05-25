package Exercícios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args) {

      Scanner Questoes = new Scanner(System.in);    

    String nomeUsuario;
    int idadeUsuario;
    float horasTrabalhadas;
    float valorHora;
    int qtdFilhos;
    int tempoServico;
    float salarioFamilia;
    float salarioBruto;

    //Entrada do nome do usuário. 
    System.out.println("Digite seu nome: "); 
    nomeUsuario = Questoes.nextLine();

    //Entrada da idade do usuário. 
    System.out.println("Digite seu nome: ");
    idadeUsuario= Questoes.nextInt();

    //Entrada de horas trabalhadas.
    System.out.println("Digite a quantidade de horas trabalhadas: ");    
    horasTrabalhadas = Questoes.nextFloat();

    //Entrada de valor recebido por hora.
    System.out.println("Digite o valor recebido por hora: ");
    valorHora = Questoes.nextFloat();
    
    //Quantidade de filhos com menos de 14 anos.
    System.out.println("Digite a sua quantidade de filhos com menos de 14 anos: "); 
    qtdFilhos = Questoes.nextInt();

    //Tempo de serviço na empresa.
    System.out.println("Digite o seu tempo de empresa(Anos): ");
    tempoServico = Questoes.nextInt();

    //Soma do salário de toda a família.
    System.out.println("Digite a renda total de sua família: ");
    salarioFamilia = Questoes.nextFloat();

    salarioBruto = (horasTrabalhadas * valorHora);

    System.out.println(salarioBruto);
  }
}
