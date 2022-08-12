package com.company.celulares;

public class Samsung
{
    private String procesador;
    private String memoria;
    private String bateria;

    public Samsung(String procesador, String memoria, String bateria) {
        this.procesador = procesador;
        this.memoria = memoria;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Samsung" +
                "\nProcesador: " + procesador +
                "\nMemoria: " + memoria +
                "\nBateria: " + bateria;
    }
}
