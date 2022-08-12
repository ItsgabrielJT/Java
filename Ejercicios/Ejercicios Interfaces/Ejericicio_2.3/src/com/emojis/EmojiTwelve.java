package com.emojis;

import javax.swing.*;
import java.awt.*;

public class EmojiTwelve extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Carita preocupado
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 150, 150);
        g.setColor(Color.WHITE);
        g.fillOval(190, 140, 35, 35);
        g.fillOval(130, 140, 35, 35);
        g.setColor(Color.BLACK);
        g.fillOval(190, 145, 20, 20);
        g.fillOval(130, 145, 20, 20);
        g.drawLine(160, 200, 200, 200);
        g.setColor(Color.cyan);
        g.fillOval(90, 150, 30, 40);
    }
}
