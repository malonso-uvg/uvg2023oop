import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public int puntos; //Lleva la cantidad de puntos
    public Etiqueta etiquetaPuntos;  //Sirve para mostrar la cantidad de puntos
    private Oso protagonista;
    private Enemigo miEnemigo;
    
    public Oso getProtagonista(){
        return protagonista;
    }
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        protagonista = new Oso();
        
        //Adding actors
        addObject(protagonista, 100, 100);
        
        
        //Crear los arboles en posiciones aleatorias, codigo con apoyo de ChatGPT
        

        // Crea una instancia de la clase Random
        Random random = new Random();
        // Genera un número aleatorio entre min (inclusive) y max (exclusive)
        
        int angulo = 0;
        for (int i = 0; i < 5; i++){
            angulo += 90; //angulo = angulo + 90;
    
            int randomPosicionX = random.nextInt(600 - 1) + 1;
            int randomPosicionY = random.nextInt(400 - 1) + 1;
            addObject(new Arbol(angulo), randomPosicionX, randomPosicionY);
        }
        
        for (int i = 0; i < 5; i++){
    
            int randomPosicionX = random.nextInt(600 - 1) + 1;
            int randomPosicionY = random.nextInt(400 - 1) + 1;
            addObject(new Arbol(), randomPosicionX, randomPosicionY);
        }
        
        puntos = 0;
        etiquetaPuntos = new Etiqueta("" + puntos, 24, Color.BLACK);
        addObject(etiquetaPuntos, getWidth() / 2, getHeight() / 2);
        
        miEnemigo = new Enemigo();
        addObject(miEnemigo, 300, 300);
        
    }
}
