public class Memoria
{
    // 1.- Memoria Stack
    // Se utiliza para almacenar las variables locales y las llamadas alas funciones
    // Tienen un periodo de duracion corto debido a que se activan solo cuando son nombradas
    // Almacena dorectamente el valor de la variable

    // 2.- Memoria Heap
    // Se utiliza para almacenar los objetos y atributos
    // El periodo de duravion de estaos es mas alargado
    // Almacenan la referencia de la direccion de memoria del obejto

    public static void main(String[] args) {
        // Esto permite que ambas variables pudan acceder a los metodos y atributos de la clase
        // Sin la necesidad de crear otro objeto
        // Solo se esta creando un objeto

        Persona p1 = new Persona(); // La variable p1 apunta o almacena una referencia al objeto de tipo Persona
        Persona p2 = p1; // La variable p2 Apunta tambien apunta al mismo objeto

        p2.setApellido("Tates"); // Aqui se puede ver que puede usar los metodos de la clase sin haber instanciado de nuevo

        p1 = null; // Aqui estamos haciendo que p1 Deje de almacenar la referencia al objeto
        p2.setNombre("Joel"); // Pero aqui p2 todavia apunta al objeto debido a que null solo afecta a la variable asiganada
        // p1.setNombre("Gabriel"); // Si colocamos esto veremos que existe un eror porque p1 esta vacio

        p2 = null; // SI hacemos esto ya ninguna de las variable apunta al obejto
        // Por tanto como nadie apunta al objeto, este es elminado de la memoria, para que no sea elimiando al menos una variable
        // Tiene que referenciar al objeto
    }

    protected static class Persona
    {
        private String nombre;
        private String apellido;
        private int edad;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
}
