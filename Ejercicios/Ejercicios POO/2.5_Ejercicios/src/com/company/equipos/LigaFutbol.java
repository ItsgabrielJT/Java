package com.company.equipos;

public class LigaFutbol
{
    private int numero_equipos;
    private int trofeo;
    private double premio;

    public LigaFutbol(int numero_equipos, int trofeo, double premio) {
        this.numero_equipos = numero_equipos;
        this.trofeo = trofeo;
        this.premio = premio;
    }

    public int getNumero_equipos() {
        return numero_equipos;
    }

    public void setNumero_equipos(int numero_equipos) {
        this.numero_equipos = numero_equipos;
    }

    public int getTrofeo() {
        return trofeo;
    }

    public void setTrofeo(int trofeo) {
        this.trofeo = trofeo;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Numero de equipos: " + numero_equipos +
                "\nNumero Trofeos: " + trofeo +
                "\nPremio: " + premio;
    }
}
