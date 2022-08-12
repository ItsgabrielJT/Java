package miembros.empleados;

public class Docente extends Empleado
{
    private String materias_asiganadas;

    public Docente(String nombre, String apellido, int edad, String cedula) {
        super(nombre, apellido, edad, cedula);
    }

    public String getMaterias_asiganadas() {
        return materias_asiganadas;
    }

    public void setMaterias_asiganadas(String materias_asiganadas) {
        this.materias_asiganadas = materias_asiganadas;
    }
}
