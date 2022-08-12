// 1.- Metodos
// Los metodos tienen un tipo de acceso y un tipo de retorno
// El void funciona para indicar que el metodo no va artornar nada

// 2.- Arguemntos pasados por valor
// Significa que se envia una cpia del valor original que tiene una variable
// Sin embargo si dentro del metodo cambaimso este valor no afecta en nada al valor original

// 3.- Argumentos pasados por referencia
// Son utilizados al mandar objetos como parametros a los metodos en lugar de usar tipos primitivos
// Estamos pasando la referencia del obejto y su valor se modifica directamente dentro del metodo
// En este caso no se crea una copia del objeto

public class Main
{
    public static void main(String[] args) {
        // 2.- Paso por valor
        String nombre = "Joel";
        System.out.println(nombre);
        cambiarNombre(nombre); // Le psamos una copia del valor original al metodo
        System.out.println(nombre); // No afecto en nada al valor original

        // 3.- Paso por referencia
        Persona p = new Persona(); // Apunta al obejto persona
        p.setNombre("Joel");
        imprimirNOmbre(p);
        modificarNOmbre(p);
        imprimirNOmbre(p); // Aqui se muestra como se cambio el nombre

        // 4.- Paso de paraemtros con objetos
        Integer numero = 10;
        System.out.println(Persona.transformar(numero));
    }

    public static void cambiarNombre(String nombre) { // Se guarda la copia
        nombre = "Gabriel"; // Solo modificamos la copia
        System.out.println("Nuevo nombre: " + nombre);
    }

    public static void imprimirNOmbre(Persona p) {
        System.out.println("Valor recibido: " + p.getNombre());
    }

    public static void modificarNOmbre(Persona arg) { // Apunta al obejto persona porque recibe la direccion de p
        arg.setNombre("Gabriel");
    }
}
