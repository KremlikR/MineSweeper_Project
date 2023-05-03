package Mine.States;


import Mine.Mine;
import Mine.State;

import java.awt.image.BufferedImage;

public class Captured extends State {

    public Captured(Mine mine) {
        super(mine);
    }

    @Override
    public BufferedImage onLeftClick() {
        return mine.captured();
    }

    @Override
    public BufferedImage onRightClick() {
        return mine.hidden();
    }
}
