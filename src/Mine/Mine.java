package Mine;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Mine {
    public State state;

    public void setState(State state) {
        this.state = state;
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
