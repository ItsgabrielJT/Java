import java.util.List;

public class MutablePerson
{
    private String first_name;
    private String last_name;

    private List<String> emails;

    public MutablePerson() {

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

    public void setEmails(List<String> emails) {
        this.emails = emails;
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
