package ads.poo;

public class Carro {

    //Atributos
    private int velocidade;
    private int velocidadeAtual;
    //private String modelo;

    public void setVelocidade(int velocidade) {
        if (velocidade >= 0 || velocidade <= 200) {
            velocidade = 0;
        } else {
            this.velocidade = velocidade;
        }
    }

    public Carro() {
        this.velocidade = 0;
    }

    public void acelerar(int inc) {
        if (inc < 0) {
        }

        this.velocidade += inc;
    }

    public void frear(int frear) {
        this.velocidade -= frear;
    }

    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "velocidade=" + velocidade +
                '}';
    }

    //Métodos

    /*public void acelerar(double v) {
        velocidade += v;
    }

    public void frear(double v) {
        velocidade -= v;
    }

    public double obterVelocidade() {
        return velocidade;
    }*/
}
