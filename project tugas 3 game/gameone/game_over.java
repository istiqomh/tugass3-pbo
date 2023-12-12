import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game_over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game_over extends World
{

    /**
     * Constructor for objects of class game_over.
     * 
     */
    public game_over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
    }
    
    private void prepare()
    {
        play_again play_again = new play_again();
        addObject(play_again, 150, 250);
    }
}
