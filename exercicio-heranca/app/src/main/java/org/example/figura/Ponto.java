package org.example.figura;

public class Ponto extends ObjetoDeDesenho {

    private double x;
    private double y;

    public Ponto(String corDaLinha, double x, double y) {
        super(corDaLinha);
        this.x = x;
        this.y = y;
    }

    @Override
    public String desenhar() {
        return "Desenhando um ponto em (" + this.x + ", " + this.y + ")";
    }

}
