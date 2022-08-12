package com.mycompany._if_else;

import javax.swing.JOptionPane;

public class Main1 
{
    public static void main(String[] args)
    {
        int numero, dato = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if (numero == dato)
        {
            JOptionPane.showMessageDialog(null, "El numero es " + dato);
        }
        else if ( numero < dato)
        {
            JOptionPane.showMessageDialog(null, "El numero es menor de " + dato);            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El numero es totalmente disitno de 5");           
        }
    }
}
