package miembros.empleados;

import miembros.MiembroComunidad;

public class Empleado extends MiembroComunidad
{
    private String horario;
    private double sueldo;

    public Empleado(String nombre, String apellido, int edad, String cedula) {
        super(nombre, apellido, edad, cedula);
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
