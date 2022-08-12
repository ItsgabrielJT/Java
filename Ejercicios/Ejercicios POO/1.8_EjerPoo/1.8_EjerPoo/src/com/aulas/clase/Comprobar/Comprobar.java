package com.aulas.clase.Comprobar;

import com.aulas.clase.Aula.Aula;
import com.aulas.clase.Profesor.Profesor;

public class Comprobar
{
    public static Aula aula(String nombreAula, String materia, Profesor profesor) {
        Aula aula = null;
        try {
            aula = new Aula(nombreAula, materia, profesor);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return aula;
    }

    public static void comprobarMateria(Profesor profesor, String materia, String nombreAula) {
        if (materia.equals(profesor.getMateria())) {
            System.out.println("Bienvenido a " + nombreAula + "\n Materia: " + materia + "\n");
        } else {
            throw new RuntimeException("Esta no es la materia correcta");
        }
    }
}
