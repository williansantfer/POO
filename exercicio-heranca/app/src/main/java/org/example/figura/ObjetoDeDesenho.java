package org.example.figura;

public abstract class ObjetoDeDesenho {

    protected String corDalInha;

    public ObjetoDeDesenho(String corDalInha) {
        this.corDalInha = corDalInha;
    }

    public abstract String desenhar();

}
