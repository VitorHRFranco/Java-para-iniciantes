// 02 - TiposPrimitivos.java
// Demonstração de tipos primitivos em Java

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Declarando variáveis de tipos primitivos
        int idade = 25;              // Número inteiro
        double altura = 1.75;        // Número decimal
        boolean estudante = true;    // Valor booleano (verdadeiro ou falso)
        char inicial = 'J';          // Um único caractere

        // Exibindo os valores no console
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("É estudante? " + estudante);
        System.out.println("Inicial do nome: " + inicial);

        // EXERCÍCIO:
        // Crie suas próprias variáveis com seus dados pessoais (nome, idade, etc.)
        // e imprima no console de forma personalizada
        String nome = "Carlos";
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos e minha altura é " + altura + " metros.");
    }
}