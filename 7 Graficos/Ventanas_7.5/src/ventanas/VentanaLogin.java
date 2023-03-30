package ventanas;

import javax.swing.*;
import java.awt.*;

public class VentanaLogin extends JFrame{
    private JButton button1;
    private JPanel mainPanel;

    private void mostrarPantalla() {
        setTitle("Teinda Farmacia");
        setMinimumSize(new Dimension(300, 400));
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public VentanaLogin() {
        mostrarPantalla();
    }
}
