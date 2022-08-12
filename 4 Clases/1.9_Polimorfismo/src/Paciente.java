
public class Paciente extends Persona
{
    private String nacimiento;
    private double peso;
    private double estatura;
    private String sangre;

    public Paciente(String nombre, String edad, String cedula, String nacimiento, double peso, double estatura, String sangre) {
        super(nombre, edad, cedula);
        this.nacimiento = nacimiento;
        this.peso = peso;
        this.estatura = estatura;
        this.sangre = sangre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPeso = " + peso +
                "\nEstatura = " + estatura + "\nSangre = " + sangre;
    }
}
