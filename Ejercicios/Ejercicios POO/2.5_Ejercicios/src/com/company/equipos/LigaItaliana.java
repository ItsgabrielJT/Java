package com.company.equipos;

public class LigaItaliana extends LigaFutbol
{
    private String mejor_equipos;

    public LigaItaliana(int numero_equipos, int trofeo, double premio) {
        super(numero_equipos, trofeo, premio);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMejor Equipo: " + mejor_equipos;
    }

    public String getMejor_equipos() {
        return mejor_equipos;
    }

    public void setMejor_equipos(String mejor_equipos) {
        this.mejor_equipos = mejor_equipos;
    }
}
