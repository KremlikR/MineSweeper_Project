package Entity.Cell;

import Entity.Cell.States.Hidden;

import javax.swing.*;


public class Single_cell {

    Single_cell(JButton jButton){
    setDefaultValues();

    }
public void setDefaultValues(){
    state_for="hidden";
    this.state = new Hidden(this);
setBomb(false);

}

    private State state;
    private boolean bomb;
private int numberOfBombs;
private String  state_for;
    public void setState(State state) {
        this.state = state;
    }

    public int getNumberOfBombs() {
        return numberOfBombs;
    }

    public void setNumberOfBombs(int numberOfBombs) {
        this.numberOfBombs = numberOfBombs;
    }

    public boolean isBomb() {
        return bomb;
    }

    public void setBomb(boolean bomb) {
        this.bomb = bomb;
    }

    public void hidden() {
        state_for = "hidden";


    }

    public void shown() {
        state_for = "shown";


    }

    public void captured() {
        state_for = "captured";

    }

    public String getState_for() {
        return state_for;
    }
}
