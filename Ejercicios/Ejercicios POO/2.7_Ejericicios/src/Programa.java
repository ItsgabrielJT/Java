import miembros.empleados.Administrador;
import miembros.empleados.Maestro;
import miembros.estudiantes.Estudiante;
import miembros.exmiembros.Exalumno;

public class Programa
{
    private static Administrador persona1 = new Administrador("Erick", "Lazcano", 34, "17234509");
    private static Maestro persona2 = new Maestro("Santiago", "Medrano", 23, "12340901");
    private static Estudiante persona3 = new Estudiante("Marco", "Guitiererez", 19, "1219018291");
    private static Exalumno persona4 = new Exalumno("Maria", "Sandoval", 25, "1267010220");


    public static void main(String[] args) {
        aignarDatosEmpleados();
        aignarDatosEstudiantes();
        aignarDatosExMiembros();
        System.out.println(persona1);
        System.out.println();
        System.out.println(persona2);
        System.out.println();
        System.out.println(persona3);
        System.out.println();
        System.out.println(persona4);
    }

    public static void aignarDatosEmpleados() {
        persona1.setHorario("3pm-5pm");
        persona1.setSueldo(899.90);
        persona1.setDocentes_asignados(12);
        persona1.setMaterias_asiganadas("Programacion, Comunicacion, Calculo");
        persona2.setHorario("7am-8pm");
        persona2.setSueldo(768.45);
        persona2.setNumero_alumnos(123);
        persona2.setNumero_aulas(3);
        persona2.setMaterias_asiganadas("Programacion");
    }

    public static void aignarDatosEstudiantes() {
        persona3.setCarrera("Sotfware");
        persona3.setSemestre("Tercero");
    }

    public static void aignarDatosExMiembros() {
        persona4.setFecha_graduado("2019A");
    }

}
