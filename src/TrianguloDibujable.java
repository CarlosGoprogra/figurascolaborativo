import java.awt.*;

public class TrianguloDibujable extends Triangulo {
    public TrianguloDibujable(double base, double altura, int x, int y) {
        super(base, altura, x, y);
    }

    public void dibujar2D(Graphics g) {
        int[] xs = {x, x + (int)base, x + (int)base / 2};
        int[] ys = {y + (int)altura, y + (int)altura, y};
        g.drawPolygon(xs, ys, 3);
    }
}