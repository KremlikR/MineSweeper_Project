package Entity.Mine.States;




import Entity.Mine.Mine;
import Entity.Mine.State;

import java.awt.image.BufferedImage;

public class HiddenBomb extends State {


    public HiddenBomb(Mine mine) {
        super(mine);
    }

    @Override
    public BufferedImage onLeftClick() {

        return mine.shown();
    }

    @Override
    public BufferedImage onRightClick() {
        mine.setState(new Captured(mine));

        return mine.captured();
    }
}
