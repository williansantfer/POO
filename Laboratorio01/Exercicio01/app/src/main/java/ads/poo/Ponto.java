package ads.poo;

public class Ponto {
    
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Ponto p) {

        return Math.sqrt(Math.pow((this.getX() - p.getX()), 2) + Math.pow((this.getY() - p.getY()), 2));

    }

    @Override
    public String toString() {
        return "Ponto [" + x + ", " + y + "]";
    }

    public double getX() {
        return x;
    }

    public double setX(double x) {
        return this.x = x;
    }

    public double getY() {
        return y;
    }

    public double setY(double y) {
        return this.y = y;
    }
}
