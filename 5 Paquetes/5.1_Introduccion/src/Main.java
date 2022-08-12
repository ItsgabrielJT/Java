// 1.- Explicacion de paquetes
// LOs paquetes nos ayudan a ordenar nuestras clases, a no repetir o confunir las clases y proteger nuestro codigo

// 2.- Convencion de nombres
// Todo el nombre debe estar en minusculas
// los nombres de los subpaquetes son antes del nombre del paquete general

import com.gm.*; // Con el asterisco evitamos especiicar el paquete que usamos
// Que es todo esto "com.gm.Utileria.imprimir"

public class Main
{
    public static void main(String[] args) {
        Utileria.imprimir("Hola wey");
    }
}

