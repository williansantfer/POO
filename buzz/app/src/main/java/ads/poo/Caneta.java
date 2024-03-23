package ads.poo;

public class Caneta {

    private final String COR;
    private int qtdTinta = 100;

    private final String MARCA_DA_CANETA = "bic"; //constante

    public Caneta(int qtdTinta, String cor) {
        this.qtdTinta = qtdTinta;
        this.COR = cor;
    }

    public Caneta(String cor) {
        this(100, cor);
    }

    public Caneta() {
//        this.qtdTinta = 100;
//        this.cor = "vermelha";
        this(100, "vermelha");
    }

    public String getCor() {
        return COR;
    }

    public int getQtdTinta() {
        return qtdTinta;
    }


    public void setQtdTinta(int qtdTinta) {
        // qtd de tinta >=0 && qtd de tinta <= 100
        this.qtdTinta = qtdTinta;
    }

    public String desenhar() {
        // TODO caneta não desenha sem tinta
        if (qtdTinta == 0) {
            return "Não tem tinta";
        }
        qtdTinta--;
        return "Desenhando na cor " + COR;
    } 
}
