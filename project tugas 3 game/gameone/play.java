import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends World
{
static Counter score = new Counter("score");
static Counter health = new Counter("health");

    /**
     * Constructor for objects of class play.
     * 
     */
    public play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        eatman eatman = new eatman();
        addObject(eatman,152,473);

        addObject(score, 40, 30);
        score.setValue(0);

        addObject(health, 260, 30);
        health.setValue(10);

        play_again play_again = new play_again();
        addObject(play_again,148,234);
    }

    public void act(){
    if(Greenfoot.getRandomNumber(500)<3){
    addObject(new yummy(),Greenfoot.getRandomNumber(1000),1);
    }
    
    if(Greenfoot.getRandomNumber(500)<3){
    addObject(new tire(),Greenfoot.getRandomNumber(1000),1);
    }
    if (play.health.getValue() == 0){
    Greenfoot.setWorld(new game_over());
    }
    }
    
}
