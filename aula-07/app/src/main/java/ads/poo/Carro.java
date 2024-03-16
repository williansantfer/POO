package ads.poo;

public class Carro {

    //Atributos
    private int velocidade;
    //private String modelo;

    public Carro(int velocidade) {
        this.velocidade = velocidade;
    }

    public Carro() {
        this.velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int setVelocidade(int velocidade) {
        if (velocidade >= 0 && velocidade <= 200) {
            return velocidade;
        } else {
            return this.velocidade = 0;
        }
    }

    public int acelerar(int aceleracao) {
        if (aceleracao < 0) {
            return velocidade += 0;
        } else if (velocidade + aceleracao > 200) {
            return velocidade = 200;
        } else {
            return velocidade += aceleracao;
        }
    }

    public int frear(int frenagem) {
        if (frenagem < 0) {
            return velocidade;
        } else if (frenagem > 200) {
            return velocidade = 0;
        } else {
            return velocidade -= frenagem;
        }
    }

    @Override
    public String toString() {
        return "Carro {" + "velocidade = " + velocidade + "}"
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
