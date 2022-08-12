package com.emojis;

import javax.swing.*;
import java.awt.*;

public class EmojiThree extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Carita me
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 150, 150);
        g.setColor(Color.BLACK);
        g.fillOval(130, 150, 20, 20);
        g.fillOval(200, 150, 20, 20);
        g.drawLine(150, 200, 200, 200);
    }
}
