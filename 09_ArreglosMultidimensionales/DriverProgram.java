import java.util.Scanner;

public class DriverProgram
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Escriba el mensaje a codificar");
        String mensaje = in.nextLine();

        String[][] matrizOriginal = Codificador.calcularMatriz(mensaje);

        System.out.println("Matriz original");
        for (int i = 0; i < matrizOriginal.length; i++){
            for (int j = 0; j < matrizOriginal[0].length; j++){
                System.out.print(" " + matrizOriginal[i][j] );
            }
            System.out.println();
        }

        String[][] matrizTranspuesta = Codificador.calcularMatrizTranspuesta(matrizOriginal);
        System.out.println("Matriz Transpuesta");
        for (int i = 0; i < matrizTranspuesta.length; i++){
            for (int j = 0; j < matrizTranspuesta[0].length; j++){
                System.out.print(" " + matrizTranspuesta[i][j] );
            }
            System.out.println();
        }

        System.out.println("El mensaje codificado es: ");
        System.out.println(Codificador.codificar(mensaje));
    }
}