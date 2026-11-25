package MayflowerReferenced;
import mayflower.*;

public class MyWorld extends World {
   public static Enums.World currentWorld;
// initializees MyWorld and makes the opening title
    public MyWorld() 
    {
      TitleScreen title = new TitleScreen();
        addObject(title, 0,0);
        Mayflower.showBounds(true);
    }
    // this is here to prevent errors 
    public void act() {}
    //adds world specific transitions
    public static void createObjects() {
      if (currentWorld == Enums.World.FROZEN) {

      }
      else if (currentWorld == Enums.World.JUNGLE) {

      }
      else if (currentWorld == Enums.World.SPACE) {
        
      }
    }
    
}