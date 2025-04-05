// 04 - Repeticoes.java
// Exemplos de laços de repetição: for e while

public class Repeticoes {
    public static void main(String[] args) {

        // Exemplo com o laço for
        System.out.println("Contagem com for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Exemplo com o laço while
        System.out.println("\nContagem com while:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // EXERCÍCIO:
        // Crie um laço que imprima os números pares de 0 a 10 usando for ou while
    }
}