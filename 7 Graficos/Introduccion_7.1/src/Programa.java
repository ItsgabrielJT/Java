import javax.swing.*;

public class Programa
{
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Primera interfaz");
        Interfaz objeto = new Interfaz(); // Permite visualizar todos nuestras figuras en el frame ventana
        ventana.add(objeto); // Con esto agregamos todas las figuras al frame
        ventana.setSize(700, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
