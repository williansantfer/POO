package ads.poo;

public class Linha extends ObjetoDeDesenho {

    private Ponto inicio;
    private Ponto fim;

    public Linha(String corDalInha, Ponto inicio, Ponto fim) {
        super(corDalInha);
        this.inicio = inicio;
        this.fim = fim;
    }

    public Ponto getInicio() {
        return inicio;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public Ponto getFim() {
        return fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    @Override
    public String desenhar() {
        return "Ponto inicial = (" + inicio + ") (" + fim + ")";
    }
}
