package org.example;

public class Cavaleiro extends Personagem {

    public Cavaleiro() {
        super(50,3, 2);

    }

    @Override
    public String mover() {
        return "O cavaleiro se moveu com o seu cavalo com velocidade " + this.velocidade;
    }

    @Override
    public String atacar() {
        return "O cavaleiro atacou com espada! Nível de ataque " + this.ataque;
    }


}
