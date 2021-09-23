import greenfoot.*;

/**
 * Write a description of class HumanPaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Actor
{
    // instance variables - replace the example below with your own
    private int width;
    private int height;
    private String leftKey;
    private String rightKey;
    private Color color;
    private boolean ballTouching = false;

    /**
     * Constructor for objects of class HumanPaddle
     */
    public Paddle(Color color, String leftKey, String rightKey, int width, int height)
    {
        this.color = color;
        this.leftKey = leftKey;
        this.rightKey = rightKey;
        this.width = width;
        this.height = height;
        
        createImage();
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown(leftKey) && getX() > 0)
        {
            setLocation(getX() - 1, getY());
        }
        else if(Greenfoot.isKeyDown(rightKey) && getX() - width < getWorld().getWidth())
        {
            setLocation(getX() + 1, getY());
        }
        
    }
    
    private void createImage()
    {
        GreenfootImage image = new GreenfootImage(width, height);
        image.setColor(color);
        image.fill();
        setImage(image);
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public void hitByBall()
    {
        // Implement this method so that the width of the paddle is reduced by 10 every time
        // the ball is hit. When the width is below 10 you are not allowed to make it smaller.
    }
}
