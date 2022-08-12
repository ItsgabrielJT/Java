// Los JavaDoc son la documntacion de nuestro codigo y esto lo publica en html
// Estos son la informacion que se nos da cuando ponemos nuestro cursosr encima de la funcion o clase

public class Funcion
{
    // para prbar JavaDoc vamos a crear una funcion de conversion de cmoneda

    public static void main(String[] args)
    {
        System.out.println("Pesos a dolares: " + convertirDolar(200, "MXN"));
    }

    /*
     Todo lo que comentemos aui se mostrara en la documentacion
     Los @param son tags, es decir como subtitulos
    */

    /**
     *Descripcion: Funcion que convierte el dinero espeificando la moneda
     *
     * @param cantidad Cantidad de dinero
     * @param moneda Tipo de moneda: Solo aceptra MXN o COP
     * @return cantidad Devuelve la cantidad actualizada en dolares
     */
    public static double convertirDolar(double cantidad, String moneda)
    {
        switch(moneda)
        {
            case "MXN":
                cantidad = cantidad * 0.052;
                break;
            case "COP":
                cantidad = cantidad * 0.00031;
                break;
        }
        return cantidad;
    }

    // Tipos de Tags en Java
    /*
        * @autor: autor de la clase
        * @code: muestra texto en formato de codigo sin que sea interpretado como html
        * @docRoot: Indica la ruta relativa del directorio de raiz
        * @exception: Se indica cunado es vulnerable a una excepcion
        * @inheritDoc: Indica la herencia o implementacion
        * @link: hace un enlace al miembro indicado
        * @linkplain: lo mismoo del anterior solo que muestra el enlace en texto plano
        * @see: maneja referencias o informacion relacionada
     */

}

