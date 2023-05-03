package Cell.States;

import Cell.State;
import Cell.Cell;

import java.awt.image.BufferedImage;

public class Shown extends State {

    public Shown(Cell cell) { super(cell);}




    @Override
    public BufferedImage onLeftClick() {
        return cell.shown();
    }

    @Override
    public BufferedImage onRightClick() {
        return cell.shown();
    }
}
