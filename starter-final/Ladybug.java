import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        checkWinAndTransition();
    }
    
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
    }
    
    public void checkWinAndTransition(){
        if (isTouching(FinishLocation.class)){
            World crabWorld = getWorld();
            World gameWonWorld =  new GameWonWorld();
            gameWonWorld.started();
            Greenfoot.setWorld(gameWonWorld);
        }
    }
}
