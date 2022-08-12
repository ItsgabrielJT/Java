package Menus;

import java.util.Scanner;

public class Menu
{
    public static void mostrarMenu()
    {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do
        {
            System.out.println("Ingrese una opcion: ");
            System.out.println("1.- Doctor");
            System.out.println("2.- Paciente");
            System.out.println("0.- Salir");
            opcion = Integer.valueOf(sc.nextLine());

            switch (opcion)
            {
                case 1:
                    System.out.println("Ingresaste Doctor");
                    break;
                case 2:
                    System.out.println("Ingresaste PAciente");
                    break;
                case 0:
                    System.out.println("Gracias por tu visita");
                    break;
                default:
                    System.out.println("Selcciona una opcion correcta por favor");
            }
        }while(opcion != 0);
    }
}
