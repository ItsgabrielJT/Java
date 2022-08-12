package com.emojis;

import javax.swing.*;
import java.awt.*;

public class EmojiSix extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Carita
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 150, 150);
        g.setColor(Color.BLACK);
        g.fillOval(130, 150, 20, 20);
        g.fillOval(200, 150, 20, 20);
        g.setColor(Color.pink);
        g.fillOval(155, 180, 40, 50);
    }
}
