import javax.swing.*;
import java.awt.*;

public class Interfaz extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Este metodo recibe arreglos para poder dibujar poligonos
        int[] pointx = {200, 100, 300};
        int[] pointy = {200, 600, 600};
        g.drawPolygon(pointx, pointy, 3);
        g.setColor(Color.orange);
        int[] point1x = {500, 500, 600};
        int[] point1y = {200, 600, 600};
        g.fillPolygon(point1x, point1y, 3);

        // Nos permite dibujar multiples lineas
        g.setColor(Color.GREEN);
        int[] point2x = {100, 200, 300, 400, 500, 600};
        int[] point2y = {600, 100, 600, 100, 600, 100};
    }
}
