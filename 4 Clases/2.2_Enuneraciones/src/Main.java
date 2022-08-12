public class Main
{
    public static void main(String[] args) {
        System.out.println("Contienente no 4: " + Continentes.AMERICA);
        System.out.println("Paises en America: " + Continentes.AMERICA.getPaises());

        System.out.println();
        indicarPaises(Continentes.AFRICA);
        imprimirContienentes();
    }

    public static void indicarPaises(Continentes continentes) {
        switch (continentes) {
            case AFRICA:
                System.out.println("Numero de paises en: " + continentes + ": " + continentes.getPaises());
        }
    }

    public static void imprimirContienentes() {
        for (Continentes c: Continentes.values()) {
            System.out.println("Continentes: " + c + " contiene " + c.getPaises() + " paises.");
        }
    }
}
