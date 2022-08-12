import java.util.function.Function;

public class Main
{
    public static void main(String[] args) {
        Personaje steve = new Personaje();
        Espada madera = new EspadaMadera();
        Integer vida = madera.danioPersonaje(steve);
        System.out.println(vida);
        System.out.println("-------------------------------------");
        restaurar.apply(vida);
        System.out.println(vida);
    }

    static Function<Integer, Integer> restaurar = vida -> vida++;
}
