package datos;

public class ImplementacionSql implements AccesoData
{
    @Override
    public void insertar() {
        System.out.println("Insertar desde Sql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Sql");
    }
}
