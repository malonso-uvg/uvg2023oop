import java.util.Scanner;

public class DriverProgram
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Escriba el mensaje a codificar");
        String mensaje = in.nextLine();

        System.out.println("El mensaje codificado es: ");
        System.out.println(Codificador.codificar(mensaje));

        System.out.println("Escriba el mensaje a decodificar");
        String mensaje_codificado = in.nextLine();

    
        System.out.println("El mensaje decodificado es: ");
        System.out.println(Codificador.decodificar(mensaje_codificado));
    }
}