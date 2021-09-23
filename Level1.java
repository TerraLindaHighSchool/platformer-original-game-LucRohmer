import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
        
    }
    
    public void act()
    {
        spawn();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);
        Door door = new Door();
        addObject(door,1150,130);
        Player player = new Player();
        addObject(player,76,750);
        addObject(new Floor(), 600, 800);
        addObject(new Bomb(GRAVITY), 500, 300);
        addObject(new BrickWall(), 500, 350);
        addObject(new SmBrickWall(), 850, 500);
        addObject(new BrickWall(), 600, 650);
        addObject(new Gem(), 850, 450);
        addObject(new TrapDoor(), 170, 530);
        addObject(new Gem(), 200, 200);
        addObject(new BrickWall(), 1000, 200);
        addObject(new SmBrickWall(), 1100, 400);
        addObject(new Bomb(GRAVITY), 900, 150);
        addObject(new Gem(), 1100, 350);

    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
            addObject(new AcidRain(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
