// 1.- Palabra instamce of
// Nos auda a comprobar si una clase hereda de otra

// 2.- Comprobaciones
// Es recomendable que si queermos comprobar que una clase hereda de otras debemos de haverlo asi:
// De menor jerarquia a mayor querarquia

public class Main
{
    public static void main(String[] args) {
        FiguraGeometrica figura = new Elipse();
        determinarTipo(figura);
    }

    public static void determinarTipo (FiguraGeometrica figura) {
        if (figura instanceof Elipse)
            System.out.println("Es una elipse");
        if (figura instanceof Circulo)
            System.out.println("Es un circulo");
        if (figura instanceof FiguraGeometrica)
            System.out.println("Es una firgura geomettica");
        // Este ultimo es solo para demostar que el Elipse no ereda de Cuadrado
        if (figura instanceof Cuadrado)
            System.out.println("Es un cuadrado");
    }
}
