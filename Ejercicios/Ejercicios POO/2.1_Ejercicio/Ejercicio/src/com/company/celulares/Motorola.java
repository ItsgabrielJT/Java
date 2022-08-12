package com.company.celulares;

public class Motorola
{
    private String procesador;
    private String memoria;
    private String bateria;

    public Motorola(String procesador, String memoria, String bateria) {
        this.procesador = procesador;
        this.memoria = memoria;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Motorola" +
                "\nProcesador: " + procesador +
                "\nMemoria: " + memoria +
                "\nBateria: " + bateria;
    }
}
