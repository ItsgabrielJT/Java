package manejointerfaces;
import datos.*;

public class Main
{
    public static void main(String[] args) {
        AccesoData datos = new ImplementacionOracle(); // Pasamos la referncia de la clase que implementa la interface
        ejecutar(datos, "listar");

        datos = new ImplementacionSql();
        ejecutar(datos, "insertar");

    }

    public static void ejecutar(AccesoData datos, String accion) {
        if ("listar".equals(accion))
            datos.listar();
        else if ("insertar".equals(accion))
            datos.insertar();
    }
}
