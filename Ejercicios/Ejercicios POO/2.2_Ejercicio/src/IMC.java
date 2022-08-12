public class IMC
{
    private double peso;
    private double estatura;

    private double comprobarNumero(double x) {
        if ( x > 0.0 )
            return x;
        else
            return 1.0;
    }

    private double obtenerResultado() {
        return peso / (estatura * estatura);
    }

    public IMC(double peso, double estatura) {
        this.peso = comprobarNumero(peso);
        this.estatura = comprobarNumero(estatura);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = comprobarNumero(peso);
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = comprobarNumero(estatura);
    }

    @Override
    public String toString() {
        return "Peso: " + peso +
                "\nEstatura: " + estatura +
                "\nIMC: " + String.valueOf(obtenerResultado());
    }
}
