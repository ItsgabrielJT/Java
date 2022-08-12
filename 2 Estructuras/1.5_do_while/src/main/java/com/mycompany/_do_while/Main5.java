package com.mycompany._do_while;

import javax.swing.JOptionPane;

public class Main5 
{
    public static void main(String[] args)
    {
        int numero = 0;
        char decision;
        final int MAX = 100;
        do
        {
            decision = JOptionPane.showInputDialog(null, "¿Quieres ser mi novia?").charAt(0);                        
            numero++;
        } while ((numero < MAX) && (decision != 's'));
    }
}
