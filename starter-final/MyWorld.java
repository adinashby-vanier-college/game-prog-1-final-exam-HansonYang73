import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Canon canon =  new  Canon();
        addObject(canon, 95, 92);
        Canon canon2 =  new  Canon();
        addObject(canon2, 321, 277);
        Canon canon3 =  new  Canon();
        addObject(canon3, 692, 107);
        Canon canon4 =  new  Canon();
        addObject(canon4, 708, 478);
        Canon canon5 =  new  Canon();
        addObject(canon5, 497, 52);
        canon3.setLocation(730, 171);
        canon2.setLocation(289, 316);
        FinishLocation finishLocation =  new  FinishLocation();
        addObject(finishLocation, 75, 324);
        Ladybug hero =  new  Ladybug();
        addObject(hero, 720, 286);
        hero.setLocation(731, 298);
        hero.setLocation(709, 282);
        removeObject(hero);
        addObject(hero, 711, 302);
        hero.setLocation(722, 39);
        canon3.setRotation(180);
        canon4.setLocation(737, 479);
        canon4.setRotation(180);
        canon5.setRotation(90);
        hero.setRotation(180);
        hero.setLocation(742, 58);
        hero.setLocation(734, 54);
    }
}
