package ads.poo;

public class Contador {

    private int valorAtual;
    
    public void atribuirValor(int v) {
        valorAtual = v;
    }

    public void incrementarCont(int v) {
        valorAtual+= v;
    }

    public void obterValorCont() {
        System.out.println(valorAtual);
    }
  
}
