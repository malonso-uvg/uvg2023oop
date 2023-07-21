import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Oso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oso extends Actor
{
    /**
     * Act - do whatever the Oso wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int desplazamiento = 0; //Creo una variable entera que se incrementara al llamar al metodo act
    private int rotation = 0;
    
    public void act()
    {
        checkKeyPress();
    }
    
     public void checkKeyPress() {
        // Utiliza el objeto de clase Greenfoot para verificar si se ha presionado alguna tecla
        if (Greenfoot.isKeyDown("up")) {
            setRotation(270);
            move(5);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(5);
        }
        if (Greenfoot.isKeyDown("left")) {
            setRotation(180);
            move(5);
        }
        if (Greenfoot.isKeyDown("right")) {
            setRotation(0);
            move(5);
        }
        // Puedes agregar más condicionales para otras teclas si lo deseas.
    }
}
