import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{

    // Ceamos primeramente una variable para guardar la conexion de nuestra base de datos
    private Connection conexion;

    // Creamos otra variable para tener una sola conexion con la base de datos\
    private static Conexion instancia;

    // Creamos un constructor privado para que no se realizen instancias por el usuario y asi evitar
    // tener muchas conexiones a las bases de datos
    // Tambien nos ayuda a senalar que vamos a usar un Patron
    private Conexion() {

    }

    // Siempre tenemos que crear estar variables para poder conectarnos a la base de datos
    // Colocamos siempre localhost y el nombre de la base de datos
    private static final String URL = "jdbc:mysql://localhost/mitienda";
    private static final String USER = "root";
    private static final String PASSWORD = "toor"; // POrque se la asiganmos a DB Manager

    // Creamos un metodo donde nos conectaremos a la BDD, este retorna la conexion
    public  Connection conectarBaseDatos() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Nombrando nuestro conector
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
            return conexion;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conexion;
    }

    public void cerrarBaseDatos() throws SQLException {
        try {
            conexion.close();
            JOptionPane.showMessageDialog(null, "Conexion cerrada exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
            conexion.close();
        }
    }

    // Patron Singleton
    // Le mandamos static porque no vamos a usar new
    // Estamos diciendo que si no hay la istancia de la clase, nos haga una instancia
    // Si eciste, que solo no sretorne la instancia
    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

}
