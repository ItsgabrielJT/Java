// 2.2- Clases estaticos
// Clases anidadas de tipo static
// No necistan crear instancias para llamarlas
// Solo se pueden llamar a los metodos staticos

import java.util.ArrayList;
import java.util.Date;

public class Externo
{
    String nombre;
    String area;

    ArrayList <Cita> citas = new ArrayList<>(); // Creando una coleccion de objetos

    public void setCitas(Date fecha, String hora) {
        citas.add(new Externo.Cita(fecha, hora));
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public static class Cita
    {
        private int id;
        private Date fecha;
        private String hora;

        public Cita(Date fecha, String hora) {
            this.fecha = fecha;
            this.hora = hora;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }
    }
}
