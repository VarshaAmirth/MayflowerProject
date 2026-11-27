package Frozen;
import mayflower.*;

public class MyMayflower extends Mayflower {

    public MyMayflower() {
        super("CS Project", 800, 600);
    }
    public void init() {
        Mayflower.setFullScreen(false);
        Section w = new Section();
        Mayflower.setWorld(w);
    }

}