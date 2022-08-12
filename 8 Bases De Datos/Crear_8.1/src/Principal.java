import java.sql.SQLException;

public class Principal
{
    // Que es JDBC
    // Sus sigalas significan Java Database Conectivity
    // Nos proporciona un acceso a cualqueir estndar de SQL que sea relacional
    // Nos permite establcer una conexion, enviar setencias SQL, procesa resultados

    // Que es el Driver de Java
    // Nos ayuda a incluir el api JDBC al proyecto que hacemos
    // Se compone de interfaces neutrales que nos permiten trabajr con SQL
    // Conection, ResultSet, PreparedStatement, CallabdStatement

    // Que es mysql-conector-java
    // Nos descargamos de la pagina de MySQL, este contiene la clase Driver que nos permitira
    // Trabajr dentro del IDE con todo lo de SQL
    // Para agregarlo despues de descargarlo,
    // nos vamos a FIle, Project Structure, Modules, Dpeendencies, JAR Files y agregamos el archivo con ok

    // Que es el PAtron Singleton
    // Definida en la ingenieria de software, singleton o instancia unica
    // Es un patron de diseno que deniega la creacion de obejtos a una clase
    // Esto garantiza que la clase temga una sola instancia
    // Y se pueda accderder a esta instancia de forma global

    public static void main(String[] args) {
        Conexion base = Conexion.getInstancia();
        try {
            base.conectarBaseDatos();
            base.cerrarBaseDatos();
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
