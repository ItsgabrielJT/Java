// StringBuilder y StringBuffer
// Nos permite crear objetos que almcenan cadenas y que pueden ser modificadas sin crear mas obejtos
// String builder nace como una salucion a la Inmutabilidad de String y el problema de memoria
// Ambas clases funcionan de la misma maneraa
// Ambas clases tiene los metodos append, insert, remove
// La diferencia es que StringBuffer se usa en proramas mas concurrentes

// Problemas al usar String
// Antes ya mencionamos que son inmutables y ocasionan grnades problemas de memoria
// Esto se debe a que en cada concatenacion se crean nuevos obejtos que se descartan raidamente
// Entonces java tiene un lmite de tiempo dentro de su basurero para eliminar obejtos


public class Cadena
{
    public static void main(String[] args) {

        // ejemplo de usar String
        String s = "hola"; // creando un obejto hola
        s = s + "edu"; // pasando el objeto hola y crenado un obejto edu
        // en s se guarda otro nuevo obejto que contiene la concatenacion
        // los anterioes son eliminados por el garbage collector

        System.out.println("-----------------------------------------------------------");

        // Ejemplo con StrinBuilder y String
        System.out.println("Empieza con un string");
        long comenzar = System.currentTimeMillis();
        String s1 = cadenaString();
        long finalizar = System.currentTimeMillis() - comenzar;
        System.out.println("Tiempo total: " + finalizar + " Milisegundos");

        System.out.println("Empieza con un stringBuilder");
        comenzar = System.currentTimeMillis();
        String s2 = cadenasStringBuilder();
        finalizar = System.currentTimeMillis() - comenzar;
        System.out.println("Tiempo total: " + finalizar + " Milisegundos");

    }

    private static String cadenasStringBuilder( ) {
        StringBuilder cadena = new StringBuilder();
        for ( int i = 0; i < 100000; i++ )
            cadena.append("x");

        return cadena.toString();
    }

    private static String cadenaString( ) {
        String cadena = "";
        for ( int i = 0; i < 100000; i++ )
            cadena += "y";

        return cadena;
    }
}
