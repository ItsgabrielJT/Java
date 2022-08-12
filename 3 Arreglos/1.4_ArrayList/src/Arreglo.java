import java.util.ArrayList;
import java.util.Collections;

public class Arreglo
{
    // La clase ArrayLIst contiene una matriz de tamaño variable, que proveiene del paquete java.util
    // La primera difrencia enre un arreglo integrado y la clase ArrayList , esque esta ultima
    // puede modificar el arreglo a medida que se ejecuta el programa

    // Como araayList es una clase solo pude recibir obejtos y no tipos de datos primitivos

    public static void main(String[] args) {
        // Creacion del arreglo
        ArrayList<String> carros = new ArrayList<>();

        // Agregar dato al arreglo
        carros.add("Volvo");
        carros.add("Chevrolet");
        carros.add("Nissan");
        carros.add("Suzuki");

        // Obetner un elementos del arreglo
        carros.get(0); // Inidicamos el indice del elemnto

        // Modificar un element0
        carros.set(0, "Mazda"); // Inidce y nuevo dato

        // Remover un elemtno
        carros.remove(1); // Indicamos el indice del elemento a eliminar

        // Tamaño del arreglo
        carros.size(); // Devulve el numero de elemntos dentro del arreglo

        // Mostar elementos del arreglo
        for (String lista: carros) {
            System.out.println(lista);
        }

        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(12);
        notas.add(2);
        notas.add(20);
        notas.add(10);
        notas.add(15);

        for (String lista: carros) {
            System.out.println(lista);
        }

        // Ordenar un arreglo con la alse Colecctions
        Collections.sort(notas);
        System.out.println("Despues de ordenar el arreglo");

        for (String lista: carros) {
            System.out.println(lista);
        }

        //Eleminar todos los elelemntis de un arreglo
        carros.clear();
    }
}
