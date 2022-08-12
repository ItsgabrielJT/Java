import java.sql.*;

public class Conexion
{
    private static Connection coneccion;
    private static Conexion instancia;

    private final String URL = "";
    private final String USER = "root";
    private final String PASSWORD = "toor";

    public Connection conectarBaseDeDatos() {
        try {
            Class.forName("");
            coneccion = DriverManager.getConnection(URL, USER, PASSWORD);
            return coneccion;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return coneccion;
    }
}
