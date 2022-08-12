package com.emojis;

import javax.swing.*;
import java.awt.*;

public class EmojiSeven extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Carita molesto
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 150, 150);
        g.setColor(Color.BLACK);
        g.drawLine(130, 155, 160, 155);
        g.drawLine(190, 155, 220, 155);
        g.drawLine(160, 200, 200, 200);
    }
}
