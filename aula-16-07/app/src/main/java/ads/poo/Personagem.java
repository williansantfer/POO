package ads.poo;

public class Personagem {

    private int vida;
    private double ataque;
    private double velocidade;

    public Personagem(int vida, double ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public String atacar() {
        return "Ataquei";
    }

    public String mover() {
        return "Me movi";
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "vida=" + vida +
                ", ataque=" + ataque +
                ", velocidade=" + velocidade +
                '}';
    }
}
