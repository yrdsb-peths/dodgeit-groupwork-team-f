import greenfoot.*;

public class Snake extends Actor
{
    private int speed = -10;
    public void act()
    {
        move(speed);
        if(getX() <= 0)
        {
            reset();
        }
        
        if(isTouching(Hero.class))
        {
            GameOver gameOver = new GameOver();
            getWorld.addObject(gameOver, 300, 300);
            getWorld.removeObject(this);
        }
    }
    public void reset()
    {
        int location = Greenfoot.getRandomNumber(2);
        if(location == 0)
        {
            setLocation(600, 300);
        }
        else
        {
            setLocation(600, 100);
        }
        int move = Greenfoot.getRandomNumber(3);
        if(move == 0)
        {
            speed = -5;
        }
        else if(move  == 1)
        {
            speed = -15;
        }
        else
        {
            speed = -10;
        }
    }
}
