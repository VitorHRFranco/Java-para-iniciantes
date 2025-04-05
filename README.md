# Java Para Iniciantes

Bem-vindo(a) ao repositório **Java-Para-Iniciantes**!  
Este projeto foi criado com o objetivo de ajudar estudantes que estão dando os primeiros passos no mundo da programação usando a linguagem **Java**.

Aqui você encontrará exemplos simples, bem comentados e organizados por tópicos para facilitar o aprendizado.

---

## 🚀 O que você vai aprender?

- Como funciona a **estrutura básica de um programa em Java**
- Como declarar **variáveis e tipos primitivos**
- Como usar **condicionais (if/else)**
- Como fazer **laços de repetição (for, while)**
- Como declarar e utilizar **métodos**

---

## 📌 Entendendo a Sintaxe Básica do Java

### 1. Estrutura de um programa

Todo programa em Java precisa ter:

- Uma **classe pública**
- Um método especial chamado `main`, que é o ponto de entrada da aplicação

```java
public class NomeDaClasse {
    public static void main(String[] args) {
        // Código vai aqui
    }
}
```

### 2. Tipos de variáveis

Alguns dos principais tipos primitivos em Java são:

```java
int idade = 20;            // número inteiro
double altura = 1.75;      // número com casa decimal
boolean ativo = true;      // verdadeiro ou falso
char inicial = 'A';        // caractere único
```

### 3. Impressão no console

Use `System.out.println()` para imprimir informações no terminal:

```java
System.out.println("Olá, mundo!");
```

### 4. Condições (if/else)

```java
int nota = 70;

if (nota >= 60) {
    System.out.println("Aprovado!");
} else {
    System.out.println("Reprovado.");
}
```

### 5. Repetições (laços)

#### For:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Contando: " + i);
}
```

#### While:

```java
int i = 1;
while (i <= 5) {
    System.out.println("Contando: " + i);
    i++;
}
```

### 6. Métodos

Métodos ajudam a organizar e reutilizar o código:

```java
public static void saudacao(String nome) {
    System.out.println("Olá, " + nome + "!");
}
```

Chamada do método:

```java
saudacao("Maria");
```

---

## 📁 Organização do Repositório

```
Java-Para-Iniciantes/
│
├── 01-HelloWorld/
├── 02-Variaveis/
├── 03-Condicionais/
├── 04-Repeticoes/
├── 05-Metodos/
```

Cada pasta contém exemplos com explicações no código para facilitar o entendimento.

---

## ✨ Contribuição

Se você quiser contribuir com mais exemplos ou correções, fique à vontade para abrir um pull request ou issue. A ideia é que este repositório cresça com a ajuda de todos os iniciantes e estudantes de Java!

---

## 📧 Contato

Caso tenha dúvidas ou sugestões, sinta-se livre para entrar em contato comigo por aqui mesmo no GitHub! 😄

