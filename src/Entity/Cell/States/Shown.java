package Entity.Cell.States;

import Entity.Cell.State;
import Entity.Cell.Cell;

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
