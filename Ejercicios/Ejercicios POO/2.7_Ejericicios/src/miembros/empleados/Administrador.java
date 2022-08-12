package miembros.empleados;

public class Administrador extends Docente
{
    private int docentes_asignados;

    public Administrador(String nombre, String apellido, int edad, String cedula) {
        super(nombre, apellido, edad, cedula);
    }

    public int getDocentes_asignados() {
        return docentes_asignados;
    }

    public void setDocentes_asignados(int docentes_asignados) {
        this.docentes_asignados = docentes_asignados;
    }

    public String toString() {
        return super.toString() +
                "Administrador" +
                "\n- Materias asiganadas: " + getMaterias_asiganadas() +
                "\n- Horarios: " + getHorario() +
                "\n- Sueldo: " + getSueldo() +
                "\n- Docentes a cargo: " + docentes_asignados;
    }
}
