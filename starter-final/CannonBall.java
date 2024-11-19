import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{
    private int speed;
    public CannonBall(int angle, int speed){
        turn(angle);
        this.speed = speed;
        
    }
    
    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        killBugAndTransition();
        destroySelf();
    }
    
    public void destroySelf(){
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
    public void killBugAndTransition(){
        if (isTouching(Ladybug.class)){
            World world = getWorld();
            World gameOverWorld =  new GameOverWorld();
            gameOverWorld.started();
            Greenfoot.setWorld(gameOverWorld);
        }
    }
}
