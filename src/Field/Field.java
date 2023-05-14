package Field;

/* package Field;

import Cell.Cell;
import Mine.Mine;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.lang.invoke.TypeDescriptor;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import Core.*;

import javax.swing.plaf.basic.BasicTreeUI;
*/
public class Field {
/*

    public Graphics g2;

    public void setG2(Graphics g2) {
        this.g2 = g2;
    }

    private int gp;


    private ArrayList<ArrayList<Object>> graf_pole= new ArrayList<>();
    public Field(Table table, int titlesize) {
        this.table = table;
        this.gp=gp;

    }


    public void generate(){
        int x = table.getLine();
        int y= table.getCollum();
        int bomb= table.getBomb();
       int  times =x*y;
       int procent= times/100;






for (int a = 0;a<x;a++){
    graf_pole.add(new ArrayList<Object>());
for (int b=0;b<y;b++){

    graf_pole.get(a).add(new Cell(b*100,y*100,gp));
}

}
        int value = bomb/procent;
while(bomb>0){
    for (int a = 0;a<x;a++){

            for (int b=0;b<y;b++){

                Random rd = new Random();
                int random= rd.nextInt(times+1);
                if(random<=value) {
                    graf_pole.get(a).set(b, new Mine(b*100,a*100).BufferedImageLoad());
                    bomb--;
                }
            }

        }

        }
    }





        public void print(){
            int x = table.getLine();
            int y= table.getCollum();

    for (int a = 0;a<x;a++){

                for (int b=0;b<y;b++){
                   if (graf_pole.get(b).get(a).getClass()==Cell.class){
                       Cell cell = (Cell)graf_pole.get(b).get(a);
                       cell.Draw(g2);

                           }

                    }

                    }


                }



    }

/*
*/}