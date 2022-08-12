package miembros.estudiantes;

import miembros.MiembroComunidad;

public class Estudiante extends MiembroComunidad
{
    private String semestre;
    private String carrera;

    public Estudiante(String nombre, String apellido, int edad, String cedula) {
        super(nombre, apellido, edad, cedula);
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Estudiante" +
                "\n- Semestre: " + semestre +
                "\n- Carrera: " + carrera;

    }
}
