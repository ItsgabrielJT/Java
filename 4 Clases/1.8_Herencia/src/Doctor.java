// Esta clase va a heredar de Persona

// 2.- Conceptos de super y this
// super = indica que una variable o metodo es de la superclase
// this = permite especificar que la variable usada es de la misma clase

public class Doctor extends Persona
{
    private String especialidad;

    public Doctor(String nombre, String correo, String cedula, String numero, String especialidad) {
        super(nombre, correo, cedula, numero); // indica el constructor de la clase Padre
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEspecialidad = " + especialidad;
    }
}
