package Cell.States;

import Cell.Cell;
import Cell.State;

import java.awt.image.BufferedImage;

public class Captured extends State {

    public Captured(Cell cell) {
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
