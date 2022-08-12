import java.util.function.Function;

public class MarhOperation
{
    // 1.- Compose
    // Compose genera una fucnion en la que no podemos interferir
    // Es decir no podemos usar un cuerpoentero sino usamos una lamda
    // LO que hace compose es ejecutar primero la funcion dentro de ella
    // y luego ejecuta la funcion donde esta ubicada


    public static void main(String[] args) {
        // Esto de aqui hace que primero se ejecute la funcion que agregamos
        Function<Integer, Integer> multiples = x -> {
            System.out.println("Muñtiplicando por x: " + x + "por 3");
            return x * 3;
        };

        Function<Integer, Integer> agegarMultiple =
                multiples.compose(y -> {
                    System.out.println("Le agregare 1 a: " + y);
                    return y + 1;
                });

        // Si queremos hacer otra accion despues de la funcion hacems esto
        Function<Integer, Integer> multipliCuadrado =
                agegarMultiple.andThen(x -> {
                    System.out.println("Estamos elevando " + x + " al cuadrado");
                    return x * x;
                });

        System.out.println(agegarMultiple.apply(5));
        System.out.println(multipliCuadrado.apply(3));

    }
}
