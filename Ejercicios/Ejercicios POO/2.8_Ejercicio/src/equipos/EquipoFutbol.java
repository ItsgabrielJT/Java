package equipos;

public class EquipoFutbol
{
    protected static String nombre;
    protected static int numero_jugadores;
    protected static double presupuesto;

    public EquipoFutbol(String nombre, int numero_jugadores, double presupuesto) {
        this.nombre = nombre;
        this.numero_jugadores = numero_jugadores;
        this.presupuesto = presupuesto;
    }

    public static String getNombre() {
        return nombre + '\n';
    }

    public static int getNumero_jugadores() {
        return numero_jugadores + '\n';
    }

    public static double getPresupuesto() {
        return presupuesto + '\n';
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\n - Numero de jugadores: " + numero_jugadores +
                "\n - Presupuesto: " + presupuesto;
    }
}
