import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Author {
    private int id;
    private Map<String, Book> policies = new HashMap<String, Book>();

    public Map<String, Book> getPolicies() {
        return policies;
    }

    public void setPolicies(Map<String, Book> policies) {
        this.policies = policies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
