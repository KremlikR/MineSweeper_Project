package Cell.States;

import Cell.Cell;
import Cell.State;

import javax.print.DocFlavor;

public class Hidden extends State {

    public Hidden(Cell cell) {
        super(cell);}




    @Override
    public String onLeftClick() {
       cell.setState(new Shown(cell));
        cell.setValue(" S ");
        return cell.getValue();
    }

    @Override
    public String onRightClick() {
     cell.setState(new Captured(cell));
     cell.setValue(" V ");
       return cell.getValue();
    }
}
