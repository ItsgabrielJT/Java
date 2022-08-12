public class Division
{
    // POdemos lqnzar una excepcion de la clase RuntimeEscepcion, colocando un mensaje de error definido por nostros
    // Cuando se lanze la excepcion mostrara ese mentaje;
    public static int dividir(int numerador, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No es validad la division para cero");
        }
        return numerador / divisor;
    }
}
