// É quando você converte um tipo maior para menor, sem risco de perder informação.

public class Conversao_narrowing {

  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; 

    System.out.println(myDouble);
    System.out.println(myInt);
  }
}

// Double: Armazena números fracionários. Suficiente para armazenar de 15 a 16 dígitos decimais. Exemplo:
