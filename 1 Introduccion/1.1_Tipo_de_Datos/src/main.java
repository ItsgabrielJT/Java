public class main
{
    /*
        Java es un lenguaje de tipeo fuerte por tanto hay que definir el tipo de variable
    */
    public static void main(String[] args)
    {
        // La convencion de nombres de variables puede ser con "$", "_" y todo con minusculas

        // 1.- Tipo de datos primitivos
        int num1 = 23; // = 4 bytes
        // -128 a 127 = 1 byte
        byte $num = -127;
        short $num2 = -32303; // -32768 a 32767 = 2 bytes
        long cedula = 1722879176; // = 8 bytes
        double num2 = 3.45555; // Los double son mas precisos
        float num3 = 3.45f; // La f especifica que es float
        char caracter = 'c';
        boolean verdad = false;
        var nombre = 12; // Con var infiere el tipo de dato que asignmos

        // 2.- Tipo de datos obejtos strings

        String nombre$dos = "Lucas";
        String frase = "Hola, mi nombre es ";
        System.out.println(frase + nombre$dos);

        // 3.- Tipos de datos clases o wrappers
        // Estos datos no son obejtos, contienen metodos, No se usan para operaciones ni comparaciones

        Integer numero = 134; // Asiganr de esta froma se concce como autoboxing
        Integer valor = null;
        Boolean datos = true;
        Float flotantobj = 23.2F;
        Double num = 2.34;
        Character dato = 'c';

        int cambair = numero; // Hacer esto se llama Unboxing, pasamos de object a primitivo

        // 4.- Datos constantes

        final int SIEMPRE_ATU_LADO = 12; // Conebcon de nombres para constantes
        System.out.println(SIEMPRE_ATU_LADO);

        // 5.- Cast
        // Consiste en cambiar el tipo de dato

        double cambiado = 12.3455;
        int entero = (int) cambiado;
        System.out.println(entero);
    }
}
