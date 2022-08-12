// 1.- Herencia
// Sigue el concepto de crear nuevas clases a psrtir de otras
// Se establece una relacion Padre e hija
// Las clases Padres se conocen como Superclases Y las clases hijas como subclases

// 2.- Sobreescritura
// Cuando una clase hija hereda de una clase padre se redefine un metodo
// Redefinirse significa que usa el mismo metodo de forma diferente de la clase padre
// Metodos declarados como final o static no pueden ser sobreescribidos

public class Main
{
    public static void main(String[] args)
    {
        Doctor planta1 = new Doctor("Joel", "joel.201", "172834", "123", "dentista");
        System.out.println(planta1.getNombre());
        System.out.println(planta1.getEspecialidad());

        // Uso de la sobreescritura del metodo toString
        // el metodo toStrign proviene de la clase object
        System.out.println(planta1); // Implicitamente se llama el metodo toString
    }
}
