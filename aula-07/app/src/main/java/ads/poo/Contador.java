package ads.poo;

public class Contador {

    private int valorAtual;
    
    public void atribuirValor(int vAt) {
        valorAtual = vAt;
    }

    public void incrementarCont(int vIn) {
        valorAtual += vIn;
    }

    public int obterValorCont() {
        return valorAtual;
    }
}
