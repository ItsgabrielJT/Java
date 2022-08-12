import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cancha
{
    public static void main(String[] args) {
        Map<String, Equipo> jugadores = new LinkedHashMap<>();
        jugadores.put("Ter Steegen", new Equipo("Portero", 1));
        jugadores.put("Dani Alvez", new Equipo("Defensa Izquierdo", 4));
        jugadores.put("Jordi Alba", new Equipo("Defensa Derecho", 5));
        jugadores.put("Pique", new Equipo("Defensa central", 3));
        jugadores.put("Sergio Busquets", new Equipo("Medio campitsa", 7));
        jugadores.put("Iniesta", new Equipo("Medio derecho", 8));
        jugadores.put("Rakitic", new Equipo("Medio izquierdo", 14));
        jugadores.put("Messi", new Equipo("Delantero derechi", 10));
        jugadores.put("Neymar", new Equipo("Delantero Izquierdo", 11));
        jugadores.put("Suarez", new Equipo("Delantero central", 9));

        for (Map.Entry<String, Equipo> mostrarEquipo: jugadores.entrySet()) {
            String clave = mostrarEquipo.getKey();
            Equipo valor = mostrarEquipo.getValue();
            System.out.println("Nombre: " + clave + " " + valor.toString());
        }

    }
}
