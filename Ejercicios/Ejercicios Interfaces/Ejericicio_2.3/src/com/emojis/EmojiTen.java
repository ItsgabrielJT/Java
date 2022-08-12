package com.emojis;

import javax.swing.*;
import java.awt.*;

public class EmojiTen extends JPanel
{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Carita sin reaccionar
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 150, 150);
        g.setColor(Color.WHITE);
        g.fillOval(190, 140, 35, 35);
        g.fillOval(130, 140, 35, 35);
        g.setColor(Color.BLACK);
        g.fillOval(195, 145, 20, 20);
        g.fillOval(135, 145, 20, 20);
    }
}
