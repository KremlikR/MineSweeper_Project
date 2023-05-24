package Entity.Mine.States;


import Entity.Mine.SingleMine;
import Entity.Mine.State;

public class Captured extends State {

    public Captured(SingleMine mine) {
        super(mine);
    }

    @Override
    public void onLeftClick() {


    }

    @Override
    public void onRightClick() {
        mine.setState(new HiddenBomb(mine));
    }
}
