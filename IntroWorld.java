import greenfoot.*;
import java.time.*;
import java.time.temporal.*;

/**
 * Write a description of class IntroWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroWorld extends World
{
    private static final LocalDateTime introStart = LocalDateTime.now();
    private static final int WORLD_WIDTH = 500;
    private static final int WORLD_HEIGHT = 700;

    /**
     * Constructor for objects of class IntroWorld.
     */
    public IntroWorld()
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.drawString("Intro world. Hit <enter> to start game...", WORLD_WIDTH / 2 - 100, WORLD_HEIGHT / 2);
    }
    
    public void act()
    {
        long seconds = ChronoUnit.SECONDS.between(introStart, LocalDateTime.now());
        String key = Greenfoot.getKey();
        if (key != null && key.equals("enter") || seconds > 10)
        {
            Greenfoot.setWorld(new PingWorld(true));
        }
    }
    
}
