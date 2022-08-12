import java.util.Scanner; // Usa el tipo de dato Scanner
import javax.swing.JOptionPane;

public class Lectura
{
    public static void main (String[] args)
    {
        // LECTURA POR CONSOLA
        // Primera forma con clase Scanner

        Scanner lectura = new Scanner(System.in); // Creamos un obejto Scanner
        int numero;
        System.out.println("ingrese un numero: ");
        numero = lectura.nextInt();
        System.out.println("El numero es: " + numero + "\n");

        float decimale;
        System.out.println("ingrese otro numero: ");
        decimale = lectura.nextFloat(); // se tiene que iongresar con coma
        System.out.println("El numero es: " + decimale);

        // LECTURA POR VENTANA
        String cadena;
        int edad;
        char letra;

        cadena = JOptionPane.showInputDialog("Ingrese un nombre: "); // Siempre entraga un string
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingres su edad: "));
        letra = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0); // recogemos primer caracter

        JOptionPane.showMessageDialog(null, "Tu nombre es " + cadena); // Mostramos mensajes
        JOptionPane.showMessageDialog(null, "Tu edad es " + edad);
        JOptionPane.showMessageDialog(null, "Tu letra es " + letra);
    }
}
