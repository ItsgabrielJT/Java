package com.mycompany._arreglo;

import java.util.Scanner;

public class Main1 
{
    public static void main(String[] args)
    {
        /*
            Los arreglos tambien se les conoce como vectores
            Ta,bien podemos crear arreglos de obejtos
        */
        
        Scanner entrada = new Scanner(System.in);
        
        int[] numeros = new int[5]; // Forma de declarar e incializaar. contiene 5 elemntos
        
        int[] ordenes = {2, 3, 4 ,5 ,6 , 7}; // asi guardamos datos en el arreglo              
        
        // Introduccion de datos
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Ingrese el elemnto no " + (i + 1));
            numeros[i] = entrada.nextInt();
        }
        
        // Impresion de datos
        System.out.println("Areglo de numeros: ");

        for (int j = 0; j < 5; j++)
        {
            System.out.print("[" + numeros[j] + "] ");
        }        
        
        System.out.println("\n\nAreglo de ordenes: ");
        
        for (int k = 0; k < 5; k++)
        {
            System.out.print("[" + ordenes[k] + "] ");
        }
    }
}
