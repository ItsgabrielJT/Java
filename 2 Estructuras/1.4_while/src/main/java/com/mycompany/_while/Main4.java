package com.mycompany._while;

import javax.swing.JOptionPane;

public class Main4 
{
    public static void main(String[] args)
    {
        final int MAX = 50;
        int numero = 0;
        int sumatoria = 0;
        char letra = 's';
        
        sumatoria = sumatoria + 10;
        
        while((numero < MAX) && (letra != 'n'))
        {
            System.out.println("-----> " + numero);
            if (numero == sumatoria)
            {
                letra = JOptionPane.showInputDialog(null, "Quiere seguir la secuencia (s/n)").charAt(0);
                if(letra == 's')
                {
                    sumatoria = sumatoria + 10;                                    
                }
            }
            numero++;
        }
    }
}
