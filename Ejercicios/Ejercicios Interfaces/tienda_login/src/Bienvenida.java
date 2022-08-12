import javax.swing.*;
import java.awt.*;

public class Bienvenida extends JFrame
{
    private JPanel mensajePanel;

    public Bienvenida(JFrame parent) {
        setTitle("Login");
        setContentPane(mensajePanel);
        setMinimumSize(new Dimension(640,480));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        //setVisible(true);
    }
}
