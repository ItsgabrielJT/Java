// Para crear Clases que hereden tenemos que buscar una abstraccion general
// Es decir que, nuestra superclase tiene que ser muy general

public class Persona
{
    private String nombre;
    private String correo;
    private String cedula;
    private String numero;

    public Persona(String nombre, String correo, String cedula, String numero) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre +
                "\ncorreo = " + correo +
                "\ncedula = " + cedula +
                "\nnumero = " + numero;
    }
}
