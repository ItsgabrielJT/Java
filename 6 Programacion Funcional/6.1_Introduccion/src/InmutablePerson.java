// En este caso Hacemos contantes la clase, la lista y el metodo get
// El contructor pide que agregemos todos los valores por tanto no van a poder ser cmabiados
// Cuando se accede a los emils este genera una copia y no modifica los datos

import java.util.LinkedList;
import java.util.List;

public final class InmutablePerson
{
    private final String first_name;
    private final String last_name;

    private final List<String> emails;

    public InmutablePerson(String first_name, String last_name, List<String> emails) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.emails = emails;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public final List<String> getEmails() {
        return new LinkedList<>(emails);
    }

    @Override
    public String toString() {
        return "InmutablePerson{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", emails=" + emails +
                '}';
    }
}
