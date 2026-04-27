// É quando você converte um tipo menor para um maior, sem risco de perder informação.

public class Conversao_widening {
  
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; 

    System.out.println(myInt);
    System.out.println(myDouble);
  }
}

// Double: Armazena números fracionários. Suficiente para armazenar de 15 a 16 dígitos decimais.
