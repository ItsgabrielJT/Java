// 1.- Definicion de encapsulamiento
// Esconder un dato y accesible para as clases que queramos
// Es una forma de proteger nuestros datos

// 2.- Modificadores
// public, accesible a la clase, subclase, paquetes y otros
// protected, accesible por la clase, paquete y subclase
// default, accesible por la clase y paquete
// private, aceesibles solo desde la clase

public class Paciente
{
    private String nombre;
    private static int cita = 0;
    private int edad = 18;
    private String email;

    Paciente(String nombre, String email)
    {
        this.nombre = nombre;
        this.email = email;
        cita++;
    }

    public void mostrarDatos()
    {
        System.out.println("DATOS DEL PACIENTE");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Email: " + email);
        System.out.println("NUmero de cita: " + cita);
    }
}
