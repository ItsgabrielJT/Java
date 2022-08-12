// 1.- Que es una funcion
// Es un tipo de dato que genera un valor y a partir de un valor x
// Tambien es una serie de datos parametrizados
// Puede o no devolve un resultado
// Se puede definir, almacenar o declarar bajo demanda
// Podemos definir funciones con respecto a otras funciones, conocido como recursividad

// 2,. Tipos de funciones
    // 2.1 Funciones Puras
    // Una funcion que genera el mismo resultado para el mismo parametro
    // No dependen del estado del sistema ni de ningun contexto
    // Son muy oredecibles con su resultado
    //n Las funciones puras no puden invocar funciones impuras, pero si puede puras

    // 2.2 Funciones Impuras
    // Generan efectos secundarios
    // Un efecto secundario es todo cambio  observable desde fuera del sistema
    // Podemos rducir o controlar los efecctos secundarios

    // 2.3 Funciones de Orden Mayor
    // Las fucniones de orden mayor cumple con algunas de las dos casracteristicas o ambas:
    // Toma otra fucnion como parametro o retorna una funcion como resultado

    // 2.4 Funciones Lambda
    // Son fucniones anonimas, es decir que no tienen nombre
    // Se usa para cmportamientos unicos y en un solo momento
    // Es una funcion extrremedamente simple

// 3.- Inmutabilidad
    // 3.1 Ventajas
    // No se puede alterar
    // Facilita crear funciones puras
    // Faculita usar threads/concureencias

    // 3.2 Desventajas
    // Nueva instancia por cada set de modificadores
    // Requiere especial atencion al diseño
    // Objetos mutables fuera de nuestro alcance

import java.util.LinkedList;
import java.util.List;

public class Main
{
    // Suponemos el caso en el que nuestra clase Persona es mutable
    // Conforme avanzamos tratamos de solucionar este problema
    // Tambien hacemos esto porque no sabemos que hace el metodo badFuncion

    public static void main(String[] args) {
        List<String> sier_email = new LinkedList<>();
        sier_email.add("joel@gmail,com");

        // Poco de peligros de  una clase mutable sin concoer que hace el metodo badFunction

        MutablePerson sier = new MutablePerson();
        sier.setEmails(sier_email);
        sier.setFirst_name("Joel");

        System.out.println(sier);
        badFunction(sier);
        System.out.println(sier);

        System.out.println("///////////////////////////////////////////////////////////////////////////////");

        // Probando que tl esta el cambio creando otra clase sin conocer tambein el metodo
        MutablePersonDos person_dos = new MutablePersonDos(sier_email);
        System.out.println(person_dos);
        badFunction(person_dos);
        System.out.println(person_dos);

        System.out.println("///////////////////////////////////////////////////////////////////////////////");

        // Como sigue siendo mutable probamois con otra clase Pero nombrandola como contante, sin conocer el metodo
        MutablePersonTres person_tres = new MutablePersonTres(sier_email);
        System.out.println(person_tres);
        badFunction(person_tres);
        System.out.println(person_tres);

        System.out.println("///////////////////////////////////////////////////////////////////////////////");

        // Alguin usa nuestra clase pero lo empeora , sin conocer el metodo
        MutablePersonTres person_four = new MutablePersonFour(sier_email);
        System.out.println(person_four);
        badFunction(person_four);
        System.out.println(person_four);

        System.out.println("///////////////////////////////////////////////////////////////////////////////");

        // Aqui ya nuestra clase deja de ser mutable, sin conocer el metodo
        InmutablePerson personin = new InmutablePerson("Joel", "Tates", sier_email);
        System.out.println(personin);
        badFunction(personin);
        System.out.println(personin);
    }

    static void badFunction(MutablePerson person) {
        List<String> emails = person.getEmails();
        emails.clear();
        emails.add("imnotbadguy@email.com");
    }

    static void badFunction(MutablePersonDos person) {
        List<String> emails = person.getEmails();
        emails.clear();
        emails.add("imnotbadguy@email.com");
    }

    static void badFunction(MutablePersonTres person) {
        List<String> emails = person.getEmails();
        emails.clear();
        emails.add("imnotbadguy@email.com");
    }

    static void badFunction(InmutablePerson person) {
        List<String> emails = person.getEmails();
        emails.clear();
        emails.add("imnotbadguy@email.com");
    }
}
