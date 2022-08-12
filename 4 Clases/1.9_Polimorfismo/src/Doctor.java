
public class Doctor extends Persona
{
    private String especialidad;

    public Doctor(String nombre, String edad, String cedula, String especialidad) {
        super(nombre, edad, cedula);
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
        return super.toString() + "\nEspeciliadad = " + especialidad;
    }
}
