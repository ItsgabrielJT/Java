import java.util.Scanner;

public class Programa
{
    public static void main(String[] args) {
        IMC persona1 = new IMC(1.0, 1.0);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el peso: ");
        double peso = entrada.nextDouble();
        persona1.setPeso(peso);
        System.out.print("Ingrese la estatura: ");
        double estatura = entrada.nextDouble();
        persona1.setEstatura(estatura);
        System.out.println(persona1);
    }
}
