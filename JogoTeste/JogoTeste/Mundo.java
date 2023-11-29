import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Zoro zoro = new Zoro();
        addObject(zoro,136,512);
        zoro.setLocation(140,509);
        luffy luffy = new luffy();
        addObject(luffy,690,441);
        luffy.setLocation(548,383);
        CopyOfCounter copyOfCounter = new CopyOfCounter();
        addObject(copyOfCounter,653,33);
        Counter counter = new Counter();
        addObject(counter,149,43);
    }
}
