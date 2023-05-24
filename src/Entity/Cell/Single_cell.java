package Entity.Cell;

import Entity.Cell.States.Hidden;



public class Single_cell {

    Single_cell(){
    setDefaultValues();

    }
public void setDefaultValues(){
    state_for="hidden";
    this.state = new Hidden(this);


}

    private State state;
private String  state_for;
    public void setState(State state) {
        this.state = state;
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
