import javax.swing.*;
import java.awt.*;

public class Interfaz2 extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Nos permite dibujar multiples lineas
        g.setColor(Color.GREEN);
        int[] point2x = {100, 200, 300, 400, 500, 600};
        int[] point2y = {600, 100, 600, 100, 600, 100};
        g.drawPolyline(point2x, point2y, 6);
    }
}
