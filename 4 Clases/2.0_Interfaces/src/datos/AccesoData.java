package datos;

public interface AccesoData
{
    // Se pone en gris las palabras claves porque por defecto ya estan declaras en la interfcae
    // Todos los metodos son abstractos que quiere decir que tienen que ser obligatoriamente implementados
    // por la clase que implmete la interfcae

    public static int MAX_REGISTROS = 10;
    abstract void insertar();
    abstract void listar();
}
