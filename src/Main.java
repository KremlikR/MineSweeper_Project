import Core.Game;
import Field.Field;
import Field.Table;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Field field = new Field(new Table(24 ,24,99));

        field.generate();


        System.out.println(field.print());

Game game =new Game();





    }
}