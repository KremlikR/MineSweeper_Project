package Core;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import Cell.Cell;
import Cell.Cell.*;

import Field.Table;

public class GamePanel extends JPanel implements  Runnable {

private final int tileSize= 16;
private final int cols= 24;
private final int rows=24;
private final int widht= tileSize*cols;
private final int height= tileSize*rows;


private final int FPS=120;
private final int TPS=200;

private Thread gameThread;






    ArrayList<ArrayList<Object>> graf_pole= new ArrayList<>();
public  GamePanel(){
    this.setPreferredSize(new Dimension(widht,height));
    this.setBackground(Color.gray);
    this.setDoubleBuffered(true);

}

    public int getTileSize() {
        return tileSize;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }
    Cell c =new Cell(0,0,this);

    @Override
    public void run() {
    double timePerFrame= 1000000000.0 / FPS;
    double timePerTick=1000000000.0 / FPS;

    long previousTime=  System.nanoTime();
    long lastCheck=  System.currentTimeMillis();

    int frames=0;
    int ticks=0;

    double deltaF=0;
    double deltaT= 0;

     /*   for (int a = 0;a<cols;a++){
            graf_pole.add(new ArrayList<Object>());
            for (int b=0;b<rows;b++){


                graf_pole.get(a).add(new Cell(b*100,a*100,this));
            }

        }*/


    while(gameThread !=null){
        long currentTime= System.nanoTime();
        deltaT+=(currentTime- previousTime)/timePerTick;
        deltaF+=(currentTime- previousTime)/timePerFrame;
        previousTime=currentTime;

    }

    if (deltaT>=1){
        update();
        ticks++;
        deltaT--;
    }
        if (deltaF >= 1) {
            repaint();
            frames++;
            deltaF--;
        }
        if (System.currentTimeMillis() - lastCheck >= 1000) {
            lastCheck = System.currentTimeMillis();
            System.out.printf("FPS: %s | TPS: %s%n", frames, ticks);
            frames = 0;
            ticks = 0;
        }

    }
    public void update() {

    repaint();

    }
    public void paintComponent(Graphics g){


    super.paintComponent(g);

        Graphics g2= (Graphics2D)g ;

        /*    int x = rows;
            int y= rows;


            for (int a = 0;a<x;a++){

                for (int b=0;b<y;b++){
                    if (graf_pole.get(b).get(a).getClass()==Cell.class){
                        Cell cell = (Cell)graf_pole.get(b).get(a);
                     cell.Draw(g2);


                    }

                }

            }*/

        Cell cell = c;
        cell.Draw(g2);


        g2.dispose();

    }



    public void startGameLoop() {
        this.gameThread = new Thread(this);
        this.gameThread.start();

    }
}
