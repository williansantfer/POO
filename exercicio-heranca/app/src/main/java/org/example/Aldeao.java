package org.example;

public class Aldeao extends Personagem {

    public Aldeao() {
        super(25, 1, 0.8);
    }

    @Override
    public String mover() {
        return "O aldeão se moveu correndo com velocidade " + this.velocidade;
    }

    @Override
    public String atacar() {
        return "O aldeâo atacou com um soco, nível de ataque: " + this.ataque;
    }
}
