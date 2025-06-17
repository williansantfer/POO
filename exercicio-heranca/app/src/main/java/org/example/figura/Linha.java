package org.example.figura;

public class Linha extends ObjetoDeDesenho {

    private Ponto inicio;
    private Ponto fim;

    public Linha(String corDaLinha, Ponto inicio, Ponto fim) {
        super(corDaLinha);
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public String desenhar() {
        return "Desenhando uma linha com inicio em " + this.inicio + " e fim em " + this.fim;
    }


}
