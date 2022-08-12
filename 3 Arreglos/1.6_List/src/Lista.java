import java.util.ArrayList;
import java.util.List;

public class Lista
{
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        Persona doctor = new Persona("Joe", 13);
        Persona doctor2 = new Persona("Pedro", 14);
        Persona doctor3 = new Persona("Jere", 17);
        Persona doctor4 = new Persona("Jhnoy", 16);
        listaPersonas.add(doctor);
        listaPersonas.add(doctor2);
        listaPersonas.add(doctor3);
        listaPersonas.add(doctor4);

        for (Persona p: listaPersonas) {
            System.out.println(p);
        }
    }
}
