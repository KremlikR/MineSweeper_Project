package Entity.Cell;

public abstract class State {
    protected Single_cell cell;
    public State(Single_cell cell){this.cell=cell;}

    public abstract void onLeftClick();
    public abstract void onRightClick();

}
