public class Cuenta extends Cliente
{
    private int numero_cuenta;
    private double saldo;

    public Cuenta(String nombre, String apellido, String cedula, double saldo) {
        super(nombre, apellido, cedula);
        this.saldo = saldo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double ingresarDinero(double dinero_extra) {
        saldo = saldo + dinero_extra;
        return saldo;
    }

    public double sacarDinero(double salida_dinero) {
        saldo = saldo - salida_dinero;
        return saldo;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNumero de cuenta: " + numero_cuenta + "\nSaldo: " + saldo;
    }
}
