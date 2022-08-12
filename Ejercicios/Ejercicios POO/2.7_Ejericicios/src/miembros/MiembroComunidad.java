package miembros;

public class MiembroComunidad
{
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;

    public MiembroComunidad(String nombre, String apellido, int edad, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "MiembroComunidad" +
                "\n- Nombre: " + nombre +
                "\n- Apellido: " + apellido +
                "\n- Edad: " + edad +
                "\n- Cedula: " + cedula + '\n';
    }
}
