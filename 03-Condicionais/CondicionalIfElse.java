// 03 - CondicionalIfElse.java
// Exemplo de uso da estrutura condicional if/else

public class CondicionalIfElse {
    public static void main(String[] args) {
        int nota = 70;  // Nota do aluno

        // Verifica se a nota é maior ou igual a 60
        if (nota >= 60) {
            // Se for, imprime que está aprovado
            System.out.println("Aprovado!");
        } else {
            // Caso contrário, imprime que está reprovado
            System.out.println("Reprovado.");
        }

        // EXERCÍCIO:
        // Altere o valor da nota e adicione mais condições, como:
        // Se nota >= 90: "Excelente!", entre 60 e 89: "Aprovado!", senão: "Reprovado."
    }
}