import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anoNasc, anoAtual, idade;
        String nome;

        System.out.print("Entre com o seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Entre com o ano que nasceu: ");
        anoNasc = teclado.nextInt();
        System.out.print("Entre com o ano atual: ");
        anoAtual = teclado.nextInt();

        idade = anoAtual - anoNasc;

        System.out.println(nome + ", possui " + idade + " anos.");
        
        teclado.close();
    }
}