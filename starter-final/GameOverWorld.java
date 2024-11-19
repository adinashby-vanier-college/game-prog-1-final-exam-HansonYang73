import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{
    private GreenfootSound gameMusic;
    
    public GameOverWorld()
    {
        super(800, 600, 1);
        gameMusic =  new GreenfootSound("lose.wav");
        showTextWithBigBlackFont("Game Over!", 160, 320);
    }
    
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(100);
        bg.setFont(font);
        bg.setColor(Color.RED);
        bg.drawString(message, x, y);
    }
    
    public void started()
    {
        gameMusic.playLoop();
    }
    
    public void stopped()
    {
        gameMusic.stop();
    }
}
