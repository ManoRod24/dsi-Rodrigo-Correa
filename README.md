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

## Java e Spring Boot

Em Java, `@` representa uma **anotação (Annotation)**.

As anotações são utilizadas antes de classes, métodos, atributos ou outros blocos de código para fornecer **informações ou instruções sobre o código**.

 As anotações não necessariamente alteram diretamente a lógica do código, mas podem ser utilizadas por frameworks, como o Spring, para definir comportamentos.


## Spring Initializr

O **Spring Initializr** é uma ferramenta utilizada para criar e configurar a estrutura inicial de projetos **Spring Boot**.

Ele permite escolher:

-   Sistema de build/gerenciamento do projeto
    
-   Versão do Java
    
-   Tipo de empacotamento
    
-   Metadados do projeto
    
-   Dependências
    

## Build Tools

As principais opções encontradas no Spring Initializr são:

### Maven

Ferramenta utilizada para **gerenciar dependências e realizar o build do projeto Java**.

### Gradle

Outra ferramenta de gerenciamento e automação de build para projetos Java.

O Gradle pode utilizar diferentes linguagens para configuração:

-   **Groovy**
    
-   **Kotlin**
    

> Maven e Gradle possuem abordagens diferentes, mas podem ser utilizados para alcançar resultados semelhantes na construção e gerenciamento de projetos Java.


## Spring Boot

O **Spring Boot** facilita a criação e configuração de aplicações utilizando o ecossistema Spring.

### Versões

Ao escolher uma versão, podemos encontrar versões como:

-   `SNAPSHOT`
    
-   Versões estáveis
    

### SNAPSHOT

São versões de desenvolvimento, que podem receber alterações e atualizações antes de uma versão final.

Para projetos de estudo ou produção, normalmente é preferível utilizar uma **versão estável**, a menos que exista um motivo específico para utilizar uma `SNAPSHOT`.

## Project Metadata

Os metadados são as informações utilizadas para identificar e estruturar o projeto.

Uma forma de visualizar isso é pensar em uma **"Boneca Russa"**, onde uma informação está relacionada à outra.

## Artifact

É o nome/identificador principal do projeto.

Exemplo:

```text
demo

```

## Package Name

É o nome do pacote principal do projeto.

Normalmente segue a convenção:

```text
com.exemplo.projeto

```

O package name funciona como uma espécie de **"sobrenome"**, ajudando a organizar e identificar as classes dentro do projeto.

## Packaging — Empacotamento

Define o formato em que a aplicação será empacotada.

Os formatos mais comuns são:

### JAR

**Java Archive**.

É um formato muito utilizado para empacotar aplicações Java, incluindo classes, recursos e dependências necessárias.

### WAR

**Web Application Archive**.

É utilizado principalmente para aplicações web que serão implantadas em servidores de aplicação/containers compatíveis.

> JAR e WAR não são exatamente a mesma coisa: o uso depende da forma como a aplicação será executada e implantada.

##  Configuration

A configuração define informações utilizadas para montar o projeto.

Entre elas estão:

-   Linguagem
    
-   Versão do Java
    
-   Tipo de empacotamento
    
-   Identificação do projeto
    
-   Dependências
    

##  Java

O Spring Initializr permite escolher a versão do Java utilizada no projeto.

Uma opção comum é:

```text
Java 21

```

É importante escolher uma versão adequada porque:

-   Versões muito antigas podem apresentar problemas de segurança e deixar de receber suporte.
    
-   Versões muito novas podem ter menor compatibilidade com algumas ferramentas ou bibliotecas.
    
-   Versões **LTS (Long-Term Support)** são geralmente uma boa escolha para projetos.
    

##  Dependencies

As **Dependencies (dependências)** são bibliotecas e componentes adicionados ao projeto para fornecer funcionalidades prontas.

Em vez de desenvolver tudo do zero, podemos adicionar dependências que disponibilizam recursos para o desenvolvimento.

Exemplo:

```text
Spring Web

```

A dependência **Spring Web** fornece recursos para criação de aplicações web e APIs utilizando o Spring.

##  O que é Maven?

O **Maven** é uma ferramenta utilizada principalmente para:

-   Gerenciar dependências;
    
-   Compilar o projeto;
    
-   Executar testes;
    
-   Empacotar a aplicação;
    
-   Automatizar etapas do processo de build.
    

As configurações do Maven ficam normalmente no arquivo:

```text
pom.xml

```

## O que é Spring?

O **Spring** é um ecossistema de ferramentas e frameworks para desenvolvimento de aplicações Java.

Ele oferece recursos para facilitar a criação de aplicações, como:

-   APIs;
    
-   Aplicações web;
    
-   Injeção de dependências;
    
-   Configuração de componentes;
    
-   Acesso a bancos de dados;
    
-   Segurança.
    

O **Spring Boot** facilita ainda mais o uso do Spring, fornecendo configurações e recursos que reduzem a quantidade de configuração necessária para iniciar um projeto.


## Criando um projeto Spring Boot no VS Code

Para criar um projeto pelo **VS Code**:
1.  Abra o VS Code.
2.  Pressione:
```text
Ctrl + Shift + P
```
3.  Pesquise por:
```text
Spring Initializr
```
4.  Escolha a opção para criar um projeto com **Maven**.  
5.  Selecione:   
```text
Spring Boot: 4.1.0
```
6.  Escolha a linguagem:
```text
Java
```
7.  Escolha a versão:   
```text
Java 21
```
8.  Escolha o empacotamento:
```text
JAR
```
9.  Defina o nome/identificação do projeto. 
Exemplo:
```text
com.app
```
10.  Defina o nome do projeto: 
```text
demo
```
11.  Adicione a dependência:
    
```text
Spring Web
```
12.  Escolha onde o projeto será salvo no computador.  
13.  Abra a pasta do projeto no VS Code.
   


- Rodrigo Correa 2DA
