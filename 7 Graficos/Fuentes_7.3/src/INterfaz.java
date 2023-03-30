import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class INterfaz extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Podemos declarar fuentes del word haciendo lo sigueinte
        Font fuente = new Font("Arial Cursiva", Font.BOLD, 200);
        g.setFont(fuente);
        g.setColor(Color.RED);
        g.drawString("S", 200, 300);
        g.setColor(Color.PINK);
        g.drawString("S", 220, 300);

    }
}
