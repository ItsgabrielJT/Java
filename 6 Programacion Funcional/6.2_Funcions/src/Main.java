import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class Main
{
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------");
        System.out.println("FUNCTION\n");

        // 1.- Creacion de una funcion que recibe un valor y retorna otro valor
        Function<Integer, Integer> cuadrado = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println(cuadrado.apply(5)); // Aplicando el metodo de la funcion

        // La felcha -> significa lo que nos dara como resultado;
        // Manera mas legible de definir funciones
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        System.out.println("-----------------------------------------------------------");
        System.out.println("PREDICATE\n");

        // 2.- Tipos de funciones definidas en Java
        // Predicate es un tipo de funcion que trabaja sobre un tipo y genera un boolean
        // Testea si algo es verdadero o falso
        Predicate<Integer> isEven = x -> x % 2 == 0;
        isEven.test(4); // True

        // Ejemplo con la clase Estudiante
        Predicate<Estudiante> aprobo = estudiante -> estudiante.getNota() > 6.0;
        Estudiante persona = new Estudiante(8.9);
        System.out.println(aprobo.test(persona));

        System.out.println("-----------------------------------------------------------");
        System.out.println("UNARYOPERATOR\n");

        // Unary Operator
        // Trabaja sobre cierto tipo definido y genera un resultadi del mismo tipo
        UnaryOperator <String> quote = text -> "\"" + text + "\"";
        System.out.println(quote.apply("Hol estudiante de patsi"));

        System.out.println("-----------------------------------------------------------");
        System.out.println("BIFUNCTION\n");

        // BiFunction
        // Recive dos tipos de datos y gnera otro tercer tipo de dato
        // Los dos primeros Integer son para los tipos de datos quw queremos recibir y el tercero es lo que genera
        // Un uso practico de BiFuntion es para formtear un textoz
        BiFunction <Integer, Integer, Integer> multiplicar = (x, y) -> x * y;
        System.out.println(multiplicar.apply(5, 4));

        System.out.println("-----------------------------------------------------------");
        System.out.println("BINARY OPERATOR\n");

        // BinaryOperator
        // Funciona de la misma manera que BIFunction
        // La diferencia es que aqui solo recive un tipo de dato
        BinaryOperator <Integer> problema =  (x, y) -> x * y;
        System.out.println(problema.apply(6, 5));

        System.out.println("-----------------------------------------------------------");
        System.out.println("INTERFACES FUNCTIONS\n");

        // 3.- Crear nuestra propia funcion

        // Interfaz de tipo SAM
        // Significa Single abstract method
        // Representa que es una interfaz con uns olo metodo sin definir

        // aca abajo estamos definiendo los tipos de datos que recibe y el tipo de dato qeu retorna
        @FunctionalInterface
        interface TriFunction <T, U, V, R> {
            R apply(T t, U u, V v);
        }

        // Le pasamos un integer y nos devuelve un string
        Function <Integer, String> agregarCero = x -> x < 10 ? "0" + x : String.valueOf(x); // Transforma a string

        TriFunction <Integer, Integer, Integer, LocalDate> convertirFecha =
                (dia, mes, anio) -> LocalDate.parse(anio + "-" +
                        agregarCero.apply(mes) + "-" + agregarCero.apply(dia));

        TriFunction <Integer, Integer, Integer, Integer> calcularEdad =
                (dia, mes, anio) -> Period.between (
                        convertirFecha.apply(dia, mes, anio), LocalDate.now()
                ).getYears();

        System.out.println(calcularEdad.apply(27, 07, 2002));

        System.out.println("-----------------------------------------------------------");
        System.out.println("CONSUMER\n");

        // 4.- Consumer
        //  Es una interfaz generica por lo que trabaja sobre un tipo de dato y no retorna nada
        // Los usos practicos de un sonsumer es poder realizar operaciones sobre un tipo de dato

        List<Double> valores = Arrays.asList(40d, 34.5d, 25d, 69d, 100d);
        Consumer<List<Double>> raices = lista -> {
            for(byte i = 0; i < lista.size(); ++i) {
                lista.set(i, Math.sqrt(lista.get(i)));
            }
        };

        valores.forEach(System.out::println);
        raices.accept(valores);
        valores.forEach(System.out::println);

        // Uso del mettodo andThend
        // Primero ejecuta el accept del consumer raices y luego el de imprimirlosta
        Consumer<List<Double>> impirmirLista = lista -> lista.stream().forEach(System.out::println);

        System.out.println("------------------------------------------------");
        raices.andThen(impirmirLista).accept(valores);
    }

    static class Estudiante {
        private double nota;

        public Estudiante(double nota) {
            this.nota = nota;
        }

        public double getNota() {
            return nota;
        }
    }
}
