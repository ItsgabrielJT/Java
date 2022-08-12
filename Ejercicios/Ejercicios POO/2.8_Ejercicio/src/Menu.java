import archivos.BaseData;
import equipos.espanioles.EquipoFutbolEspaniol;
import equipos.ingleses.EquipoFutbolInglese;

import java.io.IOError;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu
{
    private static int numero_usuario;
    private static final int N = 50;
    private static EquipoFutbolEspaniol[] equiposE = new EquipoFutbolEspaniol[N]; // Separa los equipos
    private static EquipoFutbolInglese[] equiposI = new EquipoFutbolInglese[N];
    private static int opcion;
    private static Scanner entrada = new Scanner(System.in);

    private static void mostrarCabeceraPrincipal() {
        System.out.println("\n\n--------- E Q U I P O S   DE   F U T B O L ---------");
        mostrarOpciones();
        escogerOpcion();
        String cache = entrada.nextLine(); // Sirve para capturar entradas de teclado en memoria
    }

    private static void mostrarOpciones() {
        System.out.println("1.- Ingresar Equipos");
        System.out.println("2.- Mostrar Equipos");
        System.out.println("3.- Salir");
        System.out.print("\nOpcion: ");
    }

    private static void escogerOpcion() {
        try {
            opcion = entrada.nextInt();
        } catch (NumberFormatException e) {
            System.out.print("Ingrese un valor valido: ");
            opcion = entrada.nextInt();
        }
    }

    private static void dirigirTarea() {
        switch (opcion) {
            case 1:
                introducirObjetos();
                break;
            case 2:
                mostrarDatos(mostrarLigas());
                break;
        }
    }


    private static void introducirObjetos() {
        System.out.print("Ingrese el numero de equipos: ");
        numero_usuario = entrada.nextInt();
        String cache = entrada.nextLine(); // Guarda cuaquier entrada en memoria
        ingresarDatosEquipos(mostrarLigas());
        System.out.println();
    }

    private static int mostrarLigas() {
        System.out.println("\n1.- Liga Espaniola: ");
        System.out.println("2.- Liga Inglesa: ");
        System.out.print("Ingrese que liga quiere: ");
        int x = entrada.nextInt();
        String cache = entrada.nextLine(); // Para guardar vualqueir entrada en memoria
        return x;
    }

    private static void ingresarDatosEquipos(int x) {
        for ( int i = 0; i < numero_usuario; i++ ) {
            if (x == 1)
                equiposE[i] = new EquipoFutbolEspaniol(ingresarNombre(), ingresarJugadores(), ingresarPresupuesto(), ingresarRanking());
            else
                equiposI[i] = new EquipoFutbolInglese(ingresarNombre(), ingresarJugadores(), ingresarPresupuesto(), ingresarRanking());

        }
    }

    private static String ingresarNombre() {
        System.out.print("Nombre: ");
        String nombre;
        try {
            nombre = entrada.nextLine();
        } catch (IOError e) {
            System.out.print("Introduzca un valor valido: ");
            nombre = entrada.nextLine();
        }
        return nombre;
    }

    private static int ingresarJugadores() {
        System.out.print("Numero de Jugadores: ");
        int jugadores;
        try {
            jugadores = Integer.parseInt(entrada.nextLine());
        } catch (NumberFormatException e) {
            System.out.print("Introduzca un valor valido: ");
            jugadores = Integer.parseInt(entrada.nextLine());
        }
        return jugadores;
    }

    private static double ingresarPresupuesto() {
        System.out.print("Presupuesto: ");
        double presupuesto;
        try {
            presupuesto = entrada.nextDouble();
        } catch (NumberFormatException e) {
            System.out.print("Introduzca un valor valido: ");
            presupuesto = entrada.nextDouble();
        } catch (InputMismatchException e) {
            System.out.print("Introduzca un valor valido: ");
            presupuesto = entrada.nextDouble();
        }
        return presupuesto;
    }

    private static String ingresarRanking() {
        String cache = entrada.nextLine(); // Guarda cualquier entrada en memoria
        System.out.print("Ranking: ");
        String ranking;
        try {
            ranking = entrada.nextLine();
        } catch (IOError e) {
            System.out.print("Introduzca un valor valido: ");
            ranking = entrada.nextLine();
        }
        return ranking;
    }

    private static void mostrarDatos(int x) {
        for ( int i = 0; i < numero_usuario; i++ ) {
            if (x == 1) {
                System.out.println("------- E Q U I P O S  E S P A N O L E S -------");
                System.out.println(equiposE[i]);
            }
            else{
                System.out.println("------- E Q U I P O S  I N G L E S E S -------");
                System.out.println(equiposI[i]);
            }
        }
    }

    public static void cargarMenuPrincipal() { // Maneja todo el menu principal
        do {
            mostrarCabeceraPrincipal();
            if ( (opcion < 1) || (opcion > 3) ) {
                System.out.print("Ingrese un valor dentro del rango: ");
                escogerOpcion();
            }
            dirigirTarea();
        } while (opcion != 3);
    }
}
