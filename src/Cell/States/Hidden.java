package Cell.States;

import Cell.Cell;
import Cell.State;



public class Hidden extends State {

    public Hidden(Cell cell) {
        super(cell);}




    @Override
    public void onLeftClick() {
       cell.setState(new Shown(cell));




    }

    @Override
    public void onRightClick() {
     cell.setState(new Captured(cell));



    }
}
