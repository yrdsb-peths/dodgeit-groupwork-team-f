import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Snake snake = new Snake();
        addObject(snake, 600, 100);

        Hero hero = new Hero();
        addObject(hero, 100, 100);
    }
}
