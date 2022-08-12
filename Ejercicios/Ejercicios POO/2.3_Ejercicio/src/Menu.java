import java.util.Scanner;

public class Menu
{
    private static int opcionMenu = 0; // 1 para entrar al while
    private Scanner entrada = new Scanner(System.in);

    public Menu() {
        Arca arca1 = new Arca();
    }

    public void iniciarMenuPincipal() {
        do {
            mostrarCabeceraMenuprincipal();
            mostrarOpcionesMenuPrincipal();
            opcionMenu = ingresarMenuOpcion();
            System.out.println();
            dirigirTarea();
        } while ( opcionMenu != 0 );
    }

    private void mostrarOpcionesMenuPrincipal() {
        System.out.println("1. - Ingresar animales");
        System.out.println("2. - Modificar lista de animales");
        System.out.println("3. - Mostrar datos del arca");
        System.out.println("0. - Salir");
        System.out.println();
        System.out.print("------> ");
    }

    private void mostrarCabeceraMenuprincipal() {
        System.out.println();
        System.out.println("------------ ARCA DE NOE ------------");
        System.out.println("       Ingresa cualquier opcion       ");
        System.out.println();
    }

    private void dirigirTarea() {
        switch (opcionMenu) {
            case 1 -> ingresarDatosAnimales();
            case 2 -> modificarListaAnimales();
            case 3 -> Arca.mostrarAnimales();
        }
    }

    private void ingresarDatosAnimales() {
        var capturar_entrada_vacia = entrada.nextLine();
        Arca.animales.add(new Animal(ingresarNombre(), ingresarGenero(), ingresarPeso()));
        System.out.println();
    }

    private void modificarListaAnimales() {
        int posicion = 0;
        do {
            posicion = ingresarPosicion();
            var capturar_entrada_vacia = entrada.nextLine();
            Arca.animales.get(posicion).setNombre(ingresarNombre());
            Arca.animales.get(posicion).setGenero(ingresarGenero());
            Arca.animales.get(posicion).setPeso(ingresarPeso());
        } while ( posicion > Arca.animales.size() );
        System.out.println();
    }

    private int ingresarMenuOpcion() {
        int opcion = 0;
        try {
            opcion = entrada.nextInt();
        } catch (Exception e) {
            System.out.print("Ingrese un valor valido: ");
            opcion = entrada.nextInt();
        }
        return opcion;
    }

    private int ingresarPosicion() {
        int posicion = 0;
        try {
            System.out.print("Posicion: ");
            posicion = entrada.nextInt();
        } catch (Exception e) {
            System.out.print("Ingrese un valor valido: ");
            posicion = entrada.nextInt();
        }
        return --posicion; // Porque el ususrio cuenta desde 1
    }

    private String ingresarNombre() {
        String nombre = "";
        try {
            System.out.print("Nombre: ");
            nombre = entrada.nextLine();
        } catch (Exception e) {
            System.out.print("\nIngrese nuevamente: ");
            nombre = entrada.nextLine();
        }
        return nombre;
    }

    private String ingresarGenero() {
        String genero = "";
        try {
            System.out.print("Genero: ");
            genero = entrada.nextLine();
        } catch (Exception e) {
            System.out.print("\nIngrese nuevamente: ");
            genero = entrada.nextLine();
        }
        return genero;
    }

    private double ingresarPeso() {
        double peso = 0.0;
        try {
            System.out.print("Peso: ");
             peso = entrada.nextDouble();
        } catch (Exception e) {
            System.out.print("\nIngrese nuevamente: ");
             peso = entrada.nextDouble();
        }
        return peso;
    }
}
