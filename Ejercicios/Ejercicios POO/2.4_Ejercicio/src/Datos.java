import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Datos
{
    private static Scanner input;
    private static String[] cadenas = new String[5];
    private static final String DIR_ARCHI = "src/Estudiantes.txt";
    private static ArrayList<Estudiante> lista = new ArrayList<>();

    private static String[] guardarElementos(String a, int pos) {
        cadenas[pos] = a;
        return cadenas;
    }

    private static void cargarObejetos(String a, int contador) {
        String[] b = guardarElementos(a, contador);
        if ( contador == b.length - 1 )
            lista.add(new Estudiante(b[0], b[1], b[2], b[3], b[4]));
    }

    private static void leerArchivo(int contador) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (!Objects.equals(line, "-1")) {
                cargarObejetos(line, contador);
                contador++;
            }
            else
                contador = 0;
        }
    }

    public static void imprimitEstudiantes() {
        for (Estudiante e: lista) {
            System.out.println(e);
        }
    }

    public static void manejoExceopciones(int contador) {
        try {
            input = new Scanner(new File(DIR_ARCHI));
            leerArchivo(contador);
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
