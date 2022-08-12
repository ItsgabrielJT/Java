import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class NombreUtil
{
    // metodo que genera una lista de tipo y recibe una cantidad indefinida de elemntos
    static <T> List <T> getList (T... elements) {
        return Arrays.asList(elements);
    }

    public static void main(String[] args) {

        // Forma en la que podriamos impirmir una lista de profesores
        List <String> profesores = getList("Nicolas, Paula, Loandro");
        // Crwmoad un consumer del mismo tipo de dato de nuestra lista
        Consumer<String> printer = text -> System.out.println(text);
        profesores.forEach(printer);

        // Otra forma de hacer los mismo pero con el operador ::
        // Este operador :: significa que busca un metodo, funcion definida en el objeto
        System.out.println("////////////////////////");

        profesores.forEach(System.out::println); // Esto es lo mismo que usar el consumer

        // Referencias
        // Existen metodos que son tomados como fucniones pero para ello tienen
        // Que cumplir con la misma cantidad y tipo de parametros para crear el mismo resultado
        // El operador de referencia ::

        // Lambdas
        // Las lambadas no pueden ser reutilizables
        // Solo pueden usarse unicamente en el lugar qiue se declararon
        // Como es el caso de curso
        List <String> cursos = getList("tercero" "primero", "segundo");
        cursos.forEach(curso-> System.out.println(curso));

        // Otro ejemplo de uso de lambdas
        // (), signific que no tiene parametros y el 2, significa el valor de retorno
        // La felcah ->, es el cuerpo de la lambda
        usarCero(() -> 2);
        usarPrecicate(text -> text.isEmpty());

        // Lamda con cuerpo mas robusto
        // Usamos las llaves para especificar un cuerpo mas detllado
        // Al usar las llaves tenemos que colocar explicitimanet el return
        usarBiFunction((x, y) -> {
            System.out.println("X: " + x + ", Y: " + y);
            return x - y;
        });
        
        // Espeecificar directamenete el tipo de dato
        // Cae aclarar que las funciones solo trabajan con objetos no con datos primitivos
        // Hcaer eso mejora la legibilidad del codigo
        usarBiFunction((Integer x, Integer y) -> x * y);
    }

    static void usarCero (CeroArgument argumentos) {

    }

    static void usarPrecicate (Predicate<String> comprobar) {

    }

    static void usarBiFunction (BiFunction<Integer, Integer, Integer> devolver) {

    }

    @FunctionalInterface
    interface CeroArgument {
        int ge();
    }
}
