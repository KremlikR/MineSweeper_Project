package Cell;

import Cell.States.Hidden;
import Core.GamePanel;
import org.junit.platform.commons.util.PackageUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Cell {
    private State state;
    private int X;
    private int Y;
    GamePanel gp;
    public void setState(State state) {
        this.state = state;
    }
    public Cell(int X, int Y, GamePanel gp){this.state=new Hidden(this);
this.X= X;
this.Y=Y;
this.gp=gp;



    }



  public BufferedImage hidden, shown,captured;
    public String state_for;

    public void hidden() {
state_for= "hidden";


    }

    public void shown() {
state_for= "shown";


    }

    public void captured() {
state_for= "captured";

    }

public  void setDefaultValues(){
    state_for= "hidden";
    }
    public void getImage(){
        try {


            hidden = ImageIO.read(getClass().getResourceAsStream("/Graphiscs/File.png"));
            shown = ImageIO.read(getClass().getResourceAsStream("/Graphiscs/ONE.png"));
            captured = ImageIO.read(getClass().getResourceAsStream("/Graphiscs/Flag.png"));

        }catch ( IOException e){
            e.printStackTrace();
        }





    }
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

}



g2.drawImage(image,X,Y,gp.getTileSize(), gp.getTileSize(), null);




    }





}
