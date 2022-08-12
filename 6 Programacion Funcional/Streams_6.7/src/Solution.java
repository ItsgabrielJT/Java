// 1.- Que son los Streams
// Es una interfaz que permite realizar operaciones intermedias dentro de pbjetos iterables
// Cuando aplicamos la interfaz stream y cualquiera de sus metodos, todos retorna un stream

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IllegalFormatPrecisionException;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution
{
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------");
        // 2.- Funcion Foreach
        // Ejemplo para recorrer un arreglo con foreach sin usar streams
        String[] names = {"joel", "Marco", "Ingrid", "Paulina", "Alison", "Andres", "Nicol"};
        Arrays.asList(names)
                .forEach(System.out::println);

        // Ejemplo con Streams
        Stream.of(names).forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------");
        // 3.- Funcion filter
        // Es un metodo de la interface Stream. Resicbe un arreglo de streams,
        // Luego itera sobre cada valor del arreglo,
        // Retorna los elemetnos que fueron comprados por el predicate en forma de streams,
        // Asi que convertimos a lista todos esos elemtnos retornados por filter
        List<Employer> empleados = DataUtil.getEmpleados();
        Predicate<Employer> getpais = emp -> emp.getPais().equals("Ecuador");
        List<Employer> employersEcuador = empleados.stream().filter(getpais).toList();
        employersEcuador.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------------");
        // 4.- Funciones booleanas
        // Funcionan de igual forma que los filter pero estos retornan uniamente una sola respuesta

        // Evalua si todos los empledos no son Ecuatorianos
        // Como si hay algunos ecuatorianos da false
        boolean noneisEcaudor = empleados.stream().noneMatch(getpais);
        System.out.println(noneisEcaudor);

        // Evalua si todos los empleados son Ecuatorianios
        // Como no todos son ecuatorianos da false
        boolean allisEcuador = empleados.stream().allMatch(getpais);
        System.out.println(allisEcuador);

        // Evalua si alguien es Ecuatoriano
        // Con di hay algunos da como resultado true
        boolean anyisEcuador = empleados.stream().anyMatch(getpais);
        System.out.println(anyisEcuador);

        System.out.println("-----------------------------------------------------------------------");
        // 5.- Funcion Map
        // HAce lo mismo que los filters, sin embargo trabaja cada elemetno sobre una funcion y retorna
        // El resultado de la funcion

        Function<Employer, String> otherNamaes = new Function<Employer, String>() {
            @Override
            public String apply(Employer employer) {
                String correo = employer.getPais() + "@epn.ecu";
                return correo;
            }
        };
        List<String> newName = empleados.stream().map(otherNamaes).toList();
        newName.forEach(System.out::println);
      
    }
}
