package ads.poo;

import java.util.Random;

public class Buzz {

    private boolean capaceteAberto = false;
    private String laser;
    private boolean bracoGolpes;
    private boolean asaAberta = false;
    private String[] frases = {"Ao infinito e além!", "Isto não é voar. Isto é cair, com estilo!",
     "Vamos decolar!", "Disparando laser", "golpeando", "Capacete aberto"};
    
    public boolean isCapaceteAberto() {
        return capaceteAberto;
    }

    public boolean abrirFecharCapacete() {
        capaceteAberto = !capaceteAberto;
        return capaceteAberto;
    }

    public String dispararLaser() {
        return "Disparando laser";
    }

    public String golpear() {
        return "Golpeando";
    }

    public boolean abrirFecharAsa() {
        asaAberta = !asaAberta;
        return asaAberta;
    }

    public String falarFrase() {
        Random r = new Random();
        return frases[r.nextInt(6)];
    }
    
}
