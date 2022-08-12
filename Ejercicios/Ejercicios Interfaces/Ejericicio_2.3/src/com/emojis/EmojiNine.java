package com.emojis;

import javax.swing.*;
import java.awt.*;

public class EmojiNine extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Carita nojada
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 150, 150);
        g.setColor(Color.BLACK);
        g.drawLine(130, 130, 150, 140);
        g.fillOval(190, 140, 20, 30);
        g.drawLine(190, 140, 210, 130);
        g.fillOval(130, 140, 20, 30);
        g.drawArc(130, 170, 60, 50, 0, 180);
    }
}
