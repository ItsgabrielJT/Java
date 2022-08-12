import java.sql.*;

public class BaseDato
{
    private static Connection conexion;
    private static BaseDato instancia;
    private final String URL = "jdbc:mysql://localhost:3306/mitienda";
    private final String USER = "root";
    private final String PASSWORD = "toor";

    private BaseDato() {

    }

    public Connection conectarBasedeDatos() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            return conexion;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return conexion;
    }

    public void cerrarBasedeDatos() throws SQLException {
        try {
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
            conexion.close();
        }
    }

    public static BaseDato getInstancia() {
        if (instancia == null) {
            instancia = new BaseDato();
        }
        return instancia;
    }
}
