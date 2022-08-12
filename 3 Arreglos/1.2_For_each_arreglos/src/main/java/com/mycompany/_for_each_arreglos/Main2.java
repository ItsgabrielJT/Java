package com.mycompany._for_each_arreglos;

import java.util.Scanner;

public class Main2 
{
    public static void main(String[] args)
    {        
        String[]nombres = {"Joel", "Maco", "Alejandor", "maria", "Henry", "Natalia", "Ingrid"};
        
        for(int i = 0; i < nombres.length;i++) // el length retorna como int el numero de elementos del arreglo
        {
            System.out.println(nombres[i]);
        }        
        
        System.out.println("\n");
        
        // Bucle for each
        for (String i: nombres) // Colocamos el mismo tipo de dato del arreglo y un nombre cualquiera
        {
            System.out.println(i); // en i se guardan todos los elementos del areglo
        }
    }
}
