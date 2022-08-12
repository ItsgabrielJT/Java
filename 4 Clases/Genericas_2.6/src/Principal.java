import java.util.ArrayList;
import java.util.List;

public class Principal
{
    // Clases Genericas
    // Son covenciones de nombre que usamos para poder instanciar clases con un tipo de dato cualquiera pero sin especificar
    // Es decir, solo senalamos que habra un dato pero este puede ser de cuqluier tipo definido por el ususario

    // Convenciones de nombres Genericos
    // Java nos permite poner cualquier nombre o letra pero por convencion y buenas practicas de usan los siguientes
    // E, para elemeentos
    // K, para la llave de un map
    // V, para el valor de un map
    // N, para un numero
    // T, para un tipo generico
    // S, U, V, para varios tipos genericos

    public static void main(String[] args) {
        // Cuando usamos la clase sin definir el tipo de dato
        // No pasa nada, solo lo tema como un obejto cuaquiera
        // Y podemos usarlo como queramos
        Edad maestro = new Edad();
        maestro.setPersona("Nombre");
        System.out.println(maestro.getPersona());

        // POr otro lado cuando definimos el tipo de dato
        // Java, nos obliga a trabajr solo con ese tipo de dato
        // Hay que fijarse, que inluso ya nos senala con tipo de dato debemos llenar el metodo set
        Edad<Integer> policia = new Edad<>();
        policia.setPersona(23);

        // Aqui estamos haciedno usos de los wildcars
        List<Integer> numeros = new ArrayList<>();
        numeros.add(12);
        numeros.add(23);
        numeros.add(14);
        numeros.add(100);
        maestro.mostrarDatos(numeros);
    }
}
