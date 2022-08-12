package miembros.exmiembros;

import miembros.MiembroComunidad;

public class Exalumno extends MiembroComunidad
{
    private String fecha_graduado;

    public Exalumno(String nombre, String apellido, int edad, String cedula) {
        super(nombre, apellido, edad, cedula);
    }

    public String getFecha_graduado() {
        return fecha_graduado;
    }

    public void setFecha_graduado(String fecha_graduado) {
        this.fecha_graduado = fecha_graduado;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ex Estudiante" +
                "\n- Graduado: " + fecha_graduado;

    }
}
