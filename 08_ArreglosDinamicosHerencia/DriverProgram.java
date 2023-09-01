import java.util.ArrayList;
import java.util.Scanner;

public class DriverProgram
{
    public static void main(String[] args) {

        ArrayList<FiguraGeometrica> misFiguras = new ArrayList<FiguraGeometrica>();

        Scanner in = new Scanner(System.in);
        String opt = "";
        do {

            System.out.println("¿Qué desea ingresar?");
            System.out.println("1. Circulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Mostrar el arreglo");
            System.out.println("S. Salir");

            opt = in.nextLine();

            if (opt.equals("1")){
                //Circulo
                System.out.println("Ingrese el radio del circulo");
                double radio = Double.parseDouble(in.nextLine());
                misFiguras.add(new Circulo(radio));

            } else if (opt.equals("2")){
                //rectangulo
                System.out.println("Ingrese la base del rectangulo");
                double base = Double.parseDouble(in.nextLine());
                System.out.println("Ingrese la altura del rectangulo");
                double altura = Double.parseDouble(in.nextLine());
                misFiguras.add(new Rectangulo(base, altura));

            } else if (opt.equalsIgnoreCase("s")){
                System.out.println("Hasta luego");
            } else if (opt.equals("3")){
                for (int i = 0; i < misFiguras.size(); i++){
                    System.out.println("*********************");
                    System.out.println(misFiguras.get(i).toString());
                    System.out.println("area: " + misFiguras.get(i).calcularArea());
                    System.out.println("perimetro: " + misFiguras.get(i).calcularPerimetro());
                }
            }else {
                System.out.println("Opcion no valida");
            }

        }while(!opt.equalsIgnoreCase("s"));

        in.close();
        
    }
}