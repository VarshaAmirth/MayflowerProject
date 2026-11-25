package SharedClasses;
import mayflower.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import MayflowerReferenced.Animation;


public class Astronaut extends MayflowerReferenced.MovableAnimatedActor
{
    private MayflowerReferenced.Animation walk;
    private MayflowerReferenced.Animation idle;
    private MayflowerReferenced.Animation leftwalk;
    private MayflowerReferenced.Animation idleL;
    private MayflowerReferenced.Animation fallingR;
    private MayflowerReferenced.Animation fallingL;
    private MayflowerReferenced.Animation jumpingR;
    private MayflowerReferenced.Animation jumpingL;
    private MayflowerReferenced.Animation jumpFallingR;
    private MayflowerReferenced.Animation jumpFallingL;
    
    public Astronaut() 
    {
        // this just sets the animations for all of the astronauts movements so it can be passed over.
        String[] walkR = new String[6];
        for (int i =0; i < 6; i++){
            walkR[i] = "imgs/AstronautFrames/AWalk/AWalk" + (i) + ".png";
        }
        walk = new Animation(10, walkR);
        walk.scale(100,87);
        walk.setBounds(0, 8, 88, 76);
        setWalkRightAnimation(walk);
        
        String[] left = new String[6];
        for (int i =0; i < 6; i++){
            left[i] = "imgs/AstronautFrames/AWalk/AWalk" + (i) + ".png";
        }
        leftwalk = new Animation(50, left);
        leftwalk.scale(100,87);
        leftwalk.mirrorHorizontally();
        leftwalk.setBounds(12, 8, 88, 76);
        setWalkLeftAnimation(leftwalk);
        
        String[] ide = new String[10];
        for (int i =1; i < 11; i++){
            ide[i-1] = "imgs/img/cat/Idle (" + (i) + ").png";
        }
        idle = new Animation(50, ide);
        idle.scale(100,87);
        idle.setBounds(18, 5, 54, 80);
        setIdleAnimation(idle);
        
        String[] ideL = new String[10];
        for (int i =1; i < 11; i++){
            ideL[i-1] = "imgs/img/cat/Idle (" + (i) + ").png";
        }
        idleL = new Animation(50, ideL);
        idleL.scale(100,87);
        idleL.mirrorHorizontally();
        idleL.setBounds(28, 5, 54, 80);
        setIdleLeftAnimation(idleL);
        
        String[] fallR = new String[6];
        for (int i =0; i < 6; i++){
            fallR[i] = "imgs/AstronautFrames/AFall/AFall" + (i) + ".png";
        }
        fallingR = new Animation(50, fallR);
        fallingR.scale(100,87);
        fallingR.setBounds(0, 8, 88, 76);
        setFallingRightAnimation(fallingR);
        
        String[] fallL = new String[6];
        for (int i =0; i < 6; i++){
            fallL[i] = "imgs/AstronautFrames/AFall/AFall" + (i) + ".png";
        }
        fallingL = new Animation(50, fallL);
        fallingL.scale(100,87);
        fallingL.mirrorHorizontally();
        fallingL.setBounds(12, 8, 88, 76);
        setFallingLeftAnimation(fallingL);
        
        String[] jumpR = new String[6];
        for (int i = 0; i<6; i++){
            jumpR[i] = "imgs/AstronautFrames/AJump/AJump" + (i) + ".png";

        }
        jumpingR = new Animation(50, jumpR);
        jumpingR.scale(100,87);
        jumpingR.setBounds(0, 8, 88, 76);
        setJumpingRightAnimation(jumpingR);
        
        String[] jumpL = new String[6];
        for (int i = 0; i<6; i++){
            jumpL[i] = "imgs/AstronautFrames/AJump/AJump" + (i) + ".png";

        }
        jumpingL = new Animation(50, jumpL);
        jumpingL.scale(100,87);
        jumpingL.mirrorHorizontally();
        jumpingL.setBounds(12, 8, 88, 76);
        setJumpingLeftAnimation(jumpingL);
        
    }
    public void act()
    {
      super.act();
    }
}
