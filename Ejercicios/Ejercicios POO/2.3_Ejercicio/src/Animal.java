public class Animal
{
    private String nombre;
    private double peso;
    private String genero;

    private String validarNombre(String texto) {
        String nombre = "";
        try {
            nombre = texto;
        }catch (Exception e) {
            nombre = "";
        }
        return nombre;
    }

    private String validargenero(String texto) {
        String genero = "";
        try {
            genero = texto;
        }catch (Exception e) {
            genero = "";
        }
        return genero;
    }

    private double validarPeso(double x) {
        double peso = 0.0;
        try {
            peso = x;
        }catch (Exception e) {
            peso = 0.0;
        }
        return peso;
    }

    public Animal(String nombre, String genero, double peso) {
        this.nombre = validarNombre(nombre);
        this.peso = validarPeso(peso);
        this.genero = validargenero(genero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nGenero: " + genero +
                "\nPeso: " + peso + "\n";
    }
}
