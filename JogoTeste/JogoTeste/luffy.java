import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class luffy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class luffy extends Actor
{
    GifImage myGif2 = new GifImage ("ezgif-1-46bf58af3e.gif");
    
    public int speed = 3;
    private int sTimer = 0;
    /**
     * Act - do whatever the luffy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif2.getCurrentImage());
        movimento();
    }
    public void movimento(){
        
        if (Greenfoot.isKeyDown("up")){
        this.setLocation(this.getX(), this.getY() - speed);
    }
    else if (Greenfoot.isKeyDown("down")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
    else if (Greenfoot.isKeyDown("left")){
        this.setLocation(this.getX() - speed, this.getY());
    }
    else if (Greenfoot.isKeyDown("right")){
        this.setLocation(this.getX() + speed, this.getY());
    }
}
}

