package Cell;

public abstract class State {
    protected Cell cell;
    public State(Cell cell){this.cell=cell;}

    public abstract String onLeftClick();
    public abstract String onRightClick();

}
