import java.util.Scanner;

/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class DriverProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Cuantos numeros desea generar?");
		int cantidad = Integer.parseInt(in.nextLine());
		int LIMITE = 5000;
		
		Integer[] arregloA = new Integer[cantidad];
		Integer[] arregloB = new Integer[cantidad];
		
		System.out.println("**** ARREGLO A ****");
		for (int i = 0; i < cantidad; i++) {
			arregloA[i] = (int) (Math.floor(Math.random()*(LIMITE)));
			System.out.println("[ " + i + "]" + arregloA[i]);
		}
		
		//arregloA[10] = 220;
		
		System.out.println("**** ARREGLO B ****");
		for (int i = 0; i < cantidad; i++) {
			arregloB[i] = (int) (Math.floor(Math.random()*(LIMITE)));
			System.out.println("[ " + i + "]" + arregloB[i]);
		}
		
		//arregloB[10] = 284;
		
		for (int i = 0; i < cantidad; i++) {
			for (int j = 0; j < cantidad; j++) {
				if (sonAmigos(arregloA[i], arregloB[j])) {
					System.out.println("la posición  [" + i + "] -> " + arregloA[i] + " del arreglo A y la posición [" + j + "] -> " + arregloB[j] +" del arreglo B son números amigos");
				}
			}
		}
		
		
	}
	
	private static boolean sonAmigos(int numeroA, int numeroB) {
		if (numeroA != getSumaDivisores(numeroB))
			return false;
		
		if (numeroB != getSumaDivisores(numeroA))
			return false;
					
		return true;
	}
	
	private static int getSumaDivisores(int numero) {
		int acumula_divisores = 0;
		for (int i = 1; i < numero; i++) {
			if ((numero % i) == 0) {
				acumula_divisores += i;
			}
		}
		return acumula_divisores;
	}

}
