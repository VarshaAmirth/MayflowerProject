package MayflowerReferenced;
import SharedClasses.floor;
import mayflower.*;

public class GravityActor extends Actor
{
    private int jumpFramesLeft;
    private int jumpSpeed;
    private int jumpDuration;
    
    public GravityActor()
    {
        jumpFramesLeft = 0;
        jumpSpeed = 4;
        jumpDuration = 25;
    }
    public void act()
    {
        int startY = getY();
        int lift = 0;
        while (isBlocked() && lift < 10){
            setLocation(getX(), getY()-1);
            lift++;
        }
        
        if (isBlocked()){
           setLocation(getX(), startY);
        }
        
        if (isJumping()){
            setLocation(getX(), getY() - jumpSpeed);
            if (isBlocked()){
                setLocation(getX(), getY() + jumpSpeed);
                jumpFramesLeft = 0;
            }
            else{
                jumpFramesLeft--;
            }
        }
        else{
            setLocation(getX(), getY() + 1);
            if (isBlocked()){
                setLocation(getX(), getY() - 1);
            }
        }
    }
    public boolean isBlocked(){
        return isTouching(floor.class);
    }
    public void jump(){
        if (!isJumping()){
            jumpFramesLeft = jumpDuration;
        }
    }
    public boolean isFalling()
    {
        boolean ret;
        // move the actor down and see if it touches a block
        setLocation(getX(), getY() + 1);
        ret = isTouching(floor.class);
        setLocation(getX(), getY() - 1);
        return !ret;
    }
    public boolean isJumping(){
        return jumpFramesLeft>0;
    }
}