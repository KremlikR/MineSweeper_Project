package Entity.Cell.States;

import Entity.Cell.Cell;
import Entity.Cell.Single_cell;
import Entity.Cell.State;



public class Hidden extends State {

    public Hidden(Single_cell cell) {

        super(cell);
    }




    @Override
    public void onLeftClick() {

        cell.shown();
        cell.setState(new Shown(cell));

         if (cell.isBomb()){
             //Lost xdd
         }



    }

    @Override
    public void onRightClick() {
        cell.captured();
        cell.setState(new Captured(cell));



    }
}
