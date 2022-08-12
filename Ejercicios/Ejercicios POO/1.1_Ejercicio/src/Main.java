import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner escritura = new Scanner(System.in);
        try {
            File archivos = new File("nopor.txt");
            FileWriter cagaste = new FileWriter(archivos);
            cagaste.write("ghgjhghjghghgjhggjh");
            cagaste.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String nombre;
        for(int burro = 0; burro <= 10; burro++) {
            System.out.println("Ingrese un nombre: ");
            nombre = escritura.nextLine();
        }
    }
}
