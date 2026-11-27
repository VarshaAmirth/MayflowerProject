package MayflowerReferenced;

import mayflower.*;
//straight up from the labs
//need to add a constructor with a parameter to change the image per place
//Block(String s) {setImage(s);} or smth
public class Block extends Actor {
    public Block() {
        setImage("src/imgs/img/Tiles/2.png");
        scale(100,100);
    }

    public void act() 
    {
    }
}
