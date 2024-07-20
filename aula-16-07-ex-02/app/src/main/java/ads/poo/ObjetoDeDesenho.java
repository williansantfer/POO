package ads.poo;

public abstract class ObjetoDeDesenho {

    protected String corDalInha;

    public ObjetoDeDesenho(String corDalInha) {
        this.corDalInha = corDalInha;
    }

    public abstract String desenhar();
}
