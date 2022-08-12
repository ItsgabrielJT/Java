// 1.- Metodo Constructor
// Seimpre esta definido despues de la palabra new
// Siemore usa el nombre de la clase y los parentesis
// Java ya tiene declarado ese metodo por defecto
// Nos ayuda a crear nuevas instancias, es decir crea nuevos obejtos
// Puede tener 0 o mas de 1 un argumento
// No regresa ningun valor

public class Main
{
    public static void main(String[] args)
    {
        Doctor mi_doctor = new Doctor("Joel"); // Desde aqui se ejecuta el constructor
        mi_doctor.nombre = "Armando";
    }
}
