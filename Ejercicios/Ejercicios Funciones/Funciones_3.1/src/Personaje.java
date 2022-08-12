public class Personaje
{
    private final static int vida = 20;
    private static String nombre;

    public final int getVida() {
        return vida;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Personaje.nombre = nombre;
    }
}
