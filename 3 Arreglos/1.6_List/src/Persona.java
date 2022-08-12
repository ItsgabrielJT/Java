import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public List<Persona> listaPersonas(Persona p) {
        List<Persona> lista = new LinkedList<>();
        return lista;
    }

    Consumer<Persona> getNombres= nombre -> {
        System.out.println(nombre.getNombre());
    };

}