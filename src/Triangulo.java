public class Triangulo extends Figura {
    protected double base;
    protected double altura;
    protected int x;
    protected int y;

    public Triangulo(double base, double altura, int x, int y) {
        super(base);
        this.base = base;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        // Triángulo isósceles para ejemplo
        double lado = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        return base + 2 * lado;
    }
}