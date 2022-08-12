public class Doctor
{
    Doctor()
    {
        puesto++;
    }

    static int puesto = 0;
    String nombre;

    public void mostrarNombre()
    {
        System.out.println("Doctor: " + nombre);
    }

    public void mostrarPuesto()
    {
        System.out.println("Numero: " + puesto);
    }
}
