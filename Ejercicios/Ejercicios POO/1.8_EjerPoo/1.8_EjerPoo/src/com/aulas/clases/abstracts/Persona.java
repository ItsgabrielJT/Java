package com.aulas.clases.abstracts;

public abstract class Persona
{
    private final String nombre;
    private final String sexo;
    private final int edad;

    public Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\n Sexo: " + sexo +
                "\n Edad: " + edad + "\n";
    }


}
