import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a bomb it will hurt you if you touch it.
 * 
 * @Luc R.
 * @10/28/21
 */
public class Bomb extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    
    public Bomb(float gravity)
    {
        GRAVITY = gravity;
    }

    public void act()
    {
        fall();

    }

    protected void fall()
    { 
        if(!isOnGround())
        {
            yVelocity += GRAVITY;
            setLocation(getX(), getY() + (int) yVelocity);
    }
    }
}
