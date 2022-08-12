package com.aulas.clase.Aula;

import com.aulas.clase.Alumno.Alumno;
import com.aulas.clase.Comprobar.Comprobar;
import com.aulas.clase.Profesor.Profesor;

import java.util.List;
import java.util.Scanner;

public class Aula
{
    private String nombreAula;
    private String materiaAsiganada;
    protected List<Alumno> alumnos;
    protected List<Profesor> profesores;

    private Scanner entrada = new Scanner(System.in);

    public Aula(String nombreAula, String materiaAsiganada, Profesor profesor) {
        this.nombreAula = nombreAula;
        this.materiaAsiganada = materiaAsiganada;
        Comprobar.comprobarMateria(profesor, materiaAsiganada, nombreAula);
    }

    public String getNombreAula() {
        return nombreAula;
    }

    public String getMateriaAsiganada() {
        return materiaAsiganada;
    }

    public void imprimirlistaAlumnos() {
        for (Alumno e: alumnos) {
            System.out.println(e);
        }
    }

    public void setListaAlumnos(List<Alumno> lista) {
        if (lista.size() < 20) {
            this.alumnos = lista;
        } else {
            throw new RuntimeException("El maximo de alumnos por curso deber ser de 20");
        }
    }

    public void setListaProfesoress(List<Profesor> lista) {
        if (lista.size() < 20) {
            this.profesores = lista;
        } else {
            throw new RuntimeException("El maximo de profesores es 20");
        }
    }

    public void setNotasAlumnos(List<Alumno> alumnos) {
        for ( int i = 0; i < alumnos.size(); i++) {
            System.out.print("Nota para " + alumnos.get(i).getNombre() + " : ");
            int nota = entrada.nextInt();
            alumnos.get(i).setNota(nota);
        }
    }

}
