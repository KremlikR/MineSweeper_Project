package Entity.Mine;

import Entity.Mine.States.Captured;

public class SingleMine {




    SingleMine(){
        setDefaultValues();

    }
    public void setDefaultValues(){
        state_for="hidden";



    }

    private State state;
    private String  state_for;
    public void setState(State state) {
        this.state =  state;
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
