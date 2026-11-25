package SharedClasses;
import Enums.World;
import mayflower.*;

public class climable extends MayflowerReferenced.MovableAnimatedActor {
    private MayflowerImage climableImage;
    private MayflowerReferenced.Animation climableL;
    private MayflowerReferenced.Animation climableR;

    public climable() {
       //set a value to climableImage
        if (MayflowerReferenced.currentWorld == World.JUNGLE) {

        }
    }
    public void act() {super.act();}

}

