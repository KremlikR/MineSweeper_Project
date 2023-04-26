package Cell.States;

import Cell.Cell;
import Cell.State;

public class Captured extends State {

    public Captured(Cell cell) {
        super(cell);}




    @Override
    public String onLeftClick() {
        return cell.getValue();
    }

    @Override
    public String onRightClick() {
        cell.setState(new Hidden(cell));
        cell.setValue(" X ");
        return cell.getValue();
    }






}
