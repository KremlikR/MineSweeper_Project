package Entity.Cell;

import Core.GamePanel;

import java.util.ArrayList;

public class Logic {
    Logic(ArrayList<Single_cell> cells, GamePanel gp){
        findMineInTheField(cells,gp);




    }

public void findMineInTheField(ArrayList<Single_cell> cells, GamePanel gp){
    for (int i= 0;i<cells.size();i++){
        int xdd=0;
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









}
