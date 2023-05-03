package Core;

public class Game {
    private GameWindow window;
    private GamePanel panel;
    public Game(){
this.panel = new GamePanel();
this.window= new GameWindow(panel);
this.panel.requestFocus();}
}
