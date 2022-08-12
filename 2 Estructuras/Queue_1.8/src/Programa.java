// 1.- Que son las colas
// Es una estrucutra de datos que aplica FIFO
// Es decir que, el primer elemento en entrar es el primero en salir
// Java utiiza la interfaz queue que es impementada por varias clases

// 2.- MEtodos de las colas
// offer(), Introduce los elelemntos a la cola
// poll(), NOs Retorna el emento eliminado de la cola
// peek(), Nos muestra el elemento de la cola

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Programa
{

    public static void main(String[] args) {
        Queue colas = new LinkedList();

        Random g = new Random();
        for (int i = 0; i < 10; i++) {
            colas.offer(g.nextInt(50));
        }

        System.out.println("PRimer elemtno que se introdujo en la cola: " + colas.peek());

        // Para no acuir a las listas para recorrer las pilas podemos usar los iterdaores

        Iterator caso = colas.iterator();
        while (caso.hasNext()) { // Mientras hayan elementos
            System.out.println(caso.next()); // Imprimimos el elemtno siguiente
        }
    }
}
