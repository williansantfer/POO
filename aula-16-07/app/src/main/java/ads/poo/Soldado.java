package ads.poo;

public class Soldado extends Personagem implements Guerreiro {

    public Soldado(int vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
        
    }

    @Override
    public String atacar() {
        return "Eu sou o Soldado! ";
    }

    @Override
    public String mover() {
        return super.mover();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
