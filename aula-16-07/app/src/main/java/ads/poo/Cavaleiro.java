package ads.poo;

public class Cavaleiro extends Personagem implements Guerreiro {

    public Cavaleiro(int vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String atacar() {
        return "Eu sou o Cavaleiro! " + atacar() + " com espada!";
    }

    @Override
    public String mover() {
        return "Eu sou o Cavaleiro! " + super.mover() + " galopando!";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
