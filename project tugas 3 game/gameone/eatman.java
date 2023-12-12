import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eatman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eatman extends Actor
{
    /**
     * Act - do whatever the eatman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
        setLocation(getX()-5, getY());
        }
        
        if(Greenfoot.isKeyDown("right")){
        setLocation(getX()+5, getY());
        }
        
        if(Greenfoot.isKeyDown("space")){
        setLocation(getX(), getY());
        }
        yummy a = (yummy)getOneIntersectingObject(yummy.class);
        if (a!=null){
        getWorld().removeObject(a);
        play.score.add(10);
        }
        
        tire b = (tire)getOneIntersectingObject(tire.class);
        if (b!=null){
        getWorld().removeObject(b);
        play.health.add(-1);
        }
    }
}
