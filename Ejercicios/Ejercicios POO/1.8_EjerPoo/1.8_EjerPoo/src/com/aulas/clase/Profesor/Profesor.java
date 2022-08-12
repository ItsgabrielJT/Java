package com.aulas.clase.Profesor;

import com.aulas.clases.abstracts.Persona;
import com.aulas.interfaces.IProfesorData;

public class Profesor extends Persona implements IProfesorData
{
    private String materia;

    public Profesor(String nombre, String sexo, int edad, String materia) {
        super(nombre, sexo, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public String toString() {
        return super.toString() + " Materia: " + materia + "\n";
    }
}
