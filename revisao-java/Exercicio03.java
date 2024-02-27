import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();

        int numeroSorteado = r.nextInt(100)+1;
        boolean acertou = false;
        List<Number> tentativas = new ArrayList<>();

        while (!acertou) {
            
            System.out.print("Digite um número: ");
            Integer palpite = Integer.parseInt(teclado.nextLine());
            
            if (palpite == numeroSorteado) {
                acertou = true;
                System.out.println("Acertou! " + palpite + " é o número sorteado.");
            } else {
                int cont = 0;
                tentativas.add(palpite);
      
                for(int i = 0; i < tentativas.size(); i++) {

                    if (tentativas.get(i) == palpite) {
                        cont++;
                    }
                }
                                
                if (cont == 1 || cont == 0) {
                    System.out.println("Incorreto. Tente outra vez.");
                } else {
                    System.out.println("Você já escolheu " + cont + " vezes o número " + palpite + ", tente outro número.");
                }
            }
        }
    }
}