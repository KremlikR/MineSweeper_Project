package Mine;



public abstract class State {
    protected Mine mine;
    public State(Mine mine){this.mine =mine;}

    public abstract String onLeftClick();
    public abstract String onRightClick();
}
