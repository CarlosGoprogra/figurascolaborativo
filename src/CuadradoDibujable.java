import java.awt.*;

public class CuadradoDibujable extends Cuadrado {

    public CuadradoDibujable(int lado, int x, int y) {
        super(lado, x, y);
    }

    public void dibujar2D(Graphics g) {
        g.drawRect(x, y, lado, lado);
    }
}