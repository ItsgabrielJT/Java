package miembros.empleados;

public class Administrativo extends Empleado
{
    private String area_asignada;

    public Administrativo(String nombre, String apellido, int edad, String cedula) {
        super(nombre, apellido, edad, cedula);
    }

    public String getArea_asignada() {
        return area_asignada;
    }

    public void setArea_asignada(String area_asignada) {
        this.area_asignada = area_asignada;
    }
}
