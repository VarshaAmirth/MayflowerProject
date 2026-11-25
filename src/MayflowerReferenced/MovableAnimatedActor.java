package MayflowerReferenced;
import mayflower.*;

//all varshas work i have no clue
public class MovableAnimatedActor extends AnimatedActor
{
    private Animation walkRight;
    private Animation idle; 
    private String currentAction;
    private Animation walkLeft;
    private Animation idleLeft;
    private String direction;
    private Animation fallingRight;
    private Animation fallingLeft;
    private Animation jumpRight;
    private Animation jumpLeft;
    private Animation jumpFallingRight;
    private Animation jumpFallingLeft;
    private boolean fallFromJump;
    
    public MovableAnimatedActor()
    {
        direction = "right";
        fallFromJump = false;
    }

    public void act(){
        super.act();
        //getting components of actor
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        
        //if no input action is idle
        String newAction = null;
        if (currentAction == null){
            newAction = "idle";
        }
        
        //keyboard input to movement 
        if (Mayflower.isKeyDown(Keyboard.KEY_RIGHT)){
            setLocation(x+1, y);
            if (isBlocked()){
                setLocation(x,y);
            }
            newAction = "walkRight";
            direction = "right";
        }
        else if (Mayflower.isKeyDown(Keyboard.KEY_LEFT)){
            setLocation(x-1, y);
            if (isBlocked()){
                setLocation(x,y);
            }
            newAction = "walkLeft";
            direction = "left";
        }
        else{
            newAction = "idle";
            if(direction != null && direction.equals("left"))
            {
                newAction = "idleLeft";
            } 

        }
        
        //seperate if statement because can move horizonatally and jump at the same time
        if (Mayflower.isKeyDown(Keyboard.KEY_SPACE)){
            jump();
        }
        
        //check if the fall is a result from a jump
        boolean falling = isFalling();
        if (isJumping()){
            fallFromJump = true;
        }
        else if (!falling || getY() + h >=600){
            fallFromJump = false;
        }
        
        if (falling && !isJumping()){
            if (fallFromJump ){
                if (direction.equals("left")){
                    newAction = "jumpFallingLeft";
                }
                else{
                    newAction = "jumpFallingRight";
                }
            }
            else{
                if (direction.equals("left")){
                    newAction = "fallingLeft";
                }
                else{
                    newAction = "fallingRight";
                }
            }
        }
        
        //actually codes the animaion + if on edge, stops from moving 
        int xright = getX()+ w;
        int ydown = getY()+h;
        if (xright >= 800){
            setLocation(x-1, y);
        }
        else if (ydown >= 600){
            setLocation(x, y-1);
            if (Mayflower.isKeyDown(Keyboard.KEY_RIGHT)){
                setLocation(x+1, y-1);
                if (isBlocked()){
                    setLocation(x,y);
                }
                newAction = "walkRight";
                direction = "right";
            }
            else if (Mayflower.isKeyDown(Keyboard.KEY_LEFT)){
                setLocation(x-1, y-1);
                if (isBlocked()){
                    setLocation(x,y);
                }
                newAction = "walkLeft";
                direction = "left";
            }
            else{
                newAction = "idle";
                if(direction != null && direction.equals("left"))
                {
                    newAction = "idleLeft";
                }
                
            }
        }
        else if (x<= 0){
            setLocation(x+1, y);
        }
        else if (y<0){
            setLocation(x, y+1);
        }
        
        //change each animation 
        if (isJumping()){
            if (direction.equals("left")){
                newAction = "jumpLeft";
            }
            else{
                newAction = "jumpRight";
            }
        }
        if (!newAction.equals(currentAction ) && (newAction != null)){
            if (newAction.equals("idle")){
                setAnimation(idle);
            }
            if (newAction.equals("walkRight")){
                setAnimation(walkRight);
            }
            if (newAction.equals("walkLeft")){
                setAnimation(walkLeft);
            }
            if (newAction.equals("idleLeft")){
                setAnimation(idleLeft);
            }
            if (newAction.equals("fallingRight")){
                setAnimation(fallingRight);
            }
            if (newAction.equals("fallingLeft")){
                setAnimation(fallingLeft);
            }
            if (newAction.equals("jumpRight")){
                setAnimation(jumpRight);
            }
            if (newAction.equals("jumpLeft")){
                setAnimation(jumpLeft);
            }
            if(newAction.equals("jumpFallingRight")){
                setAnimation(jumpRight);
            }
            if (newAction.equals("jumpFallingLeft")){
                setAnimation(jumpLeft);
            }
            currentAction = newAction;
        }
    }
    
    //set each animation
    public void setAnimation(Animation a){
        super.setAnimation(a);
    }
    public void setWalkRightAnimation(Animation ani){
        walkRight = ani;
    }
    public void setWalkLeftAnimation(Animation ani){
        walkLeft = ani;
    }
    public void setIdleAnimation(Animation ani){
        idle = ani;
    }
    public void setIdleLeftAnimation(Animation ani){
        idleLeft = ani;
    }
    public void setFallingRightAnimation(Animation ani){
        fallingRight = ani;
    }
    public void setFallingLeftAnimation(Animation ani){
        fallingLeft = ani;
    }
    public void setJumpingRightAnimation(Animation ani){
        jumpRight = ani;
    }
    public void setJumpingLeftAnimation(Animation ani){
        jumpLeft = ani;
    }
    public void setJumpFallingRightAnimation(Animation ani){
        jumpFallingRight = ani;
    }
    public void setJumpFallingLeftAnimation(Animation ani){
        jumpFallingLeft = ani;
    }

    
}