package ads.poo;

public class Pampa extends Veiculo implements TracaoIntegral {

    private boolean cacamba;
    private boolean tracao;

    public boolean abrirFecharCacamba() {
        if (isCacamba()) {
            System.out.println("Caçamba fechada.");
            return this.cacamba = false;
        } else {
            return this.cacamba;
        }
    }


    public boolean isTracao() {
        return tracao;
    }

    public void setTracao(boolean tracao) {
        this.tracao = tracao;
    }

    public boolean isCacamba() {
        return cacamba;
    }

    public void setCacamba(boolean cacamba) {
        this.cacamba = cacamba;
    }
}
