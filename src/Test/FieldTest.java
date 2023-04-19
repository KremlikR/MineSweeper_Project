package Test;

import org.junit.Assert;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @org.junit.jupiter.api.Test
    void generate() {
        int x = 5;
        int y= 5;

         ArrayList<ArrayList<String>> graf_pole = new ArrayList<>();

        for (int a = 0;a<x;a++){
            graf_pole.add(new ArrayList<String>());
            for (int b=0;b<y;b++){
                graf_pole.get(a).add("1");
            }
        }
        assertEquals("1", graf_pole.get(1).get(1)," nejde generate");



    }

    @org.junit.jupiter.api.Test
    void print() {
        int x = 5;
        int y= 5;

        ArrayList<ArrayList<String>> graf_pole = new ArrayList<>();

        for (int a = 0;a<x;a++){
            graf_pole.add(new ArrayList<String>());
            for (int b=0;b<y;b++){
                graf_pole.get(a).add("1 ");
            }
        }

        for (int a = 0;a>x;a++){
            for (int b=0;b>y;b++){
                assertEquals("1", graf_pole.get(a).get(b)," nejde print");

            }
            String s = "\n ";
            System.out.println(s);
        }



    }
}