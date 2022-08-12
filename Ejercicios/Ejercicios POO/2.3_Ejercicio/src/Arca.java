import java.util.ArrayList;
import java.util.List;

public class Arca
{
    private static int cantidadTotal;
    private static double pesoTotal;
    public static ArrayList<Animal> animales;

    private static double calcularPesoTotal() {
        double sumatoriaPeso = 0.0;
        for ( int i = 0; i < animales.size(); i++ ) {
            sumatoriaPeso += animales.get(i).getPeso();
        }
        return sumatoriaPeso;
    }

    public Arca() {
        this.animales = new ArrayList<>();
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public static void mostrarAnimales() {
        int i = 0; // Muestra la lista con numeros
        for (Animal a: animales) {
            System.out.println(++i + ".- Animal" + "\n" + a);;
        }
        System.out.println("Peso total: " + calcularPesoTotal() +
                "\nCantidad de animales: " + animales.size());
    }
}
