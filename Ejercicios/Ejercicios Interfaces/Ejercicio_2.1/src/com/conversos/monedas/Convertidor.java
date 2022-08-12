package com.conversos.monedas;

public class Convertidor
{
    private String opcion_por_convertir;
    private String opcion_a_convertir;
    private double dinero;
    public void setOpcionPorConvertir(String opcion_moneda) {
        this.opcion_por_convertir = opcion_moneda;
    }
    public void setOpcionAConvertir(String opcion_moneda) {
        this.opcion_a_convertir = opcion_moneda;
    }
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    public double realizarConversion() {
        double resultado = 0.0;
        switch (opcion_por_convertir) {
            case "DOLARES":
                resultado = convertirDolares();
                break;
            case "PESOSMX":
                resultado = convertirPesosmx();
                break;
            case "EUROS":
                resultado = convertirEuros();
                break;
            case "PESOSCOL":
                resultado = convertirPesoscol();
                break;
            case "YENJP":
                resultado = convertirYenjp();
        }
        return resultado;
    }
    private double convertirDolares() {
        double resultado = 0.0;
        switch (opcion_a_convertir) {
            case "PESOSMX":
                resultado = (dinero * Moneda.getPesosmxdol());
                break;
            case "EUROS":
                resultado = (dinero * Moneda.getEurosdol());
                break;
            case "PESOSCOL":
                resultado = (dinero * Moneda.getPesoscoldol());
                break;
            case "YENJP":
                resultado = (dinero * Moneda.getYenesdol());
        }
        return resultado;
    }
    private double convertirEuros() {
        double resultado = 0.0;
        switch (opcion_a_convertir) {
            case "PESOSMX":
                resultado = (dinero * Moneda.getPesosmxEu());
                break;
            case "DOLARES":
                resultado = (dinero * Moneda.getDolaresEu());
                break;
            case "PESOSCOL":
                resultado = (dinero * Moneda.getPesoscolEu());
                break;
            case "YENJP":
                resultado = (dinero * Moneda.getYenesEu());

        }
        return resultado;
    }
    private double convertirPesosmx() {
        double resultado = 0.0;
        switch (opcion_a_convertir) {
            case "DOLARES":
                resultado = (dinero * Moneda.getDolaresmx());
                break;
            case "EUROS":
                resultado = (dinero * Moneda.getEurosmx());
                break;
            case "PESOSCOL":
                resultado = (dinero * Moneda.getPesoscolmx());
                break;
            case "YENJP":
                resultado = (dinero * Moneda.getYenesmx());
        }
        return resultado;
    }
    private double convertirPesoscol() {
        double resultado = 0.0;
        switch (opcion_a_convertir) {
            case "PESOSMX":
                resultado = (dinero * Moneda.getPesosMxcol());
                break;
            case "EUROS":
                resultado = (dinero * Moneda.getEuroscol());
                break;
            case "DOLARES":
                resultado = (dinero * Moneda.getDolarescol());
                break;
            case "YENJP":
                resultado = (dinero * Moneda.getYenescol());
        }
        return resultado;
    }
    private double convertirYenjp() {
        double resultado = 0.0;
        switch (opcion_a_convertir) {
            case "PESOSMX":
                resultado = (dinero * Moneda.getPesosMxyen());
                break;
            case "EUROS":
                resultado = (dinero * Moneda.getEurosyen());
                break;
            case "PESOSCOL":
                resultado = (dinero * Moneda.getPesoscolyen());
                break;
            case "DOLARES":
                resultado = (dinero * Moneda.getDolaresyen());
        }
        return resultado;
    }

}
