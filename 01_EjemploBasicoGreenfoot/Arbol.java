import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arbol extends Actor
{
    public Arbol(int rotacion){
        setRotation(rotacion);
    }
    
    public Arbol(){
        
    }
    
    /**
     * Act - do whatever the Arbol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        haveBeenEaten();
    }
    
    public void haveBeenEaten(){
        if (isTouching(Oso.class)){ //Cada arbol detect si esta siendo comido por un oso
            MyWorld miMundo = (MyWorld) getWorld(); //Obtengo el mundo actual pero lo tengo que "castear" o convertir a mi mundo personalizado
            miMundo.puntos++;  //Incremento los puntos
            miMundo.etiquetaPuntos.actualizarImagen("" + miMundo.puntos);  //Actualizo la imagen
            miMundo.removeObject(this); //Elimino al arbol que esta siendo llamado
        }
    }
}
