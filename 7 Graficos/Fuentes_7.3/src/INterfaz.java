import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class INterfaz extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Podemos declarar fuentes del word haciendo lo sigueinte
        Font fuente = new Font("Bauhaus 93", Font.PLAIN, 34);
        g.setFont(fuente);
        g.drawString("Joel Tates", 100, 300);

    }
}
