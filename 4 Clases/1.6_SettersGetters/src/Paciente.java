// 1.- Metodo setters
// Poner el dato a la variable

// 2.- Metodo getters
// Obtener el dato de la variable

// Dentro de los setters podemos controlar el seteo de una variable
// es decir que podemos condicionar la asiganacion de una variable

public class Paciente
{
    private String nombre;
    private int edad;
    private String email;
    private String cumpleanios;
    private static int cita = 0;

    Paciente(String nombre, String email)
    {
        this.nombre = nombre;
        this.email = email;
        cita++;
    }

    Paciente()
    {

    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public int getEdad()
    {
        return edad;
    }

    public void mostrarDatos()
    {
        System.out.println("DATOS DEL PACIENTE");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Email: " + email);
        System.out.println("Numero de cita: " + cita);
    }
}
