package Cell.States;

import Cell.Cell;
import Cell.State;

import java.awt.image.BufferedImage;

public class Captured extends State {

    public Captured(Cell cell) {
        super(cell);}




    @Override
    public BufferedImage onLeftClick() {
        return cell.captured();
    }

    @Override
    public BufferedImage onRightClick() {
        cell.setState(new Hidden(cell));

        return cell.hidden();
    }






}
