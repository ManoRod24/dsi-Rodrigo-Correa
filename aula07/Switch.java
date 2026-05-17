package aula07;

public class Switch {
    public static void main(String[] args) {
    int pedido = 3;

    switch (pedido) {
      case 1:
        System.out.println("Seu pedido é: Hamburguer.");
      break;

      case 2:
        System.out.println("Seu pedido é: Pizza.");
      break;

      case 3:
        System.out.println("Seu pedido é: Macarrão.");
      break;

      case 4:
        System.out.println("Seu pedido é: Torta.");
      break;
      
      default: //Caso Contrário, se nenhum caso for atendido.
        System.out.println("Você não fez um pedido.");
    }
    }
}

//Em vez de escrever muitos if..else, você pode usar o switch.

//Pense nisso como pedir comida em um restaurante: Se você escolher o número 1, você recebe Hamburguer. 
// Se você escolher 2, você recebe uma Pizza. Se você escolher 3, você recebe Macarrão. Caso contrário, não recebe nada.

//O switch instrução seleciona um dos muitos blocos de código a serem executados.

//Break encerra o código.
