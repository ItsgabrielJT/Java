package com.emojis;

import javax.swing.*;
import java.awt.*;

public class EmojiEight extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Carita guino
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 150, 150);
        g.setColor(Color.BLACK);
        g.drawLine(130, 155, 160, 155);
        g.fillOval(190, 140, 20, 30);
        g.drawArc(130, 170, 90, 50, 180, 180);
    }
}
