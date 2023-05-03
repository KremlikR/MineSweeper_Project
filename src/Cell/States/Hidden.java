package Cell.States;

import Cell.Cell;
import Cell.State;

import javax.print.DocFlavor;
import java.awt.image.BufferedImage;

public class Hidden extends State {

    public Hidden(Cell cell) {
        super(cell);}




    @Override
    public BufferedImage onLeftClick() {
       cell.setState(new Shown(cell));


        return cell.shown();

    }

    @Override
    public BufferedImage onRightClick() {
     cell.setState(new Captured(cell));

       return cell.captured();
    }
}
