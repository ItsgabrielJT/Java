import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Programa
{
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        INterfaz objeto = new INterfaz();
        ventana.add(objeto);
        ventana.setSize(500, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
