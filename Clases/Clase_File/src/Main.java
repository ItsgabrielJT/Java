import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // 1.- Creacion de archivos y escritura
        //creacionEscritura();

        // 2.- Lectura de archivos
        lectura();
    }

    protected static void creacionEscritura() {
        File carpeta = new File("Carpeta");
        File archivo = new File("Carpeta\\archivo.txt");
        try {
            boolean carpeta_creada = carpeta.mkdir();
            boolean archivo_creado = archivo.createNewFile();
            FileWriter escritura = new FileWriter(archivo);
            escritura.write("Hola mundo en archuvps");
            escritura.close();
            if (carpeta_creada && archivo_creado) {
                System.out.println("La carpeta y el archivo se crearon correctamente");
            } else {
                System.out.println("Elemtos ya existentes");
            }
        } catch (IOException error) {
            System.out.println("Error al crear el archuivo " + error);
        }
    }

    protected static void lectura() {
        File archivo = new File("Carpeta\\archivo.txt");
        try {
            Scanner lectura = new Scanner(archivo);
            while (lectura.hasNextLine()) { // Mientras haya lienas excritas
                String linea = lectura.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException error) {
            System.out.println("Error al abrir el archivo" + error);
        }
    }
}
