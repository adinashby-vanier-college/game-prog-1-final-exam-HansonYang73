import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Canon extends Actor
{
    private SimpleTimer cooldown;
    private int speed;
    public Canon(){
        cooldown = new SimpleTimer();
        speed = (int) (Math.random() * 5) + 4;
        cooldown.mark();
    }
    
    public void act()
    {
        shoot();
    }
    
    public void shoot(){
        if (cooldown.millisElapsed() >= 1000){
            cooldown.mark();
            getWorld().addObject(new CannonBall(getRotation(), speed), getX(), getY());
        }
    }
}
