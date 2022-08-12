import com.aulas.clase.Alumno.Alumno;
import com.aulas.clase.Aula.Aula;
import com.aulas.clase.Comprobar.Comprobar;
import com.aulas.clase.Profesor.Profesor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sistema
{
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Joel", "Masculino", 12);
        Alumno alumno2 = new Alumno("Paulina", "Femenino", 12);
        Alumno alumno3 = new Alumno("Maria", "Femenino", 12);
        Alumno alumno4 = new Alumno("Noelia", "Femenino", 12);
        Alumno alumno5 = new Alumno("Pedro", "Masculino", 12);

        Profesor profesor1 = new Profesor("Marco", "Masculino", 34);
        profesor1.setMateria("Matematicas");

        Profesor profesor2 = new Profesor("Pablo", "Masculino", 30);
        profesor2.setMateria("Fisica");


        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);


        Aula aula1 = Comprobar.aula("Tercero A", "Matematicas", profesor1);
        accederClase(aula1, listaAlumnos);
        aula1.setNotasAlumnos(listaAlumnos);
        aula1.imprimirlistaAlumnos();

        System.out.println("-------------------------------------------------------------------------");

        Aula aula2 = Comprobar.aula("Tercero B", "Fisica", profesor2);
        accederClase(aula2, listaAlumnos);
        aula2.imprimirlistaAlumnos();
    }

    public static void accederClase (Aula aula, List<Alumno> alumnos) {
        if ( aula == null ) {
            System.out.println("Como es la materia incorrecta no se puede acceder a esta clase");
        } else {
            try {
                aula.setListaAlumnos(alumnos, aula);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
