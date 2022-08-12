public class StringFuntion
{
    // Uso de los defauts
    // La palabra default nos permite definir metodos con cuerpo dentro de las interfaces
    @FunctionalInterface
    interface StringOperator {
        int getAmount();

        default void operarte(String text) {
            int x = getAmount();
            while (x-- > 0) {
                System.out.println(text);
            }
        }
    }

    public static void main(String[] args) {
        StringOperator six = () -> 6;
        six.operarte("Alimno");
    }
}
