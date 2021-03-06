import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the third level of the castle.
 * 
 * @Luc R.
 * @10/28/21
 */
public class Level3 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("Level1Sound.wav");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.8f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 6;
    private final Class NEXT_LEVEL = WinSplash.class;
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level3()
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
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player,76,750);
        addObject(new Floor(), 600, 800);
        addObject(new Bomb(GRAVITY), 550, 300);
        addObject(new SmBrickWall(), 450, 600);
        addObject(new SmBrickWall(), 400, 200);
        addObject(new BrickWall(), 1000, 200);
        addObject(new SmBrickWall(), 600, 400);
        addObject(new Bomb(GRAVITY), 900, 150);


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
