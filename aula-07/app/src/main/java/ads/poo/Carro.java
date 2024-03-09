package ads.poo;

public class Carro extends App {
    //Atributos

    private double velocidade;
    private String modelo;

    //Métodos
    public void acelerar(double v) {
        velocidade += v;
    }

    public double obterVelocidade() {
        return velocidade;
    }

    public void freiar() {
        velocidade = 0.0;
    }
}
