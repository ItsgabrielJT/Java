import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Programa
{
    private static BaseDato conn = BaseDato.getInstancia();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String email = entrada.nextLine();
        String nombre = entrada.nextLine();
        String direccion = entrada.nextLine();
        String celular = entrada.nextLine();
        String password = entrada.nextLine();

        try {
            Connection conexion = conn.conectarBasedeDatos();
            PreparedStatement insert = conexion.prepareStatement("INSERT INTO users VALUES(?, ?, ?, ?, ?, ?)");
            insert.setString(1, null);
            insert.setString(2, email);
            insert.setString(3, nombre);
            insert.setString(4, direccion);
            insert.setString(5, celular);
            insert.setString(6, password);
            insert.executeUpdate();
            conn.cerrarBasedeDatos();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
