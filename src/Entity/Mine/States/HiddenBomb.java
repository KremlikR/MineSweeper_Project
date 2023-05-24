package Entity.Mine.States;




import Entity.Mine.SingleMine;
import Entity.Mine.State;

public class HiddenBomb extends State {


    public HiddenBomb(SingleMine mine) {
        super(mine);
    }

    @Override
    public void onLeftClick() {



    }

    @Override
    public void onRightClick() {
        mine.setState(new Captured(mine));



    }
}
