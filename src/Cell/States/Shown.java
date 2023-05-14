package Cell.States;

import Cell.State;
import Cell.Cell;

import java.awt.image.BufferedImage;

public class Shown extends State {

    public Shown(Cell cell) { super(cell);}




    @Override
    public void onLeftClick() {
        cell.setState(new Shown(cell));
    }

    @Override
    public void onRightClick() {
        cell.setState(new Shown(cell));

    }
}
