package com.company.mascotas;

public class Pez
{
    private String nombre;
    private int edad;
    private String color;

    public Pez(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nColor: " + color;
    }
}
