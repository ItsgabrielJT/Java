public class EspadaMadera extends Espada
{
    @Override
    public int danioPersonaje(Personaje personaje) {
        setFuerza(1);
        int danio = getFuerza();
        return personaje.getVida() - danio;
    }

    @Override
    public void mostrarPoder() {

    }
}
