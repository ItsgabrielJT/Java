 // 1.- Staticos
 // Pueden ser usadas en toda la clase
 // Utilizamos static para usar una de sus propiedades sin llamar un objeto
 // Pueden ser accesados inidcando el nombre de la clase
 // Se invoca en una clase que no tiene instancias
 // EL valor estatico mantiene su dato durante todo el programa

 // 2.- Importar clases staticas
 // Traemos todoas las propiedades de esas clase
 // De esta forma ya no usamos el nombre de la clase para invocar metodos o varibles
 // Solo colocamos el nombre o el metodo que queramos
 // Ejemplo: import static java.lang.Math.*

 import static Menus.Menu.*;

public class Main
{
    public static void main(String[] args)
    {
        mostrarMenu();

        Doctor miDoctor1 = new Doctor();
        miDoctor1.nombre = "Joel";
        miDoctor1.mostrarNombre();
        miDoctor1.mostrarPuesto(); // Primera froma de usar el static
        System.out.println("Segunda forma: " + Doctor.puesto);
    }
}
