/*
    p (0.9):

        projeto1 (w1) (valor: 2)

        projeto2 (w2) (valor: 3)

    a (0,1):

        participação nas aulas


    cf:
        conceito final


 */


public class Exercicio2 {

    public static void main(String[] args) {

        double projeto1 = Integer.parseInt(args[0]);
        double projeto2 = Integer.parseInt(args[1]);
        double participacao = Integer.parseInt(args[2]);

        double cf = ((projeto1 * 2 + projeto2 * 3) * 0.9 + (participacao * 0.1));

    }

}
