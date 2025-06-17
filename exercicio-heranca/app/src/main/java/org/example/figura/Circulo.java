package org.example.figura;

public class Circulo extends ObjetoDeDesenho {

    private Ponto centro;
    private double raio;

    public Circulo (String corDaLinha, Ponto centro, double raio) {
        super(corDaLinha);
        this.centro = centro;
        this.raio = raio;
    }

    @Override
    public String desenhar() {
        return "Desenhando um círculo com centro igual a " + this.centro + " e raio: " + this.raio;
    }


}
