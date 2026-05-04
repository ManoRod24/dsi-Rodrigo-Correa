// Os operadores de atribuição são usados ​​para atribuir valores a variáveis.

public class Operadores_de_atribuicao {
  
  public static void main(String[] args) {
   // =
    int a = 5;

   // += Realiza uma soma à variável inicial, resultando em = 8.
    int b = 5;
    b += 3;

   // -= Realiza uma subtração à variável inicial, resultando em = 2.
    int c = 5;
    c -= 3;

   // *= Realiza uma multiplicação à variável inicial, resultando em = 15.
    int d = 5;
    d *= 3;

   // /= Realiza uma divisão à variável inicial, resultando em = 1.666...
    double e = 5;
    e /= 3;	

   // %= 
    int f = 5;
    f %= 3;

   // &= Faz a soma dos digitos "1" do código binário que formam os dois números.
    int g = 5;
    g &= 3;
    
   // |= 
    int h = 5;
    h |= 3;

   // ^=
    int i = 5;
    i ^= 3;

   // >>= Desloca os bits para a direita o número de vezes dito pela operação. Exemplo: 5 = 0101 -> 0000 = 0.
    int j = 5;
    j >>= 3;

   // <<= Desloca os bits para a esquerda o número de vezes dito pela operação. Exemplo: 5 = 0101 <- 1000 = 8.
    int k = 5;
    k <<= 3;

  }
}