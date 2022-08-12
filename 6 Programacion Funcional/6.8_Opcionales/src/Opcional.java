import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

// Optionals
// Nos sirven para evitarnos prblemas con valores inexistentes
// A partir de culquier tipo de funciones, no nos preocupamos por el valor de retorno

public class Opcional
{
    // ejemplo sin optional
    // Lo ideal para retorn<r una lista es tener una lista inicial y sobre esa lista agregar elementois
    // Y retornar dicha lista
    // De esta forma evitamos retornan un nulo
    static List<String> getName() {
        List<String> lista = new LinkedList<>();
        return Collections.emptyList(); // Con esto retornanmos una lista sin elementos
    }

    // ejemplo con Optional
    static Optional<List<String>> getOptionalsNames() {
        return Optional.ofNullable(new LinkedList<>());
    }

    public static void main(String[] args) {
        // Tenemos que revisar el resultado de getnames, es decir que no sea nulo
        // Pero en caso de string no hay nulos solo vacios
        List<String> names = getName();
        if (names != null) {
            System.out.println(names);
        }

        // La clase optional nos ayuda a no adivinar cuando hay un dato o cuando hau null
        // Que en caso de usar strings o enteros son muy distintos casos
        Optional<List<String>> optionalNames = getOptionalsNames();
        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));
    }
}
