package com.company.mascotas;

public class Perro
{
    private String nombre;
    private int edad;
    private String color;

    public Perro(String nombre, int edad, String color) {
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
