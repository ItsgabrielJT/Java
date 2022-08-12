// 1.- Enumeraciones
// Son distintas a las clases y aqui se gardan valores contantes
// Como son constantes todo va en mayusuculas

// 2.- Usos de enum
// Siempre que demos valores a otros datos debmos de crear un atributo final
// Una vez creado el atributo siempre se debe tener un constructor

public enum Continentes
{
    AFRICA(23),
    EUROPA(234),
    ASIA(12),
    AMERICA(46),
    OCEANIA(2);

    private final int paises;

    Continentes(int paises) {
        this.paises = paises;
    }

    public int getPaises() {
        return paises;
    }
}