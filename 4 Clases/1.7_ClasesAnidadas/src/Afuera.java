// 2.1 Clases Internas
// Tenemos que crear instancias de ellas
// Se dividen en dos tipos:
// Las Clases Locales a un Metodo y Clases anonimas


public class Afuera
{
    // Concepto general de clase Interna
    public class Interno
    {

    }

    // Clases Locales a un metodo
    // Las diferencia por el Scope de los miembros de la clase

    void correr() {
        class Local
        {
            void ejecutar() {
                System.out.println("Hola mundo");
            }
        }

        // Estamos utilizando el miembro de una clase
        Local valor = new Local();
        valor.ejecutar();
    }
}
