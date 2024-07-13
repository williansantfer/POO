package ads.poo.produtos;

public class Celular extends SemFio{

    private String sistemaOperacinal;


    public Celular(int codigo, String numSerie, String modelo, double peso, Dimensao dim, double frequencia, int canais, double distancia, String sistemaOperacinal) {
        super(codigo, numSerie, modelo, peso, dim, frequencia, canais, distancia);
        this.sistemaOperacinal = sistemaOperacinal;
    }

    public String getSistemaOperacinal() {
        return sistemaOperacinal;
    }

    public void setSistemaOperacinal(String sistemaOperacinal) {
        this.sistemaOperacinal = sistemaOperacinal;
    }

    @Override
    public String toString() {
        return super.toString() + ", sistemaOperacinal=" + sistemaOperacinal;
    }
}
