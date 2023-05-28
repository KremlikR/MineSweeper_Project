package Entity.Cell;

import Core.GamePanel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class Logic {
    Logic(ArrayList<Single_cell> cells, GamePanel gp){
        findMineInTheField(cells,gp);


getImage();// Loading images

    }

BufferedImage one,two,three,four,five,six,seven,eight,zero;


    public void getImage() {
        try {
// Loading images from files

            one = ImageIO.read(getClass().getResourceAsStream("/Graphics/ONE.png"));
            two = ImageIO.read(getClass().getResourceAsStream("/Graphics/TWO.png"));
            three = ImageIO.read(getClass().getResourceAsStream("/Graphics/three.png"));
            four = ImageIO.read(getClass().getResourceAsStream("/Graphics/four.png"));
            five = ImageIO.read(getClass().getResourceAsStream("/Graphics/MY_NUMBER_IS_FIVE.png"));
            six = ImageIO.read(getClass().getResourceAsStream("/Graphics/SIX.png"));
            seven = ImageIO.read(getClass().getResourceAsStream("/Graphics/Seven.png"));
            eight = ImageIO.read(getClass().getResourceAsStream("/Graphics/EIGHT.png"));
            zero = ImageIO.read(getClass().getResourceAsStream("/Graphics/Zero.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        public BufferedImage findImage(Single_cell singleCell){
            int num=singleCell.getNumberOfBombs();
            BufferedImage image = null;
            switch (num){
                case 0:
                    image =zero;
                    break;
                case 1:
                    image =one;
                    break;
                case 2:
                    image =two;
                    break;
                case 3:
                    image =three;
                    break;
                case 4:
                    image =four;
                    break;
                case 5:
                    image =five;
                    break;
                case 6:
                    image =six;
                    break;
                case 7:
                    image =seven;
                    break;
                case 8:
                    image =eight;
                    break;
            }
    return image;}


public void findMineInTheField(ArrayList<Single_cell> cells, GamePanel gp){

    for (int i= 0;i<cells.size();i++){
        int xdd=0;
        // Checking for neighboring cells that are bombs
        //right
        try {
            if (cells.get(i+1).isBomb()){
            xdd++;
        }}catch (Exception e){

        }
        //left
        try {
        if (cells.get(i-1).isBomb()){
            xdd++;
        }}catch (Exception e){

        }
        //up left
            try {
        if (cells.get(i-(gp.rows-1)).isBomb()){
            xdd++;
        }}catch (Exception e){

            }
        //down right
                try {
        if (cells.get(i+(gp.rows-1)).isBomb()){
            xdd++;
        }}catch (Exception e){

                }
        //down left
                    try {
        if (cells.get(i+(gp.rows+1)).isBomb()){
            xdd++;
        }}catch (Exception e){

                    }
        //up right
                        try {
        if (cells.get(i-(gp.rows+1)).isBomb()){
            xdd++;
        }}catch (Exception e){

                        }
        //up
                            try {
        if (cells.get(i-(gp.rows)).isBomb()){
            xdd++;
        }}catch (Exception e){

                            }
        //down
                                try {
        if (cells.get(i+(gp.rows)).isBomb()){
            xdd++;
        }}catch (Exception e){

                                }

cells.get(i).setNumberOfBombs(xdd);


    }






}




public void ifCellIsZero(ArrayList<Single_cell> cells, GamePanel gp,int i){
    // Checking for neighboring cells that are zero
        //right
        try {

                cells.get(i + 1).state.onLeftClick();

        } catch (Exception e) {

        }
        //left
        try {

                cells.get(i - 1).state.onLeftClick();

        } catch (Exception e) {

        }
        //up left
        try {

                cells.get(i - (gp.rows - 1)).state.onLeftClick();

        } catch (Exception e) {

        }
        //down right
        try {

                cells.get(i + (gp.rows - 1)).state.onLeftClick();

        } catch (Exception e) {

        }
        //down left
        try {

                cells.get(i + (gp.rows + 1)).state.onLeftClick();

        } catch (Exception e) {

        }
        //up right
        try {

                cells.get(i - (gp.rows + 1)).state.onLeftClick();

        } catch (Exception e) {

        }
        //up
        try {

                cells.get(i - (gp.rows)).state.onLeftClick();

        } catch (Exception e) {

        }
        //down
        try {

                cells.get(i + (gp.rows)).state.onLeftClick();

        } catch (Exception e) {

        }
    }








}
