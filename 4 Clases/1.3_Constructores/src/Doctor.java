public class Doctor
{
    int cedula;
    String nombre;
    int edad;

    Doctor(String nombre)
    {
        System.out.println("Mi nombre es: " + nombre);
    }

    public void mostrarMensaje()
    {
        System.out.println(cedula + nombre + edad);
    }
}
