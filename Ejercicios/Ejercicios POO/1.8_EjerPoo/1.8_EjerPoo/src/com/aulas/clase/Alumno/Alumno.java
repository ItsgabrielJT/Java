package com.aulas.clase.Alumno;

import com.aulas.clases.abstracts.Persona;
import com.aulas.interfaces.IAlumnoData;

public class Alumno extends Persona implements IAlumnoData
{
    protected int nota;

    public Alumno(String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
    }

    public int getNota() {
        return nota;
    }

    @Override
    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return super.toString() + " Nota: " + nota + "\n";
    }
}
