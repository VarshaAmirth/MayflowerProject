package MayflowerReferenced;
import mayflower.*;

public class TitleScreen extends Actor {

    public TitleScreen() {
        MayflowerImage title = new MayflowerImage("imgs/img/BG/BG.png");
        title.scale(800,600);
        setImage(title);
    }
    public void act() {
        if (Mayflower.mouseClicked(this)) {
            MyWorld.currentWorld = Enums.World.FROZEN;
            getWorld().removeObject(this);
            MyWorld.createObjects();
        }
    }
}