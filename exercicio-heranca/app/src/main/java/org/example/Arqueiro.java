package org.example;

public class Arqueiro extends Personagem {

    public Arqueiro() {
        super(35, 2, 1);
    }

    @Override
    public String mover() {
        return "O arqueiro se moveu caminhando com velocidade " + this.velocidade;
    }

    @Override
    public String atacar() {
        return "O arqueiro atacou com uma flecha! Nível de ataque " + this.ataque;
    }

}
