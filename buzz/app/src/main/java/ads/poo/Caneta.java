package ads.poo;

public class Caneta {

    private String cor = "preta";
    private int qtdTinta = 100;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdTinta() {
        return qtdTinta;
    }


    public void setQtdTinta(int qtdTinta) {
        this.qtdTinta = qtdTinta;
    }

    public String desenhar() {
        // TODO caneta não desenha sem tinta
        qtdTinta--;
        return "Desenhando na cor " + cor;
    } 
}
