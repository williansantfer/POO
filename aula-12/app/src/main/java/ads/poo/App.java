package ads.poo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        /*ArrayList<String> nomes = new ArrayList<>();

        String s = "Juca";

        nomes.add(s);
        nomes.add("Emerson");
        nomes.add("Ana");

        // for i
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i));
        }

        // for each
        for (String elemento : nomes) {
            System.out.println("Nome " + elemento);
        }

        // Usando lambida
        nomes.forEach(elemento->System.out.println("Nome: " + elemento));

        // method reference
        nomes.forEach(System.out::println);*/


        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        int n = 0;

        while (n != 99) {
            System.out.println("Digite um número: ");
            n = teclado.nextInt();

            
            if (n != 99) {
                numeros.add(n);
            }

        }

        Collections.sort(numeros);

        numeros.forEach(System.out::println);

        // exercicio 2 - fazer usuario digitar numeros em ordem e resultar na ordem reversa;

        

        /*System.out.println(nomes);

        String[] v = (String[]) nomes.toArray();*/

        /*nomes.remove(s);

        int pos = nomes.indexOf(s);
        nomes.remove(pos);*/

        /*nomes.removeAll(nomes);

        if (!nomes.isEmpty()) {
            nomes.clear();
        }*/

    }

}
