import javax.swing.*;
import java.awt.*;

public class Interfaz extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Dibuja sobre la ventana una linea en cordenadas (x1, y1), (x2, y2)
        // Estas coordenadas no pueden ser negativas
        g.drawLine(100,100,500,300);

        // POdemos asiganar colores ya definidos, tienen que declararse antes de dibujarse la linea
        g.setColor(Color.ORANGE);
        g.drawLine(500, 100, 300, 300);

        // Podemos asignar colores con la clase Color colocango los numeros rgb del color
        g.setColor(new Color(232, 77, 92));
        g.drawLine(200, 100, 300, 300);

        // Nos permite dibujar cuadrados o rectangulos
        g.drawRect(50, 300, 100, 100);

        // Nos permite dibujar Ovalos
        g.drawOval(50, 500, 100, 100);

        // Cuando vemos el metodo fill significa que aparte del controrno nos rellena la figura
        g.setColor(new Color(127, 246, 62));
        g.fillRect(200, 300, 100, 100);
        g.fillOval(200, 500, 100, 100);

        // POdemos dibujar arcos rellenos y dibujados
        g.setColor(new Color(55, 208, 107));
        g.drawArc(350, 300, 100, 100, 0, 180);
        g.fillArc(350, 500, 100, 100, 0, 180);

        // Rectangulos redondeados
        g.setColor(new Color(22, 59, 19));
        g.drawRoundRect(500, 300, 100, 100, 40, 40);
        g.fillRoundRect(500, 500, 100, 100, 40, 40);
    }
}
