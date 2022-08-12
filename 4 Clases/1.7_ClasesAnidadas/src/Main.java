// 1.- Clases Anidadas
// Es una clase que esta ubicada dentro de otra clase

// 2.- Tipos de Clases Anidadas
// Se dividen en Clases Interna Y Clases Estaticas

// 3.- Conclusion
// Es mejor usar las clases Anidadas Estaticos porque consumimos menos memoria
// POdemos ser eficientes al manejar clases Estaticas

import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        // Clases Anidadas Estaticas
        Externo doctor = new Externo();
        doctor.setCitas(new Date(), "4pm");
        doctor.setCitas(new Date(), "6pm");
        doctor.setCitas(new Date(), "8pm");

        System.out.println(doctor.getCitas()); // Nos muetsra las direcciones de la lista de obejtos

        for(Externo.Cita listas: doctor.getCitas()) {
            System.out.println(listas.getFecha() + " " + listas.getHora());
        }

        // Clases Anidadas Internas
        Afuera objeto1 = new Afuera();
        Afuera.Interno objeto2 = objeto1.new Interno();

        // Clases Locals a un Metodo
        Afuera metodo = new Afuera();
        metodo.correr();
    }
}
