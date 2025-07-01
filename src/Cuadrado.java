public class Cuadrado {
    protected int lado;
    protected int x;
    protected int y;

    public Cuadrado(int lado, int x, int y) {
        this.lado = lado;
        this.x = x;
        this.y = y;
    }

    public double getPerimetro() {
        return 4 * lado;
    }

    public double getArea() {
        return lado * lado;
    }
}