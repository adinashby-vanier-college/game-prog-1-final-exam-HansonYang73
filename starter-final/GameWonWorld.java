import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{
    private GreenfootSound winMusic;

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld()
    {
        super(800, 600, 1);
        winMusic =  new GreenfootSound("win.wav");
        showTextWithBigBlackFont("Congratulations, You Win!", 15, 300);
    }
    
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(65);
        bg.setFont(font);
        bg.setColor(Color.GREEN);
        bg.drawString(message, x, y);
    }

    /**
     * 
     */
    public void started()
    {
        winMusic.playLoop();
    }

    /**
     * 
     */
    public void stopped()
    {
        winMusic.stop();
    }
}
