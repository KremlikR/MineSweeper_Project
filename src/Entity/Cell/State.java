package Entity.Cell;

public abstract class State {
    protected Cell cell;
    public State(Cell cell){this.cell=cell;}

    public abstract void onLeftClick();
    public abstract void onRightClick();

}
