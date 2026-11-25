package MayflowerReferenced;

import mayflower.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Astronaut extends MovableAnimatedActor {
    private Animation walk;
    private Animation idle;
    private Animation leftwalk;
    private Animation idleL;
    private Animation fallingR;
    private Animation fallingL;
    private Animation jumpingR;
    private Animation jumpingL;
    private Animation jumpFallingR;
    private Animation jumpFallingL;

    public Astronaut() {

        String[] walkR = new String[6];
        for (int i = 0; i < 6; i++) {
            walkR[i] = "src/imgs/AstronautFrames/AWalk/AWalk" + (i) + ".png";
        }
        walk = new Animation(10, walkR);
        walk.scale(100, 87);
        walk.setBounds(0, 8, 88, 76);
        setWalkRightAnimation(walk);

        String[] left = new String[6];
        for (int i = 0; i < 6; i++) {
            left[i] = "src/imgs/AstronautFrames/AWalk/AWalk" + (i) + ".png";
        }
        leftwalk = new Animation(50, left);
        leftwalk.scale(100, 87);
        leftwalk.mirrorHorizontally();
        leftwalk.setBounds(12, 8, 88, 76);
        setWalkLeftAnimation(leftwalk);

        String[] ide = new String[4];
        for (int i = 0; i < 4; i++) {
            ide[i] = "src/imgs/AstronautFrames/AIdle/AIdle" + (i) + ".png";
        }
        idle = new Animation(50, ide);
        idle.scale(100, 87);
        idle.setBounds(0, 8, 88, 76);
        setIdleAnimation(idle);

        String[] ideL = new String[4];
        for (int i = 0; i < 4; i++) {
            ideL[i] = "src/imgs/AstronautFrames/AIdle/AIdle" + (i) + ".png";
        }
        idleL = new Animation(50, ideL);
        idleL.scale(100, 87);
        idleL.mirrorHorizontally();
        idleL.setBounds(12, 8, 88, 76);
        setIdleLeftAnimation(idleL);

        String[] fallR = new String[6];
        for (int i = 0; i < 6; i++) {
            fallR[i] = "src/imgs/AstronautFrames/AFall/AFall" + (i) + ".png";
        }
        fallingR = new Animation(50, fallR);
        fallingR.scale(100, 87);
        fallingR.setBounds(0, 8, 88, 76);
        setFallingRightAnimation(fallingR);

        String[] fallL = new String[6];
        for (int i = 0; i < 6; i++) {
            fallL[i] = "src/imgs/AstronautFrames/AFall/AFall" + (i) + ".png";
        }
        fallingL = new Animation(50, fallL);
        fallingL.scale(100, 87);
        fallingL.mirrorHorizontally();
        fallingL.setBounds(12, 8, 88, 76);
        setFallingLeftAnimation(fallingL);

        String[] jumpR = new String[6];
        for (int i = 0; i < 6; i++) {
            jumpR[i] = "src/imgs/AstronautFrames/AJump/AJump" + (i) + ".png";

        }
        jumpingR = new Animation(50, jumpR);
        jumpingR.scale(100, 87);
        jumpingR.setBounds(0, 8, 88, 76);
        setJumpingRightAnimation(jumpingR);

        String[] jumpL = new String[6];
        for (int i = 0; i < 6; i++) {
            jumpL[i] = "src/imgs/AstronautFrames/AJump/AJump" + (i) + ".png";

        }
        jumpingL = new Animation(50, jumpL);
        jumpingL.scale(100, 87);
        jumpingL.mirrorHorizontally();
        jumpingL.setBounds(12, 8, 88, 76);
        setJumpingLeftAnimation(jumpingL);

    }

    public void act() {
        super.act();
    }
}