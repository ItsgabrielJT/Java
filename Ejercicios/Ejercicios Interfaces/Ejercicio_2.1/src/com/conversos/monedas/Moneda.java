package com.conversos.monedas;

public class Moneda
{
    // Conversiones de dolares a monedas diferentes
    private static final double PESOSMXDOL = 20.38;
    private static final double PESOSCOLDOL = 4269.67;
    private static final double EUROSDOL = 0.98;
    private static final double YENESDOL = 133.42;

    public static double getPesosmxdol() {
        return PESOSMXDOL;
    }
    public static double getPesoscoldol() {
        return PESOSCOLDOL;
    }
    public static double getEurosdol() {
        return EUROSDOL;
    }
    public static double getYenesdol() {
        return YENESDOL;
    }

    // Conversiones de Euros a monedas diferentes
    private static final double PESOSMXEU = 20.81;
    private static final double PESOSCOLEU = 4373.46;
    private static final double DOLARESEU = 1.02;
    private static final double YENESEU = 136.28;

    public static double getPesosmxEu() {
        return PESOSMXEU;
    }
    public static double getPesoscolEu() {
        return PESOSCOLEU;
    }
    public static double getDolaresEu() {
        return DOLARESEU;
    }
    public static double getYenesEu() {
        return YENESEU;
    }

    // Conversiones de PEsosMX a otras monedas

    private static final double EUROSMX = 0.048;
    private static final double PESOSCOLMX = 210.34;
    private static final double DOLARESMX =  0.049;
    private static final double YENESMX = 6.55;

    public static double getEurosmx() {
        return EUROSMX;
    }
    public static double getPesoscolmx() {
        return PESOSCOLMX;
    }
    public static double getDolaresmx() {
        return DOLARESMX;
    }
    public static double getYenesmx() {
        return YENESMX;
    }

    // Conversiones de Pesos Colombianos a otras monedas

    private static final double EUROSCOL = 0.00022;
    private static final double PESOSMXCOL = 0.0046;
    private static final double DOLARESCOL =  0.00023;
    private static final double YENESCOL = 0.030;

    public static double getEuroscol() {
        return EUROSCOL;
    }
    public static double getPesosMxcol() {
        return PESOSMXCOL;
    }
    public static double getDolarescol() {
        return DOLARESCOL;
    }
    public static double getYenescol() {
        return YENESCOL;
    }

    // Conversion de Yenes a otras monedas

    private static final double EUROSYEN = 0.0073;
    private static final double PESOSCOLYEN = 32.10;
    private static final double DOLARESYEN =  0.0075;
    private static final double PESOSMXYEN = 0.15;

    public static double getEurosyen() {
        return EUROSYEN;
    }
    public static double getPesoscolyen() {
        return PESOSCOLYEN;
    }
    public static double getDolaresyen() {
        return DOLARESYEN;
    }
    public static double getPesosMxyen() {
        return PESOSMXYEN;
    }
}
