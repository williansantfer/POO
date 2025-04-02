import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com a nota de cada aluno separada por espaço: ");
        String notas = teclado.nextLine();

        String notasAlunos[] = notas.split(" ");

        int[] notasInteiras = new int[notasAlunos.length];

        for (int i = 0; i < notasInteiras.length; i++) {
            notasInteiras[i] = Integer.parseInt(notasAlunos[i]);
        }

        int zeroADois = 0;
        int tresACinco = 0;
        int seisAOito = 0;
        int noveADez = 0;

        for (int i = 0; i < notasAlunos.length; i++) {
            if (notasInteiras[i] <= 2) {
                zeroADois++;
            } else if (notasInteiras[i] <= 5) {
                tresACinco++;
            } else if (notasInteiras[i] <= 8) {
                seisAOito++;
            } else if (notasInteiras[i] <= 10) {
                noveADez++;
            }
        }

        System.out.println();
        System.out.println("  HISTOGRAMA  ");
        System.out.println();

        System.out.print("0 - 2    | ");
        for (int i = 0; i < zeroADois; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("3 - 5    | ");
        for (int i = 0; i < tresACinco; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("6 - 8    | ");
        for (int i = 0; i < seisAOito; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("9 - 10   | ");
        for (int i = 0; i < noveADez; i++) {
            System.out.print("*");
        }
        System.out.println();

        teclado.close();;
    }
}
