package ads.poo;

public class Ponto extends ObjetoDeDesenho{

    private int x;
    private int y;

    public Ponto(String corDalInha, int x, int y) {
        super(corDalInha);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String desenhar() {
        return "x = " + x + ", y = " + y;
    }
}
