import java.util.List;

// Ahora como lo anterior no funciono hacemos que la lista sea contante

public class MutablePersonTres
{
    private String first_name;
    private String last_name;

    private final List<String> emails;

    public MutablePersonTres(List<String> emails) {
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
