package MayflowerReferenced;
import mayflower.*;
//all varshas work i have no clue
public class Animation
{
    // instance variables - replace the example below with your own
    private MayflowerImage[] frames;
    private int framerate;
    private int currentFrame;

    public Animation(int frameRate, String[] fileNames)
    {
        // initialise instance variables
        framerate = frameRate;
        currentFrame = 0;
        frames = new MayflowerImage[fileNames.length];
        for (int i= 0; i< fileNames.length; i++){
            frames[i] = new MayflowerImage(fileNames[i]);
        }
        
    }

    public int getFrameRate()
    {
        return framerate;
    }
    public MayflowerImage getNextFrame(){
        MayflowerImage nextFrame = frames[currentFrame];
        currentFrame++;
        if (currentFrame>= frames.length){
            currentFrame =0;
        }
        return nextFrame;
    }
    public void scale(int w, int h){
        for (int i = 0; i < frames.length; i++){
            frames[i].scale(w,h);
        }
    }
    public void setTransparency(int percent){
        for (int i = 0; i < frames.length; i++){
            frames[i].setTransparency(percent);
        }
    }
    public void mirrorHorizontally(){
        for (int i = 0; i < frames.length; i++){
            frames[i].mirrorHorizontally();
        }
    }
    public void setBounds(int x, int y, int w, int h){
        for (int i = 0; i < frames.length; i++){
            frames[i].crop(x, y, w, h);
        }
    }
}
