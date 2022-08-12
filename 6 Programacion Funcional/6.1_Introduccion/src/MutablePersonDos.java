import java.util.List;

// En este caso para tratar de que mi clase no sea mutable elimanomos el set para evitar que ingresen otros correos
// Y agregamos el contructor para que quede inicializada y no cambie el vslor

public class MutablePersonDos
{
    private String first_name;
    private String last_name;

    private List<String> emails;

    public MutablePersonDos(List<String> emails) {
        this.emails = emails;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<String> getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        return "MutablePerson{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", emails=" + emails +
                '}';
    }
}
