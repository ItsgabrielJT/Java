package com.emojis;

import javax.swing.*;
import java.awt.*;

public class EmojiFive extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Carita lengua
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 150, 150);
        g.setColor(Color.BLACK);
        g.fillOval(130, 150, 20, 20);
        g.fillOval(200, 150, 20, 20);
        g.drawLine(150, 190, 200, 190);
        g.setColor(Color.pink);
        g.fillArc(155, 160, 30, 60, 180, 180);
    }
}
