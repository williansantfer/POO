import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Entre com o ano que nasceu: ");
        int anoNasc = teclado.nextInt();

        System.out.println("Entre o ano atual: ");
        int anoAtual = teclado.nextInt();

        int idade = anoAtual - anoNasc;

        System.out.println(nome + ", possui " + idade + " anos.");

        teclado.close();

    }

}
