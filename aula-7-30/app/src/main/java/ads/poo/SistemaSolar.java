package ads.poo;

public enum SistemaSolar {

    MERCURIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANO(7),
    NETUNO(8);

    private int posicaoRelacaoSol;

    SistemaSolar(int posicaoRelacaoSol) {
        this.posicaoRelacaoSol = posicaoRelacaoSol;
    }

    @Override
    public String toString() {
        return "posicaoRelacaoSol=" + posicaoRelacaoSol +
                '}';
    }
}
