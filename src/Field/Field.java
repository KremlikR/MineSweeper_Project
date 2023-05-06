package Field;

import Cell.Cell;
import Mine.Mine;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import Core.*;
public class Field {

    private Table table;


    private ArrayList<ArrayList<Object>> graf_pole= new ArrayList<>();
    public Field(Table table ) {
        this.table = table;
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

    graf_pole.get(a).add(new Cell(b*100,y*100));
}

}
        int value = bomb/procent;
while(bomb>0){
    for (int a = 0;a<x;a++){

            for (int b=0;b<y;b++){

                Random rd = new Random();
                int random= rd.nextInt(times+1);
                if(random<=value) {
                    graf_pole.get(a).set(b, new Mine(b*100,a*100));
                    bomb--;
                }
            }

        }

        }
    }





        public Object print(){
            int x = table.getLine();
            int y= table.getCollum();

    for (int a = 0;a<x;a++){

                for (int b=0;b<y;b++){
                  return  graf_pole.get(b).get(a);

                }

            }


  return null;
    }}



