package com.mycompany._matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main3 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int matriz [][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) // numero de filas
        {
            for (int j = 0; j < 3; j++) // numero de clumnas
            {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        // Pedir datos e imprimierlo
        int nFilas, nColumnas;
        nFilas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de columnas: "));     
        int matriz1 [][] = new int[nFilas][nColumnas];
        for (int k = 0; k < nFilas; k++)
        {
            for (int j = 0; j < nColumnas; j++)
            {
                System.out.print("Matriz [" + k + "] [" + j + "]: ");
                matriz1[k][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\n La matriz es: ");
        
        for (int i = 0; i < nFilas; i++) // numero de filas
        {
            for (int j = 0; j < nColumnas; j++) // numero de clumnas
            {
                System.out.print(matriz1[i][j]);
            }
            System.out.println("");
        }
    }
}
