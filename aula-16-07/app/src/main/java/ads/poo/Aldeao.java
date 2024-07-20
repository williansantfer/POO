package ads.poo;

public class Aldeao extends Personagem implements Guerreiro, Coletador {

    public Aldeao(int vida, double ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String atacar() {
        return "Eu sou o Aldeão! " + atacar() + " com um soco!";
    }

    @Override
    public String mover() {
        return "Eu sou o Aldeão! " + super.mover() + " caminhando!";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String coletarMadeira() {
        return "";
    }

    @Override
    public String coletarOuro() {
        return "";
    }
}
