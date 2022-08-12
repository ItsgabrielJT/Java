public class Chaining
{
    // El chaining nos permit encadenar el resultado de una ejecucion con respecto a otro
    // Este tipo de chainign e usa mas en composicion de funciones
    // Nos da el beneficion de no almacenar los resultados

    public static void main(String[] args) {

        // Ejemplo de chaining on String builder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hola")
                .append("Jose")
                .append("Como estas");

        // Ejemplo creado por nosotros
        Mensaje palabras = new Mensaje();
        palabras.decirHI().decirAdios();
    }

    static class Mensaje {
        public Mensaje decirHI() {
            System.out.println("Hola");
            return this; // Nos devuelve la misma instancia
        }

        public Mensaje decirAdios() {
            System.out.println("Adios");
            return this;
        }
    }
}
