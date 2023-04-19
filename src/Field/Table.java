package Field;

public class Table {
    private int collum;
    private int line;

    private int bomb;

    public Table(int collum, int line, int bomb) {
        this.collum = collum;
        this.line = line;
        this.bomb= bomb;

    }

    public int getBomb() {
        return bomb;
    }

    public int getCollum() {
        return collum;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
}
