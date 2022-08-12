import javax.swing.*;

public class Programa
{
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        Interfaz objeto = new Interfaz(); // Triangulos
        Interfaz2 objeto2 = new Interfaz2(); // Multilineas
        ventana.add(objeto2);
        ventana.setSize(700, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
