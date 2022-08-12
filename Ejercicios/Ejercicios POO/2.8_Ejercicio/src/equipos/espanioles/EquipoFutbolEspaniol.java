package equipos.espanioles;

import equipos.EquipoFutbol;

public class EquipoFutbolEspaniol extends EquipoFutbol
{
    private static String ranking_espaniol;

    public EquipoFutbolEspaniol(String nombre, int numero_jugadores, double presupuesto, String ranking_espaniol) {
        super(nombre, numero_jugadores, presupuesto);
        this.ranking_espaniol = ranking_espaniol;
    }

    public static String getRanking_espaniol() {
        return ranking_espaniol;
    }

    @Override
    public String toString() {
        return super.toString() + "Posicion en Liga: " + ranking_espaniol;
    }
}
