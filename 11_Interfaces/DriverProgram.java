import java.util.ArrayList;
import java.util.Collections;

public class DriverProgram{
    public static void main(String[] args){

        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("uno");
        palabras.add("hola");
        palabras.add("uvg");
        palabras.add("poo");

        System.out.println("*** palabas DESORDENADAS ***");
        for (String palabra: palabras){
            System.out.println(palabra);
        }

        //Ordenando el ArrayList de cadenas
        Collections.sort(palabras);

        System.out.println("*** palabas ORDENADAS ***");
        for (String palabra: palabras){
            System.out.println(palabra);
        }

        ArrayList<Automovil> misAutos = new ArrayList<Automovil>();

        misAutos.add(new Automovil("Kia", "Sorento", 360000.00));
        misAutos.add(new Automovil("Toyota", "Yaris", 150000.00));
        misAutos.add(new Automovil("Nissan", "Qashqai", 250000.00));

        System.out.println("AUTOS DESORDENADOS");
        for (Automovil auto : misAutos){
            System.out.println(auto.toString());
        }

        Collections.sort(misAutos);

        System.out.println("AUTOS ORDENADOS");
        for (Automovil auto : misAutos){
            System.out.println(auto.toString());
        }
    }
}