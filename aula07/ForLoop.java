package aula07;
public class ForLoop {
    public static void main(String[] args) {

      // Repete o loop até que (i) seja menor ou igual a 5.
      for (int i = 0; i <= 5; i++) {
      System.out.println(i);
    }

    // Escreve números pares entre 0 e 10.
      for (int i = 0; i <= 10; i = i + 2) {
      System.out.println(i);
    }  

    //Faz a soma dos números entre 0 e 5.
      int num = 0;
      for (int i = 1; i <= 5; i++) {
       num = num + i;
    }
      System.out.println("Soma é igual a: " + num);
  
  }
}

//Assim como um whileloop, a forloop também pode nunca ser executado. 
// Se a condição for **false** logo de início, o código dentro do loop será ignorado inteiramente:

