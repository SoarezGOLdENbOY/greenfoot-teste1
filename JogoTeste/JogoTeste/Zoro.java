import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zoro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zoro extends Actor
{
    GifImage myGif = new GifImage ("ryo.gif");
    GreenfootSound hadu = new GreenfootSound("hadouken.mp3");    
    public int speed = 3;
    private int sTimer = 0;
    
    /**
     * Act - do whatever the Zoro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
        movimento();
      
    }
    public void movimento(){
        
        if (Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(), this.getY() - speed);
    }
        if (Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
    if (Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() - speed, this.getY());
    }
    if (Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX() + speed, this.getY());
    }
    else if (Greenfoot.isKeyDown("f")){
        getWorld().addObject(new hadouken(), getX() - 100, getY() + 30);
        hadu.play();
    }
    
}
    }