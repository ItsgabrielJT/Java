package archivos;

import equipos.*;
import equipos.espanioles.EquipoFutbolEspaniol;

import java.awt.*;
import java.io.*;

public class BaseData
{

    public static void guardarArchivo(int x, String lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(dirigirArchivo(x)))) {
            bw.write(String.valueOf(lista));
            bw.newLine();
            System.out.println("Exito");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static String dirigirArchivo(int x) {
        String path;
        if (x == 1)
            path = "src/archivos/equipoEspaniol.txt";
        else
            path = "src/archivos/equipoIngles.txt";
        return path;
    }
}
