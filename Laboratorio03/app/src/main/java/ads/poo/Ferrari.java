package ads.poo;

public class Ferrari extends Veiculo implements Convesivel {

    private boolean farol;
    private boolean capota = true;

    public boolean ligarDesligarFarol() {
        if (isFarol()) {
            System.out.println("Faróis apagados.");
            return this.farol = false;
        } else {
            System.out.println("Faróis acesos");
            return this.farol;
        }
    }

    @Override
    public boolean abrirFecharCapota() {
        if (isCapota()) {
            System.out.println("A capota da Ferrari foi fechada");
            return this.capota = false;
        } else {
            System.out.println("A capota da Ferrari foi aberta");
            return this.capota = true;
        }
    }

    @Override
    public int frear(int i) {
        return 0;
    }

    @Override
    public int acelerar(int i) {
        return 0;
    }

    public boolean isFarol() {
        return farol;
    }

    public void setFarol(boolean farol) {
        this.farol = farol;
    }

    public boolean isCapota() {
        return capota;
    }

    public void setCapota(boolean capota) {
        this.capota = capota;
    }
}
