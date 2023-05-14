package Entity.Cell;

import Entity.Cell.States.Hidden;
import Core.GamePanel;

import javax.imageio.ImageIO;
import Entity.Position;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Cell extends Position {
    private State state;

    GamePanel gp;

    public void setState(State state) {
        this.state = state;
    }

    public Cell(GamePanel gp, int x,int y) {
        this.state = new Hidden(this);

        this.gp = gp;
        getImage();
        setDefaultValues();
this.x=x;
this.y=y;
    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        state_for = "hidden";
    }


    public void getImage() {
        try {


            hidden = ImageIO.read(getClass().getResourceAsStream("/Graphics/File.png"));
            shown = ImageIO.read(getClass().getResourceAsStream("/Graphics/EIGHT.png"));
            captured = ImageIO.read(getClass().getResourceAsStream("/Graphics/Flag.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
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



/*public void update(){




        }
*/



    public void Draw(Graphics g2){
        BufferedImage image= null;
switch (state_for){
    case "hidden":
        image=hidden;
        break;
    case "captured" :
        image=captured;
        break;
    case "shown":
        image= shown;
        break;

}g2.drawImage(image,x,y,gp.getTileSize(), gp.getTileSize(), null);




    }



}
