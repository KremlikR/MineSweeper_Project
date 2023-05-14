package Entity.Mine;


import java.awt.image.BufferedImage;

public abstract class State {
    protected Mine mine;
    public State(Mine mine){this.mine =mine;}

    public abstract BufferedImage onLeftClick();
    public abstract BufferedImage onRightClick();
}
