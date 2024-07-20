package ads.poo;

public class Arqueiro extends Personagem implements Guerreiro {

    public Arqueiro(int vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String atacar() {
        return "Eu sou o Arqueiro! " + atacar() + " com flechada!";
    }

    @Override
    public String mover() {
        return "Eu sou o Arqueiro! " + super.mover() + " correndo!";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
