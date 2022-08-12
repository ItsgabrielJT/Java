// 1.- Clase Abastracta
// Por defecto simpre seran aplicadas en clases padres
// son clases donde no se implementan todos los metodos
// no hace falta crear instancias de ellas

// 2.- Diferencia entre Interfaces y Clases Abstractas
// La clase abstracta se usan para objetos
// Las interfaces se usan para crear mas acciones

public class Main
{
    public static void main(String[] args)
    {
        // forma de polimorfismo
        Figura triangulo = new Triangulo();
        triangulo.dibujate();

        // Clase Anonima
        // Funciona solo de forma temporal y es apliacada mas con clases abstractas
        Figura cuadrado = new Figura() {
            @Override
            public void dibujate() {
                System.out.println("* * * * * *");
                System.out.println("*         *");
                System.out.println("*         *");
                System.out.println("*         *");
                System.out.println("* * * * * *");
            }
        };

        cuadrado.dibujate();
    }
}
