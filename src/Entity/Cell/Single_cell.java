package Entity.Cell;

import Entity.Cell.States.Hidden;
import com.sun.source.tree.SwitchTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Single_cell  implements MouseListener,ActionListener {

    Single_cell(JButton jButton){
    setDefaultValues();
this.jButton=jButton;
    }
public void setDefaultValues(){
    state_for="hidden";
    this.state = new Hidden(this);
setBomb(false);

    }

private JButton jButton;
    public State state;
    private boolean bomb;
private int numberOfBombs=0;
private String  state_for;


    public JButton getjButton() {
        return jButton;
    }

    public void setjButtonLocatoin(int x,int y) {
        this.jButton.setLocation(x,y);

        jButton.addMouseListener(mouseListener);

    }
    public void setjButtonSize(int x,int y) {
        this.jButton.setSize(x,y);
    }
    public void setjButtonIcon() {
        this.jButton.setBorder(BorderFactory.createEmptyBorder());
        this.jButton.setContentAreaFilled(false);

    }

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

    private MouseListener mouseListener = new MouseAdapter() {
        public void mousePressed(MouseEvent mouseEvent) {
            int modifiers = mouseEvent.getModifiers();
            if ((modifiers & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {
                // Mask may not be set properly prior to Java 2
                // See SwingUtilities.isLeftMouseButton() for workaround
                state.onLeftClick();
            }

            if ((modifiers & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {
                state.onRightClick();
            }
        }

        public void mouseReleased(MouseEvent mouseEvent) {
            if (SwingUtilities.isLeftMouseButton(mouseEvent)) {

            }

            if (SwingUtilities.isRightMouseButton(mouseEvent)) {

            }

        }

    };

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

}


    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
