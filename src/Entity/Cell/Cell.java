package Entity.Cell;

import Core.GamePanel;

import javax.imageio.ImageIO;
import javax.swing.*;

import Entity.Position;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Cell extends Position {


    GamePanel gp; // Reference to the GamePanel instance
    ArrayList<Single_cell> single_cell= new ArrayList<Single_cell>();// ArrayList to store individual cells
    Logic logic = new Logic(single_cell,gp);// Instance of the Logic class to handle cell logic


    public Cell(GamePanel gp) {
        // Initializing the Single_cell objects and adding them to the ArrayList
       for (int i=0; i<gp.rows * gp.cols;i++) {
           single_cell.add(new Single_cell(new JButton()));

       }
        int procent= (gp.rows * gp.cols)/100;// Percentage of the total cells
        int value = gp.bomb/procent;// Number of bombs based on the percentage

        int bomb= 0;
        // Assigning bombs randomly to the Single_cell objects
        while (bomb<gp.bomb){
        for (int i=0; i<gp.rows * gp.cols;i++) {

                Random rd = new Random();
                int random= rd.nextInt((gp.rows* gp.cols)+1);
                if(random<=value) {
                    single_cell.get(i).setBomb(true);
                    bomb++;
                }

    }

          logic = new Logic(single_cell,gp);// Initializing the Logic class with the Single_cell objects

}

        this.gp = gp;
        getImage();// Loading images
        setDefaultValues();// Setting default values for position and state

    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        state_for = "hidden";
    }


    public void getImage() {
        try {
            // Loading images from files

            hidden = ImageIO.read(getClass().getResourceAsStream("/Graphics/File.png"));

            captured = ImageIO.read(getClass().getResourceAsStream("/Graphics/Flag.png"));
bomb =ImageIO.read(getClass().getResourceAsStream("/Graphics/Mine.png"));
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

                single_cell.get(plus).setjButtonLocatoin(x,y);// Setting location for the JButton
                single_cell.get(plus).setjButtonSize(gp.tileSize, gp.getTileSize());// Setting size for the JButton
                gp.add(single_cell.get(plus).getjButton());// Adding the JButton to the GamePanel
                single_cell.get(plus).setjButtonIcon(); // Setting icon for the JButton
            }catch (Exception e){
           e.printStackTrace();

            }

            state_for=single_cell.get(plus).getState_for();// Getting the state of the Single_cell


            switch (state_for){
                case "hidden":
                    image=hidden;
                    break;
                case "captured" :
                    image=captured;
                    break;
                case "shown":


                    image= logic.findImage(single_cell.get(plus));// Finding appropriate image for the Single_cell
                    if (single_cell.get(plus).getNumberOfBombs()==0)
                    logic.ifCellIsZero(single_cell,gp,plus);

                    if (single_cell.get(plus).isBomb()){
                        image=bomb;
System.exit(0);
                    }
                    break;

            }

            plus++;
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
