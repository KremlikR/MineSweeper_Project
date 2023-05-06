package Cell;

import Cell.States.Hidden;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Cell {
    private State state;
    private int X;
    private int Y;
    public void setState(State state) {
        this.state = state;
    }
    public Cell(int X, int Y){this.state=new Hidden(this);
this.X= X;
this.Y=Y;




    }



    BufferedImage image = null;

    public BufferedImage hidden() {


        try {
            image = ImageIO.read(getClass().getResourceAsStream("/Graphiscs/File.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  image;
    }

    public BufferedImage shown() {
        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/Graphiscs/ONE.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }

    public BufferedImage captured() {
        BufferedImage image = null;
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/Graphiscs/Flag.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }



    public BufferedImage BufferedImageLoad (){
        return image;
    }
}
