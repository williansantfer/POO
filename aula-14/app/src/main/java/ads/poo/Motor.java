package ads.poo;

public class Motor {

    private int hp;
    private int cilindradas;

    public Motor(int hp, int cilindradas) {
        this.hp = hp;
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "hp=" + hp +
                ", cilindradas=" + cilindradas +
                '}';
    }
}
