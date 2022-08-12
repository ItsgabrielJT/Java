import java.util.*;

// En este caso alguien hereda de nuestra clase y cambia los emials

public class MutablePersonFour extends MutablePersonTres
{
    public MutablePersonFour(List<String> emails) {
        super(emails);
    }

    @Override
    public List<String> getEmails() {
        List<String> spamm = new LinkedList<>();
        spamm.add("tubanco@emial,.com");
        spamm.add("tumercado@emial,.com");
        return spamm;
    }
}
