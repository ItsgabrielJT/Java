// 1.- Upcasting
// Se trata de crear un obejto de la clase padre para referenciarla con una clase hija

// 2.- Downcasting
// Al hacer downcasting nos permite usar los metodos de clases hijas

public class Main
{
    public static void main(String[] args) {
        // Upcasting
        Empleado persona = new Escritor();
        // Cuabdo hacemos lo anteior no podemos usar los metodos de la clase Hija
        // persona.obtenerLetra();

        // Downcasting
        Escritor persona1 = (Escritor) persona;
        persona1.obtenerLetra();
    }
}
