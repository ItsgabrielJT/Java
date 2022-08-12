package com.company.celulares;

public class Iphone
{
    private String procesador;
    private String memoria;
    private String bateria;

    public Iphone(String procesador, String memoria, String bateria) {
        this.procesador = procesador;
        this.memoria = memoria;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Iphone" +
                "\nProcesador: " + procesador +
                "\nMemoria: " + memoria +
                "\nBateria: " + bateria;
    }
}
