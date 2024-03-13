package ads.poo;

public class App {
    public static void main(String[] args) {

        /*Buzz b = new Buzz();

        System.out.println(b.dispararLaser());

        System.out.println("Capacete aberto? " + b.isCapaceteAberto());
        b.abrirFecharCapacete();
        System.out.println("capacete aberto? " + b.isCapaceteAberto());

        Buzz malvado = new Buzz();

        System.out.println("Capacete aberto? " + malvado.isCapaceteAberto());

        Caneta c = new Caneta();

        c.setCor("Verde");*/

        Pessoa p = new Pessoa();

        p.setNome("Juca");
        p.setEmail("juca@gmail.com");
        p.setCpf("978.367.987-78");

        System.out.println(p.toString());

    }
}
