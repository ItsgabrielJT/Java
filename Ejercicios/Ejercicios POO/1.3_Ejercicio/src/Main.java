import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        ArrayList<Cuenta> clientes = new ArrayList<>();
        clientes.add(new Cuenta("Joel", "Tates", "1722879176", 23345.67));
        clientes.add(new Cuenta("Natalie", "Males", "1722874545", 2000.87));
        clientes.add(new Cuenta("Mary", "Sanao", "1722845645", 235.45));
        clientes.add(new Cuenta("July", "Kamabo", "1700079176", 2337));
        clientes.add(new Cuenta("Jony", "Dep", "1344579176", 2000));

        for (Cuenta listas : clientes) {
            System.out.println(listas + "\n");
        }
    }
}
