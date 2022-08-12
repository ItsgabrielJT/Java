import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentUtil
{


    // supplier
    // Es una interfaz o un tipo de funcion que se encarga de generar datos o proveer datod
    // Uj uso practico puede ser cuando se genera archuvo, configuraciones etc.
    static CLIArgumet generateCLI() {
        Supplier <CLIArgumet> generator = () -> new CLIArgumet();
        return generator.get(); // Unico metodo de la interfaz
    }
}
