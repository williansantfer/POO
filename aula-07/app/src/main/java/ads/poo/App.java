package ads.poo;

public class App {
    public static void main(String[] args) {

        Carro c = new Carro();

        c.acelerar(200);

        c.frear(20);

        System.out.println(c.toString());






        /*Carro c = new Carro();
        Carro d = new Carro();

        System.out.println("Velocidade: " + c.obterVelocidade());

        c.acelerar(10);

        System.out.println("Velocidade: " + d.obterVelocidade());*/

        /*Contador cont = new Contador();

        cont.atribuirValor(10);

        System.out.println(cont.obterValorCont());

        cont.incrementarCont(20);

        System.out.println(cont.obterValorCont());*/

    }
}
