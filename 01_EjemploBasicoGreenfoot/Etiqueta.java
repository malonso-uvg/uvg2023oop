import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Etiqueta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Etiqueta extends Actor
{
    //Codigo generado a traves de ChatGPT
    private String texto;
    private int tamañoFuente;
    private Color colorTexto;

    public Etiqueta(String texto, int tamañoFuente, Color colorTexto) {
        this.texto = texto;
        this.tamañoFuente = tamañoFuente;
        this.colorTexto = colorTexto;
        actualizarImagen(texto);
    }

    public void act() {
        // Puedes agregar aquí cualquier comportamiento específico que desees para la etiqueta
    }

    public void actualizarImagen(String texto) {
        GreenfootImage imagen = new GreenfootImage(texto, tamañoFuente, colorTexto, null);
        setImage(imagen);
    }
}
