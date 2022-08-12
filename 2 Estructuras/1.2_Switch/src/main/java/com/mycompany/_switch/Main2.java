package com.mycompany._switch;

import javax.swing.JOptionPane;

public class Main2 
{
    public static void main(String[] args)
    {
        int opcion;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero: "));
        
        switch(opcion)
        {
            case 1:
            {
                JOptionPane.showMessageDialog(null, "Entrarset opcion 1");
            }
            break;
            case 2:
            {
                JOptionPane.showMessageDialog(null, "Entrarset opcion 2");
            }
            break;
            case 3:
            {
                JOptionPane.showMessageDialog(null, "Entrarset opcion 3");                
            }
        }

        // Otras fromas de nombrar sl swhict
        // En esta ocaion esta froma de escribir el swhit nos permite retornanr algo

        String argumentos = "Java";
        String langtype = switch (argumentos) {
            case "Java", "Scala", "Kotlin" -> "Static typed";
            case "Groovy", "JavaScript" -> "Dinamic typed";
            default -> {
                JOptionPane.showMessageDialog(null, "Esta procesando el bloque");
                yield "Probablemente LISP";
            }
        };

        JOptionPane.showMessageDialog(null, langtype);
    }
}
