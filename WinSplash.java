import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinSplash extends World
{   
    private final GreenfootSound MUSIC = new GreenfootSound("WinMusic.wav");
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public WinSplash()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1024, 768, 1); 
        
    }
}
