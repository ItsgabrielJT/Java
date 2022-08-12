// 1.- Objetos
// Son todas aquellas cosas que tienen propiedades y comportamientos
// Pueden ser fisicos o conceptuales

// 1.2- Propiedades
// Tambien pueden ser llamdos atributos
// Son sustantivos, es decir palabras que identifican cosas
// Ejemplo: color

// 1.3- Comportamientos
// Todas las operaciones del obejto
// Suelen ser verbos o sustantivo y verbo
// Ejempllo: acelerar

// 2.- Clase
// Modelo sobre el cual nuestro obejto es construido
// Nos permite generar muchos obejtos
// Esos modelos Se basa en la Abstraccion

// 2.1- Abstraccion
// Analizamos un obejto para abstraer su composicion y generar un molde, es decir
// Analizamos el obejto para saber sus propiedades y comportamientos
// De tal forma que hagamos algo general con esa informacion para asi poder crear otros objetos similares

// 3.- Modularizacion
// Separar las clases que creemos por archivos
// Obetenemois mejor legibilidad, reutilidad y mentenimiento

// 4.- Variables vs Objetos
// int i = 0, almacena el valor directamente en el stack
// El stack es una estructura en forma de Pila
// Clase obejto = new Clase(), alamcena la direccion de memoria donde se alamcena los datos del obejto
// Esta memoria se conoce como heap, es uns estructura en forma de arbol
// Lo que se guarda en el stack es la direccion de memoria de los datos

public class Intro
{
    public static void main(String[] args)
    {
                        // Instanciando objeto
        Persona persona1 = new Persona(); // Objeto persona1
        persona1.nombre = "Joel";
        persona1.mostrarNombre();

        // Variables vs Objetos
        int b = 0;
        int c = 1;
        b = c; // b = 1

        Persona ejemplo1 = new Persona();
        Persona ejemplo2 = new Persona();
        ejemplo1.nombre = "Marco";
        ejemplo2.nombre = "Paulina";
        ejemplo1 = ejemplo2; // ejemplo1 apunta a la misma direccion de memoria que ejemplo2
        ejemplo1.mostrarNombre();
        ejemplo2.mostrarNombre();
        ejemplo1.nombre = "Mendes"; // Como apuntan a la misma direccion, se actuliza el mismo dato para el otro obejto      ejemplo1.mostrarNombre();
        ejemplo2.mostrarNombre();
    }
}
