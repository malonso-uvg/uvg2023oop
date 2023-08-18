import java.util.Scanner;

public class DriverProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean ocurrioError = false;
        System.out.println("Ingrese un numero");
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        int dia_semana = 0;

        

        try{ //Adentro del bloque try colocamos lo que puede lanzar una exception
            numero1 = Integer.parseInt(in.nextLine());

            System.out.println("Ingrese otro numero");

            numero2 = Integer.parseInt(in.nextLine());
            
            resultado = Calculadora.cociente(numero1, numero2);

            System.out.println("Ingrese un dia de la semana");

            dia_semana = Integer.parseInt(in.nextLine());

            System.out.println("El dia de la semana es: " + Calculadora.diaSemanaVector(dia_semana));

        } catch (IndexOutOfBoundsException e){
            System.out.println("Error de indice fuera de rango" + e.getMessage());
        } catch (Exception e){ //Si ocurrio un error en el try, se ejecuta esta parte
            System.out.println("Ocurrio un error: " + e.getMessage() + " " + e.getStackTrace().toString());
            ocurrioError = true;
        } finally{ //Se ejecuta no importando si el error ocurrio o no

            if (ocurrioError){
                System.out.println("La cadena no era la representacion de un numero");
            } else {
                System.out.println("El numero que usted ingreso es " + resultado);
            }
        }
        

    }

}