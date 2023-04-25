package Cell.States;

import Cell.State;
import Cell.Cell;
public class Shown extends State {

    public Shown(Cell cell) { super(cell);}




    @Override
    public String onLeftClick() {
        return cell.getValue();
    }

    @Override
    public String onRightClick() {
        return cell.getValue();
    }
}
