package org.example.figura;

public class Retangulo extends ObjetoDeDesenho {

    private Ponto verticeI;
    private Ponto verticeF;

    public Retangulo(String corDaLinha, Ponto verticeI, Ponto verticeF) {
        super(corDaLinha);
        this.verticeI = verticeI;
        this.verticeF = verticeF;

    }

    @Override
    public String desenhar() {
        return "Desenhando um retângulo com vértice inicial = " + this.verticeI +
                " e vértice final = " + this.verticeF;
    }


}
