package Field;

import java.util.ArrayList;
import java.util.Random;
public class Field {

    private Table table;


    private ArrayList<ArrayList<String>> graf_pole= new ArrayList<>();
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
    graf_pole.add(new ArrayList<String>());
for (int b=0;b<y;b++){

    graf_pole.get(a).add(" 0 ");
}

}
        int value = bomb/procent;
while(bomb>0){
    for (int a = 0;a<x;a++){

            for (int b=0;b<y;b++){

                Random rd = new Random();
                int random= rd.nextInt(times+1);
                if(random<=value) {
                    graf_pole.get(a).set(b, " 9 ");
                    bomb--;
                }
            }

        }

        }
    }





        public String print(){
            int x = table.getLine();
            int y= table.getCollum();
String s=" ";
    for (int a = 0;a<x;a++){
        s+=  "\n "  ;
                for (int b=0;b<y;b++){
                   s+= graf_pole.get(a).get(b);

                }

            }


  return s;
    }}



