import java.util.ArrayList;
import java.util.List;

public class DataUtil
{
    public static List<Employer> getEmpleados() {
        List<Employer> empleados = new ArrayList<>();
        empleados.add(new Employer("Joel", "Ecuador"));
        empleados.add(new Employer("Maria", "Ecuador"));
        empleados.add(new Employer("MArco", "Argentina"));
        empleados.add(new Employer("Paulina", "Brasil"));
        empleados.add(new Employer("Alison", "Ecuador"));
        return empleados;
    }

}
