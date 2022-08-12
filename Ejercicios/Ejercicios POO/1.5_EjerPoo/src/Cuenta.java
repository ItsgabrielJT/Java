/**
 * Clase Cuenta
 * @author gabrieljt
 */
public class Cuenta
{

    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public Cuenta(String titular) {
        this(titular, 0);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "titular = " + titular +
                "\ncantidad = " + cantidad;
    }

    /**
     * Ingresa un saldo y lo suma al atributo cantidad
     *
     * @param saldo
     */
    public void ingresar(double saldo) {
        if (saldo > 0) {
            this.cantidad += saldo;
        } else {
            System.out.println("No se aceptan valores negativos");
        }
    }

    /**
     * Devulve el saldo restante que quedo dentro del atrivuto cantidad
     *
     * @param cantidad
     * @return
     */
    public double retirar(double cantidad) {
        double saldo = cantidad - getCantidad();
        if (saldo < 0) {
            return 0;
        } else {
            return saldo;
        }
    }
}
