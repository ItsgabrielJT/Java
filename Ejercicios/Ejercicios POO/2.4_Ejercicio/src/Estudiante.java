public class Estudiante
{
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, String apellido, String edad, String carrera, String semestre) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = Integer.parseInt(edad);
        this.carrera = carrera;
        this.semestre = Integer.parseInt(semestre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\nEdad: " + edad +
                "\nCarrera: " + carrera +
                "\nSemestre: " + semestre + '\n';
    }
}
