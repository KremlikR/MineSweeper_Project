package Entity.Cell.States;

import Entity.Cell.Cell;
import Entity.Cell.Single_cell;
import Entity.Cell.State;



public class Hidden extends State {

    public Hidden(Single_cell cell) {
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
