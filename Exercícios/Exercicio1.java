package Exercícios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args) {

      Scanner Questoes = new Scanner(System.in);    

    //Entrada do nome do usuário. 
    System.out.println("Digite seu nome: "); 
    String nomeUsuario = Questoes.nextLine();

    //Entrada da idade do usuário. 
    System.out.println("Digite sua idade: ");
    int idade_usuario= Questoes.nextInt();

    //Entrada de horas trabalhadas.
    System.out.println("Digite a quantidade de horas trabalhadas: ");    
    int horasTrabalhadas = Questoes.nextInt();

    //Entrada de valor recebido por hora.
    System.out.println("Digite o valor recebido por hora: ");
    double valorHora = Questoes.nextDouble();
    
    //Quantidade de filhos com menos de 14 anos.
    System.out.println("Digite a sua quantidade de filhos com menos de 14 anos: "); 
     int qtd_filhos = Questoes.nextInt();

    //Tempo de serviço na empresa. (Anos)
    System.out.println("Digite o seu tempo de empresa(Anos): ");
    int tempoServico = Questoes.nextInt();

    //Soma do salário de toda a família.
    System.out.println("Digite a renda total de sua família: ");
    double qtdsalario_porfilho = Questoes.nextDouble();Rodri

    double salario_familia = (qtd_filhos * qtdsalario_porfilho);

    double salario_bruto = (horasTrabalhadas * valorHora);

    double desconto_inps = (salario_bruto * 0.085);

    double imposto_renda = 0;

    //Calcular imposto de renda.
    if (salario_bruto > 1.500){
      imposto_renda = (salario_bruto * 0.15);
    }

    else if (salario_bruto > 500 && salario_bruto < 1500) {
      imposto_renda = (salario_bruto * 0.08);
    }

    else if (salario_bruto <= 500) {
      imposto_renda = 0;
    }

    double adicional = 0;

    //Calcular o adicional.
    if (idade_usuario > 40) {
      adicional = (salario_bruto * 0.02);
    }

    if (tempoServico > 15) {
      adicional = (salario_bruto * 0.035);
    }

    if (tempoServico > 5 && tempoServico < 15 && idade_usuario > 30) {
      adicional = (salario_bruto * 0.015);
    }
    
    double total_descontos = (desconto_inps + imposto_renda);

    double salario_liquido = (salario_bruto - total_descontos + salario_familia + adicional);

    System.out.println("Nome: " + nomeUsuario);
    System.out.println("Salário Bruto: " + salario_bruto);
    System.out.println("Total de Descontos: " + total_descontos);
    System.out.println("Adicional: " + adicional);
    System.out.println("Salário Líquido: " + salario_liquido);

    Questoes.close();

  }
}
