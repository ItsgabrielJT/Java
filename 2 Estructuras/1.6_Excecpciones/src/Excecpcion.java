import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecpcion extends Throwable {
    // Dentro de java existen dos tipos de clases de excepciones con las que se debe trabajar
    // Ultimadamnte los progamadores solo trabajn mas con uncheked por lo que permite tener un codigo mas
    // limpio

    // Checked exceptions
    // Estas excepciones heredan de la clase Exception
    // Estas excecpiones tienen que que ser manejadas con un bloque try/cacth
    // Un ejemplo con este tipo de exception es SQLException

    // Uncheked Exception
    // Estas excepciones heredan de la clase RuntimeException
    // No estamos oblgados a procesarlas
    // Tambien son conocidas cmo ececpiones en tiempo de ejecucion

    /*
    try {
        // codigo que lanza excepciones
    } catch (// Tipo de excepcion // Variable) {
        // bloque de codigo que maneja u atraoa la excepcion
    } finally {
        // Bloque de codigo opcional ¿, pero siempre se ejecuta
    }
    */

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int numero = entrada.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        System.out.println("Escepciones con Throw");
        int resultado;

        try {
            resultado = Division.dividir(10, 0);
        } catch (Exception e) {
            e.printStackTrace(System.out); // Nos muestra el mensaje definida en el constructor de la excepcion con throw
        }


    }
}
