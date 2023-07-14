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
        desplazamiento++;    //Incremento la variable de 1 en 1
        if (desplazamiento >= 10) //Condicional Si desplazamiento es mayor o igual a 20
        {
            rotation = rotation + 90;
            rotation = rotation % 360;
            desplazamiento = 0;  //El desplazamiento regresa 0
            setRotation(rotation);   //Rota 180 grados para ir en sentido inverso
        }
        System.out.println("Desplazamiento" + desplazamiento);
        System.out.println("Rotacion " + getRotation());
        move(5);// Add your action code here.
    }
}
