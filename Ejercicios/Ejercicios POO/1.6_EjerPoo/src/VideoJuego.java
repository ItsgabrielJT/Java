public class VideoJuego implements Entregable
{
    // Constantes
    private final int HORAS_ESTIMADAS_DEF = 10;
    private final boolean ENTREGADO = false;
    public final static int MENOR = -1;
    public final static int MAYOR = 1;
    public final static int IGUAL = 0;

    // Atributos
    private String titulo;
    private int horas;
    private boolean entregado;
    private String genero;
    private String compania;

    // Constructores
    public VideoJuego() {
        this.titulo = "";
        this.horas = HORAS_ESTIMADAS_DEF;
        this.entregado = ENTREGADO;
        this.genero = "";
        this.compania = "";
    }

    public VideoJuego(String titulo, String compania) {
        this.titulo = titulo;
        this.horas = HORAS_ESTIMADAS_DEF;
        this.entregado = ENTREGADO;
        this.genero = "";
        this.compania = compania;
    }

    public VideoJuego(String titulo, int horas, String genero, String compania) {
        this.titulo = titulo;
        this.horas = horas;
        this.entregado = ENTREGADO;
        this.genero = genero;
        this.compania = compania;
    }

    // Metodos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", horas=" + horas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'';
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object a) {
        int estado = MENOR;
        //Hacemos un casting de objetos para usar el metodo get
        VideoJuego ref = (VideoJuego)a;
        if (horas > ref.getHoras()) {
            estado=MAYOR;
        } else if (horas == ref.getHoras()) {
            estado=IGUAL;
        }

        return estado;
    }
}
