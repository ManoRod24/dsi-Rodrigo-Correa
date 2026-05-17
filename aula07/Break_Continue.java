package aula07;
public class Break_Continue {
    public static void main(String[] args) {

        //Interrompe o loop quando ié igual a 4:
        for (int i = 0; i < 10; i++) {
            if (i == 4){
            break;    
            }
       
        System.out.println(i);
        }
    

        //Pula o número e continua o loop.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
        System.out.println(i);    
        }
}
}
//Break: parar o código.
//Continue: pular um número e continuar o loop.