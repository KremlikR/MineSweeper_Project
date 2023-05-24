package Entity.Cell.States;

import Entity.Cell.Cell;
import Entity.Cell.Single_cell;
import Entity.Cell.State;

public class Captured extends State {

    public Captured(Single_cell cell) {
        super(cell);}




    @Override
    public void onLeftClick() {
        cell.setState(new Captured(cell));
    }

    @Override
    public void onRightClick() {
        cell.setState(new Hidden(cell));


    }






}
