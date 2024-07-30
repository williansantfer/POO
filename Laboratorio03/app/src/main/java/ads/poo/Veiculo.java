package ads.poo;

public abstract class Veiculo {

    protected int id;
    protected int velocidadeAtual;

    public abstract int acelerar(int i);
    public abstract int frear(int i);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
