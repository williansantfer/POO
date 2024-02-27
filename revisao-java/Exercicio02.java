import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notaP1, notaP2, participacao;

        System.out.println("Nota do Projeto Prático 1: ");
        notaP1 = teclado.nextDouble();
        System.out.println("Nota do Projeto Prático 2: ");
        notaP2 = teclado.nextDouble();
        System.out.println("Nota de participação: ");
        participacao = teclado.nextDouble();

        Double notaFinal = ((((notaP1 * 2) + (notaP2 * 3)) / 5) * 0.9) + (participacao * 0.1);

        System.out.println("Nota: " + notaFinal);

        if (notaFinal >= 6) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }

        teclado.close();
    }
}