import javax.swing.*;
import java.awt.*;

public class Texto extends JPanel
{
    public Texto() {
        GraphicsConfiguration con = SimpleUni
    }

    public static void main(String[] args) {
        System.setProperty("sun.awt.noerasebackground", "true");
        JFrame ventana = new JFrame("Texto");
        Texto panel = new Texto();
        ventana.add(panel);
        ventana.setSize (700,700) ;
        ventana.setVisible(true);
        ventana.setLocationRelativeTo (null) ;
        ventana.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
}
