package ads.poo;

public class App {

    public static void main(String[] args) {
        
        Ponto p = new Ponto(5, 3);

        Ponto p2 = new Ponto(6, 9);

        p.distancia(p2);

        System.out.println(p.toString());
    }
}
