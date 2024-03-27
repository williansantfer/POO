package ads.poo;

public class App {
    public static void main(String[] args) {
        
        Horario h = new Horario(22, 45, 33);

        System.out.println(h.toString());

        h.setHora(1);

        h.setMinuto(30);

        System.out.println(h.toString());

        System.out.println(h.horarioParaSegundos());
    }
}
