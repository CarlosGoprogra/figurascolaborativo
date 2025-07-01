import javax.swing.*;
import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado = 0, radio = 0, base = 0, altura = 0;

        // Ingreso y validación del lado del cuadrado
        while (true) {
            try {
                System.out.print("Ingrese el lado del cuadrado: ");
                lado = scanner.nextInt();
                if (lado <= 0) throw new IllegalArgumentException("El lado debe ser positivo.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número entero.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Ingreso y validación del radio del círculo
        while (true) {
            try {
                System.out.print("Ingrese el radio del círculo: ");
                radio = scanner.nextInt();
                if (radio <= 0) throw new IllegalArgumentException("El radio debe ser positivo.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número entero.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Ingreso y validación de base y altura del triángulo
        while (true) {
            try {
                System.out.print("Ingrese la base del triángulo: ");
                base = scanner.nextInt();
                if (base <= 0) throw new IllegalArgumentException("La base debe ser positiva.");
                System.out.print("Ingrese la altura del triángulo: ");
                altura = scanner.nextInt();
                if (altura <= 0) throw new IllegalArgumentException("La altura debe ser positiva.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número entero.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        CirculoDibujable circulo = new CirculoDibujable(radio, 50, 150);
        CuadradoDibujable cuadrado = new CuadradoDibujable(lado, 200, 150);
        TrianguloDibujable triangulo = new TrianguloDibujable(base, altura, 100, 50);

        try {
            System.out.println("El perímetro del círculo es: " + circulo.getPerimetro());
            System.out.println("El área del círculo es: " + circulo.getArea());
            System.out.println("El perímetro del cuadrado es: " + cuadrado.getPerimetro());
            System.out.println("El área del cuadrado es: " + cuadrado.getArea());
            System.out.println("El perímetro del triángulo es: " + triangulo.getPerimetro());
            System.out.println("El área del triángulo es: " + triangulo.getArea());
        } catch (Exception e) {
            System.out.println("Error en el cálculo: " + e.getMessage());
        }

        JFrame frame = new JFrame("Dibujar círculo, cuadrado y triángulo");
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                circulo.dibujar2D(g);
                cuadrado.dibujar2D(g);
                triangulo.dibujar2D(g);
            }
        };
        panel.setPreferredSize(new Dimension(400, 400));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}