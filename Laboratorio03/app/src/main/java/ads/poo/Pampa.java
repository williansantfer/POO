package ads.poo;

public class Pampa extends Veiculo implements TracaoIntegral {

    private boolean cacamba;
    private boolean tracao;

    public Pampa(boolean cacamba, boolean tracao) {
        this.cacamba = cacamba;
        this.tracao = tracao;
    }

    public boolean abrirFecharCacamba() {
        if (isCacamba()) {
            System.out.println("A Caçamba da Pampa foi fechada.");
            return this.cacamba = false;
        } else {
            System.out.println("A caçamba da Pampa foi aberta.");
            return this.cacamba;
        }
    }

    @Override
    public int acelerar(int i) {
        System.out.println("A Pampa acelerou!");
        return this.velocidadeAtual += i;
    }

    @Override
    public int frear(int i) {
        System.out.println("A Pampa freiou!");
        return this.velocidadeAtual -= i;
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

    @Override
    public boolean ativarDesativarTracao() {
        if (isTracao()) {
            return this.tracao = false;
        } else {
            return this.tracao = true;
        }
    }
}
