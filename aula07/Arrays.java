package aula07;
public class Arrays {
    public static void main(String[] args) {

    //Chamando elemento específico dentro da variável.    
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    
    //Alterando elemento específico dentro da matriz.
    cars[0] = "Ferrari";
    
    System.out.println(cars[0]);
    }


} 


//Armazena vários elementos dentro de uma única variável.
//Para consultar um elemento específico, chame pelo seu número de índice

// Volvo = [0] -> Ferrari [0]
// BMW = [1]
// Ford = [2]
// Mazda = [3]