package microservices.model;

public class Stuff {
    private String value;

    public Stuff() {
    }

    public Stuff(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
