package Mine.States;


import Mine.Mine;
import Mine.State;

public class Captured extends State {

    public Captured(Mine mine) {
        super(mine);
    }

    @Override
    public String onLeftClick() {
        return null;
    }

    @Override
    public String onRightClick() {
        return null;
    }
}
