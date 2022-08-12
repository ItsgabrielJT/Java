// Aqui estamos diciendo que nuestro clase trabaje con un tipo de dato, todavia no definido
// Cuando usamos egnericos podemos trabajr con ellos como si fuera cualquier tipo de dato mas

import java.util.List;

public class Edad<E>
{
    private E persona;

    public E getPersona() {
        return persona;
    }

    public void setPersona(E persona) {
        this.persona = persona;
    }

    // Wildcards
    // Son elementos que tienen tambien otro generico
    // Aca abajo estamos diciendo que queremos recibir una lista como argumento
    // El ?, significa que no sabemos de que tipo sera la lista
    // extends Number, quiere decir que no sabemos el dato de la lista pero que queremos que sea de enteros

    public void mostrarDatos(List< ? extends Number> lista) {
        for (Number number: lista) {
            System.out.println(number);
        }
    }
}
