import mayflower.*;
public class AnimatedActor extends GravityActor
{
    // instance variables - replace the example below with your own
    private Animation animation;
    private Timer animationTimer;

    public AnimatedActor()
    {
        // initialise instance variables
        animation = null;
        animationTimer = new Timer(100000000);
    }

    public void setAnimation(Animation a)
    {
        animation = a;
        animationTimer.reset();
    }
    public void act(){
        if (animation != null){
            if (animationTimer.isDone()){
                MayflowerImage nextFrame = animation.getNextFrame();
                setImage(nextFrame);
                animationTimer.reset();
            }
        }
        super.act();
    }
}
