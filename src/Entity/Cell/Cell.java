package Entity.Cell;

import Entity.Cell.States.Hidden;
import Core.GamePanel;

import javax.imageio.ImageIO;
import Entity.Position;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class Cell extends Position {


    GamePanel gp;

ArrayList<Single_cell> single_cell= new ArrayList<Single_cell>();

    public Cell(GamePanel gp) {
       for (int i=0; i<gp.rows * gp.cols;i++) {
           single_cell.add(new Single_cell());
       }
        this.gp = gp;
        getImage();
        setDefaultValues();

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






/*public void update(){




        }
*/



    public void Draw(Graphics g2){
        int col=0;
        int row=0;
        int x=0;
        int y=0;
int plus=0;

        while (col<gp.cols&& row<gp.rows){

            BufferedImage image= null;
            try{
                state_for=single_cell.get(plus).getState_for();





            }catch (Exception e){
           e.printStackTrace();

            }
            plus++;

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
            g2.drawImage(image,x,y,gp.getTileSize(), gp.getTileSize(), null);

            col++;
            x+= gp.tileSize;
            if(col== gp.cols){
                col=0;
                x=0;
                row++;
                y+=gp.tileSize;




            }

        }





    }



}
