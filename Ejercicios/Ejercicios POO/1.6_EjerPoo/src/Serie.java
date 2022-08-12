public class Serie implements Entregable
{
    private final static int NUM_TEMP_DEF = 3;
    private final static boolean ENTREGADO = false;
    public final static int MENOR = -1;
    public final static int MAYOR = 1;
    public final static int IGUAL = 0;

    private String titulo;
    private int numero_temporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    // Constructores

    public Serie() {
        this.titulo = "";
        this.genero = "";
        this.entregado = false;
        this.creador = "";
        this.numero_temporadas = NUM_TEMP_DEF;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = "";
        this.entregado = ENTREGADO;
        this.numero_temporadas = NUM_TEMP_DEF;
    }

    public Serie(String titulo, int numero_temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numero_temporadas = numero_temporadas;
        this.entregado = ENTREGADO;
        this.genero = genero;
        this.creador = creador;
    }

    // Metodos


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero_temporadas() {
        return numero_temporadas;
    }

    public void setNumero_temporadas(int numero_temporadas) {
        this.numero_temporadas = numero_temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", numero_temporadas=" + numero_temporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'';
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
        Serie ref = (Serie)a;
        if (numero_temporadas > ref.getNumero_temporadas()) {
            estado=MAYOR;
        } else if (numero_temporadas == ref.getNumero_temporadas()) {
            estado=IGUAL;
        }

        return estado;
    }
}
