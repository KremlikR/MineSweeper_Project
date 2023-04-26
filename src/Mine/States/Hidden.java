package Mine.States;




import Mine.Mine;
import Mine.State;

public class Hidden extends State {


    public Hidden(Mine mine) {
        super(mine);
    }

    @Override
    public String onLeftClick() {

        mine.setValue(" F ");
        return mine.getValue();
    }

    @Override
    public String onRightClick() {
        mine.setState(new Captured(mine));
        mine.setValue(" V ");
        return mine.getValue();
    }
}
