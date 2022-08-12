package com.aulas.clases.UIMenu;

import com.aulas.clase.Aula.Aula;
import com.aulas.clase.Profesor.Profesor;
import com.aulas.interfaces.IAulaData;
import com.aulas.interfaces.IMenu;
import com.aulas.interfaces.IProfesorData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuAula implements IMenu, IProfesorData, IAulaData
{
    private Scanner entrada = new Scanner(System.in);

    private int entrarOpciones(int opcion) {
        do {
            imprimirOpciones();
            switch (opcion) {
                case 1:

            }

        } while ( opcion != 0 );
        return 0;
    }

    private void imprimirOpciones() {
        System.out.println("C O L E G I O");
        System.out.println("1.- Agregar Profesor");
        System.out.println("2.- Agregar Alumnos");
        System.out.println("3.- Agregar Aulas");
        System.out.println("4.- Manejar Aulas ");
        System.out.println("0.- Salir ");
    }



    @Override
    public void menuPrincipal() {
        int opcion = 0;

    }

    public Profesor ingresarProfesores() {
        System.out.println("Ingresa el nombre del profesor: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el sexo: ");
        String sexo = entrada.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = entrada.nextInt();
        System.out.println("Ingrese la materia: ");
        String materia = entrada.nextLine();
        Profesor profesor = new Profesor(nombre, sexo, edad, materia);
        return profesor;
    }

    public void agregarProfesores() {
        System.out.println("Cuntos profesores desea agregar: ");
        int cantidad = entrada.nextInt();
        for ( int i = 0; i < cantidad; i++ ) {

        }
    }


}