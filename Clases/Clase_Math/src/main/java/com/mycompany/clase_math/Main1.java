package com.mycompany.clase_math;

import java.util.Scanner;

public class Main1 
{
    public static void main(String[] args)
    {
        int numero1 = 9;
        double raiz = Math.sqrt(numero1); // la raiz siempre retorna un double
        System.out.println("El resultado es: " + raiz);
        
        int raiz2 = (int)Math.sqrt(4); // Transformamos a int
        System.out.println("El resultado es: " + raiz2);
        
        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente); // retorna siempre double, poner siempre en ese orden
        System.out.println("El resultado es: " + raiz);
        
        double numero3 = 4.56;
        long resouesta = Math.round(numero3); // Simepore hay que poner long para los double
        System.out.println("El resultado es: " + resouesta);
        
        float numero4 = 3.45f;
        int respuesta = Math.round(numero4); // Siemore que poner int para los float
        System.out.println("El resultado es: " + respuesta);        
        
        double numero5 = Math.random();
        System.out.println("El numero aleatorio es: " + numero5);        
    }
}
