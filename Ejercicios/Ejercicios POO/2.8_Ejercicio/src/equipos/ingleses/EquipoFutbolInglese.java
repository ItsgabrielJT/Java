package equipos.ingleses;

import equipos.EquipoFutbol;

public class EquipoFutbolInglese extends EquipoFutbol
{
    private static String ranking_ingles;

    public EquipoFutbolInglese(String nombre, int numero_jugadores, double presupuesto, String ranking_ingles) {
        super(nombre, numero_jugadores, presupuesto);
        this.ranking_ingles = ranking_ingles;
    }

    public static String getRanking_ingles() {
        return ranking_ingles;
    }

    @Override
    public String toString() {
        return super.toString() + "Posicion en Liga: " + ranking_ingles;
    }
}
