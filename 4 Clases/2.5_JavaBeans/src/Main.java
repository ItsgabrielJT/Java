// 1.- Que son JavaBeans
// Es una clase pura de java y usa ciertas reglas minimas
// La idea es que pueda ser usada por otras clases sin necesidad de conocer a detalle el contenido de la clase

// 2.- Reglas del JavaBenas
// Tener un constructor vacio
// Los atributos deben ser privados
// Cada prpiedad debe tener su metodo get o set,en caso de ser bolean en lugar de get se utilizara is
// Siempre implemnat la interface Serializable del paquet java.io

import bean.*;

public class Main
{
    public static void main(String[] args) {
        PersonBean persona = new PersonBean();
        persona.setEdad(23);
        persona.setNombre("Joel");

        System.out.println(persona.getNombre() + " " + persona.getEdad());
    }
}
