package com.company.celulares;

public class Xiaomi
{
    private String procesador;
    private String memoria;
    private String bateria;

    public Xiaomi(String procesador, String memoria, String bateria) {
        this.procesador = procesador;
        this.memoria = memoria;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Xiaomi" +
                "\nProcesador: " + procesador +
                "\nMemoria: " + memoria +
                "\nBateria: " + bateria;
    }
}
