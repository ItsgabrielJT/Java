package com.emojis;

import javax.swing.*;
import java.awt.*;

public class EmojiFour extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Carita beso
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 150, 150);
        g.setColor(Color.BLACK);
        g.fillOval(130, 150, 20, 20);
        g.fillOval(200, 150, 20, 20);
        g.drawArc(170, 180, 25, 20, 90, -180);
        g.drawArc(170, 200, 25, 20, 90, -180);
    }
}
