package com.company.celulares;

public class Huawei
{
    private String procesador;
    private String memoria;
    private String bateria;

    public Huawei(String procesador, String memoria, String bateria) {
        this.procesador = procesador;
        this.memoria = memoria;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Huawei" +
                "\nProcesador: " + procesador +
                "\nMemoria: " + memoria +
                "\nBateria: " + bateria;
    }
}
