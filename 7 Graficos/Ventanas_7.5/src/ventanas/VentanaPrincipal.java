package ventanas;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal {
    private JPanel mainPanel;
    private JLabel textJL;
    private void mostrarPantalla() {
        JFrame v = new JFrame("Teinda Farmacia");
        v.setMinimumSize(new Dimension(300, 400));
        v.setContentPane(mainPanel);
        v.setLocationRelativeTo(null);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public VentanaPrincipal() {
        mostrarPantalla();
    }
}
