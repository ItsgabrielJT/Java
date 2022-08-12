// 1.- Que son las pilas
// Son estructuras de datos que aplican los metodos FIFO
// El ultimo objeto en entrar es el primero en salir

// 2.- Metodos que manejan las pilas
// peek(), Devuelve el objeto de la parte superior de la pila sin elimanrlo
// push(), Agruge un objeto a la parte superior de la pila
// pop(), Devulve el objeto que eolimno en la parte superior de la pila

// 3.- Tipos de datos en pilas
// Las pilas pueden guardar cuqlueir tipo de datos
// Incluso pueden estar mezclados

import java.util.Stack;

public class Programa
{
    public static void main(String[] args) {
        Stack pila = new Stack();


        pila.push(50);
        pila.push("Joel");
        pila.push(true);
        pila.push(23.45);
        pila.push('c'); // Ultimo elemento en agregarse

        // Recordar que el ultimo en entrar es el ultimo en salir
        System.out.println(pila.peek()); // Nos muestra 'c' y no elimina el elemtno de la pila

        while (pila.empty() == false) {
            System.out.println(pila.pop()); // Nos mostrara el objeto eliminado hasta dejar vacia la pila
        }


    }
}
