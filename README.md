# desenvolvimento de software I
Aulas de Desenvolvimento de Software I com o professor João Siles utilizando Java.

Atividade da aula 01 -09/03
# Configuração do Java

A primeira coisa que nós devemos fazer a instalação do JDK, que pode ser encontrado no site OracleCorporation. Baixamos o arquivo e instalamos.

Em seguida temos que configurar o JAVA_HOME no nosso painel de controle, configurar o Path e depois testar.

É necessário fazer a instalação de uma extensão Extension Pack for Java
No terminal do vs code é necessário realizar comandos para que seu código rode normalmente.

## Clicando Ctrl + ("), abrimos o terminal do VS CODE.

Vamos seguir essa sequência:
- cd aula01
- javac .\Main.java
- java Main.java.


## Regras básicas do Java

- O nome do arquivo tem que ser igual ao nome da classe.
- toda instrução termina com (;)
- Os blocos de códigos são definidos por chaves({}).

## Como o Java funciona?

- Primeiro o código é escrito e salvo como .java
- O compilador do Java que é o javac transforma em bytecode
- A JVM (Java Virtual Machine) executa esse código.

## Comparadores Lógicos
- (==) --> igual
- (===) --> estritamente igual
- (=>) ou (<= -->) maior igual ou menor igual
- (||) --> Ou
- (&&) --> E
- 0 || 1 --> 1 bit
- 8 bit --> 1 byte

## If e Else
Essas intruções são usadas para controlar o fluxo do programa, que decide qual código é executado e qual código é ignorado.

- IF == Se. 
Precisa de uma condição que resultem em **true** ou **false**. Isso significa que as declarações trabalham com **boolean**.

- Else == Senão.
É o código que irá rodar se a condição for **false**. 

- Exemplo: "Se está chovendo, leve o guarda-chuva. Senão, não pegue nada".

  # Conceitos de orientação de Objetos

É um paradigma de programação que organiza o código em objetos, que representam entidades do mundo real. Em java, esse é o principal modelo de desenvolvimento.

## Objeto

É uma **instância** de uma classe.
**Exemplo**: Carro

 - Fabricante
 - Modelo
 - Cor
 - Motorização
 - Velocidade

## Métodos

São as **ações** que o objeto pode realizar
**Exemplo**:

 - Filtrar Por Fabricantes
 - Acelerar(Velocidade)
 - Freiar(Velociade)

## Herança

É um mecanismo que permite que uma classe **herde atributos** e **métodos** de outra classe. Ela é usada para **reutilizar código**.

**Exemplo**:
```java
class Animal {
    String nome;

    void comer() {
        System.out.println(nome + " está comendo.");
    }
}
```

- Rodrigo Correa 2DA
