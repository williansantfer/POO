package org.example.figura;

public class Triangulo extends ObjetoDeDesenho{

    private Ponto v1;
    private Ponto v2;
    private Ponto v3;

    public Triangulo(String corDaLinha, Ponto v1, Ponto v2, Ponto v3) {
        super(corDaLinha);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String desenhar() {
        return "Desenhando um triângulo com os vértices " + this.v1 + ", " +
                this.v2 + ", " + this.v3;
    }


}
