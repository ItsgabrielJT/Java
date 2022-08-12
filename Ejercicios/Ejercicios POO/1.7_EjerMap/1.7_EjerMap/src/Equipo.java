public class Equipo
{
    private String posicion;
    private int dorsal;

    public Equipo(String posicion, int dorsal) {
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "     --- Posicion: " + posicion + "     ---Dorsal: " + dorsal;
    }
}
