package aula07;

public class WhileLoop {
    public static void main  (String[] args) {
    int contagem_regressiva = 3;
    
    while (contagem_regressiva > 0) { //Enquanto Contagem regressiva for maior que 0:
      System.out.println(contagem_regressiva);
      contagem_regressiva--;
    }
    System.out.println("Feliz Ano Novo!");    
    }
}

//O while loop repete um bloco de código desde que a condição especificada seja verdadeira.
//Os loops são úteis porque economizam tempo, reduzem erros e fazem código mais legível.

//A while loop pode nunca ser executado se a condição for falsa desde o início.