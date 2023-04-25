package Mine;

public class Mine {
    public State state;

    public void setState(State state) {
        this.state = state;
    }

    private String value= " X ";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
