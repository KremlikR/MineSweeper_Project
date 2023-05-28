package Core;

import javax.swing.*;


import java.awt.*;
import java.util.ArrayList;

import Entity.Cell.Cell;

public class GamePanel extends JPanel implements  Runnable {
    // Dimensions and properties of the game field

public final int tileSize= 16;

public final int cols= 24;

public final int rows=24;
public final int widht= tileSize*cols;
public final int height= tileSize*rows;

public int bomb =100;// Number of bombs


    // Frame rate and ticks per second
private final int FPS=120;
private final int TPS=200;

private Thread gameThread;// Thread for game loop



    Cell c =new Cell(this);// Instance of the Cell class

ArrayList<ArrayList> field= new ArrayList<>();// ArrayList for game field









    ArrayList<ArrayList<Object>> graf_pole= new ArrayList<>();// ArrayList for graphical representation of the game field
public  GamePanel(){

    this.setPreferredSize(new Dimension(widht,height));// Set preferred size of the game panel
    this.setBackground(Color.gray);// Set background color
    this.setDoubleBuffered(true); // Enable double buffering


}
    // Getters for various properties
    public int getTileSize() {
        return tileSize;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }


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


        // Game loop implementation
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
    // Update method called in the game loop
    public void update() {

    repaint();

    }
    // Method for painting the game components on the panel
    public void paintComponent(Graphics g){


    super.paintComponent(g);

        Graphics g2= (Graphics2D)g ;



        Cell cell = c;
        cell.Draw(g2);



        g2.dispose();

    }


    // Method to start the game loop
    public void startGameLoop() {
        this.gameThread = new Thread(this);
        this.gameThread.start();

    }
}
