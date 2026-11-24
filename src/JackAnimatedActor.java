import mayflower.*;
public class JackAnimatedActor extends AnimatedActor
{
    // instance variables - replace the example below with your own
    private Animation walk;

    /**
     * Constructor for objects of class DogAnimatedActor
     */
    public JackAnimatedActor()
    {
        String [] hello = new String[8];
        
        for (int i = 1;i<hello.length+1; i++){
            hello[i-1] = "img/jack/Run (" + i + ").png";
        }
        
        walk = new Animation(50, hello);
        walk.scale(150, 98);
        walk.setTransparency(20);
        setAnimation(walk);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void act()
    {
        super.act();
    }
}
