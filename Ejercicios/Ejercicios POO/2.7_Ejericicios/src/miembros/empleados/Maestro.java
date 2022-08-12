package miembros.empleados;

public class Maestro extends Docente
{
    private int numero_aulas;
    private int numero_alumnos;

    public Maestro(String nombre, String apellido, int edad, String cedula) {
        super(nombre, apellido, edad, cedula);
    }

    public int getNumero_aulas() {
        return numero_aulas;
    }

    public void setNumero_aulas(int numero_aulas) {
        this.numero_aulas = numero_aulas;
    }

    public int getNumero_alumnos() {
        return numero_alumnos;
    }

    public void setNumero_alumnos(int numero_alumnos) {
        this.numero_alumnos = numero_alumnos;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Maestro" +
                "\n- Materias asiganadas: " + getMaterias_asiganadas() +
                "\n- Horarios: " + getHorario() +
                "\n- Sueldo: " + getSueldo() +
                "\n- Numero de aulas: " + numero_aulas +
                "\n- Numero de alumnos: " + numero_alumnos;
    }
}
