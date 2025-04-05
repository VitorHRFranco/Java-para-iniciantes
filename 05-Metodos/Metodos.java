// 05 - Metodos.java
// Exemplo de criação e chamada de métodos

public class Metodos {

    // Método principal que será executado primeiro
    public static void main(String[] args) {
        // Chamando o método saudacao e passando um nome como argumento
        saudacao("Lucas");
        saudacao("Maria");

        // Chamando o método para somar dois números
        int resultado = somar(5, 3);
        System.out.println("Soma: " + resultado);

        // Chamando o método para verificar se um número é par
        boolean par = ehPar(10);
        System.out.println("O número 10 é par? " + par);
    }

    // Método que imprime uma saudação personalizada
    public static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    // EXERCÍCIO 1:
    // Crie um método que receba dois números inteiros como parâmetros e retorne a soma deles
    public static int somar(int a, int b) {
        return a + b;
    }

    // EXERCÍCIO 2:
    // Crie um método que receba um número inteiro e retorne true se for par, ou false se for ímpar
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}