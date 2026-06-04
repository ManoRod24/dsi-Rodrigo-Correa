package Exercícios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {
        
        Scanner Triangulos = new Scanner(System.in);

        System.out.println("Digite lado A: ");
        double ladoA = Triangulos.nextDouble();

        System.out.println("Digite lado B: ");
        double ladoB = Triangulos.nextDouble();

        System.out.println("Digite lado C: ");
        double ladoC = Triangulos.nextDouble();

        //Ordenar em ordem descrescente.
        double aux;

            if (ladoA < ladoB) {
            aux = ladoA;
            ladoA = ladoB;
            ladoB = aux;
        }

        if (ladoA < ladoC) {
            aux = ladoA;
            ladoA = ladoC;
            ladoC = aux;
        }

        if (ladoB < ladoC) {
            aux = ladoB;
            ladoB = ladoC;
            ladoC = aux;
        }

        System.out.println("\nLados ordenados:");
        System.out.println("a = " + ladoA);
        System.out.println("b = " + ladoB);
        System.out.println("c = " + ladoC);

        //Classificação.
        if (ladoA > ladoB + ladoC) {
            System.out.println("Nenhum triangulo foi formado.");
        }

        else if (Math.pow(ladoA, 2) == Math.pow(ladoB, 2) + Math.pow(ladoC, 2)) {
            System.out.println("Um triângulo retângulo foi formado.");    
        }

        else if (Math.pow(ladoA, 2) > Math.pow(ladoB, 2) + Math.pow(ladoC, 2)) {
        System.out.println("Um triângulo obtusângulo foi formado.");
        }
        
        else if (Math.pow(ladoA, 2) < Math.pow(ladoB, 2) + Math.pow(ladoC, 2)) {
        System.out.println("Um triângulo ocutângulo foi formado.");
        }

        else if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Um triângulo equilátero foi formado.");
        }

        else {
            System.out.println("Um triângulo escaleno foi formado.");
        }

        Triangulos.close();
    }
}
