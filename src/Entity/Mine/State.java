package Entity.Mine;


public abstract class State {
    protected SingleMine mine;
    public State(SingleMine mine){this.mine =mine;}

    public abstract void onLeftClick();
    public abstract void onRightClick();
}
