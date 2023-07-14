import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DElfin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DElfin extends Actor
{
    public DElfin(){
        setRotation(45);
    }
    
    /**
     * Act - do whatever the DElfin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        if (isAtEdge()){
            setRotation((getRotation() + 180) % 360);
        }
    }
}
