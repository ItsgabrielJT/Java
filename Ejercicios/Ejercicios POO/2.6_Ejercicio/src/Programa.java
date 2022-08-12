import java.util.ArrayList;

public class Programa
{
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Circulo(5.0));
        figuras.add(new Cuadrado(12.2));
        figuras.add(new Rectangulo(12.1, 3.45));
        figuras.add(new Triangulo(15.0, 23.4, 34.5));

        for (FiguraGeometrica f: figuras) {
            System.out.println(f.getArea() + "\n" + f.getPerimetro() + "\n");
        }
    }
}
