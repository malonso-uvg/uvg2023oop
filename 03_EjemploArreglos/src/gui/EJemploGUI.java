/**
 * 
 */
package gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 * @author MAAG
 *
 */
public class EJemploGUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("¿Cuantos valores desea generar?");
		Scanner in = new Scanner(System.in);
		int qty = Integer.parseInt( in.nextLine() );
		//int qty = in.nextInt();
		
		Integer[] misValores = new Integer[qty];
		Integer[] misValoresQst = new Integer[qty];
		Boolean[] miBoolean = new Boolean[50];
		String[] diasDeLaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		
		
		for (int i = 0; i < qty; i++) {
			 misValores[i] = (int) (Math.floor(Math.random()*(1000)));  // Valor entre 0 y 1000
			 misValoresQst[i] = misValores[i]; 
		}
		
		//Comparación usando BubbleSort
		BubbleSort<Integer> mySort = new BubbleSort<Integer>();
		System.out.println("NUMEROS DESORDENADOS");
		EscribirArreglo(misValores);
		System.out.println("ORDENANDO...");
		mySort.sort(misValores, new ComparadorEnteros<Integer>());
		System.out.println("NUMEROS ORDENADOS");
		EscribirArreglo(misValores);
		
		System.out.println("Presione una tecla para continuar con quicksort");
		in.nextLine();
		
		//Comparación usando QuickSort
		QuickSort<Integer> mySortQst = new QuickSort<Integer>();
		System.out.println("NUMEROS DESORDENADOS QUICKSORT");
		EscribirArreglo(misValoresQst);
		System.out.println("ORDENANDO QUICKSORT...");
		mySortQst.quickSort(misValoresQst, 0, misValoresQst.length - 1, new ComparadorEnteros<Integer>());
		System.out.println("NUMEROS ORDENADOS QUICKSORT");
		EscribirArreglo(misValoresQst);
		
		
		Estudiante[] misEstudiantes_v1 = new Estudiante[5];
		misEstudiantes_v1[0] = new Estudiante(1234, "Moises", 90);
		misEstudiantes_v1[1] = new Estudiante(1235, "Antonio", 50);
		misEstudiantes_v1[2] = new Estudiante(1236, "Estudiante1", 50);
		misEstudiantes_v1[3] = new Estudiante(1237, "Estudiante1", 50);
		misEstudiantes_v1[4] = new Estudiante(1240, "Estudiante3", 100);
		
		
				
		ArregloInterno[] arreglosCompuestos = new ArregloInterno[50];
		for (int i = 0; i < arreglosCompuestos.length; i++) {
			arreglosCompuestos[i] = new ArregloInterno(100);
		}
		
		for (int i = 0; i < arreglosCompuestos.length; i++) {
			for (int j = 0; j < 100; j++) {
				arreglosCompuestos[i].miArregloInterno[j] = (int) (Math.floor(Math.random()*(1000)));
			}
		}
		
		
		System.out.println("INICIA EJEMPLO ARREGLOS DE ARREGLOS");
		for (int i = 0; i < arreglosCompuestos.length; i++) {
			
			for (int j = 0; j < 100; j++) {
				int numero = arreglosCompuestos[i].miArregloInterno[j];
				System.out.println("[" + i +"] => " + numero);
				//out.println(numero);
			}
		}
		System.out.println("TERMINA EJEMPLO ARREGLOS DE ARREGLOS");
		
		BubbleSort<Estudiante> mySortEstudiante = new BubbleSort<Estudiante>();
		System.out.println("ESTUDIANTES DESORDENADOS");
		EscribirArreglo(misEstudiantes_v1);
		System.out.println("ORDENANDO...");
		mySortEstudiante.sort(misEstudiantes_v1, new ComparadorEstudiantes<Estudiante>());
		System.out.println("NUMEROS ORDENADOS");
		EscribirArreglo(misEstudiantes_v1);
		
		ArrayList<String> misPalabras = new ArrayList<String>();
		
		misPalabras.add("Hola");
		misPalabras.add("Adios");
		misPalabras.add("Mundo");
		misPalabras.add("UVG");
		misPalabras.add("Programacion");
		
		System.out.println("PALABRAS DESORDENADAS");
		EscribirArrayList(misPalabras);
		System.out.println("ORDENANDO");
		Collections.sort(misPalabras);
		System.out.println("PALABRAS ORDENADAS");
		EscribirArrayList(misPalabras);
		
		
		ArrayList<Estudiante> misEstudiantes_v2 = new ArrayList<Estudiante>();
		misEstudiantes_v2.add( new Estudiante(1234, "Moises", 90) );
		misEstudiantes_v2.add( new Estudiante(1235, "Antonio", 50) );
		misEstudiantes_v2.add( new Estudiante(1236, "Estudiante1", 50) );
		misEstudiantes_v2.add( new Estudiante(1237, "Estudiante1", 50) );
		misEstudiantes_v2.add( new Estudiante(1240, "Estudiante3", 100) );
		
		System.out.println("ESTUDIANTES DESORDENADOS");
		EscribirArrayList(misEstudiantes_v2);
		System.out.println("ORDENANDO..");
		Collections.sort(misEstudiantes_v2);
		System.out.println("ESTUDIANTES ORDENADOS");
		EscribirArrayList(misEstudiantes_v2);
		
	}
	
	public static void EscribirArrayList(ArrayList _items) {
		for (int i = 0; i < _items.size(); i++) {
			System.out.println("[" + i + "] => " + _items.get(i).toString());
		}
	}
	
	public static void EscribirArreglo(Estudiante[] misEstudiantes) {
		for (int i = 0; i < misEstudiantes.length; i++) {
			System.out.println("[" + i + "] => " + misEstudiantes[i].toString());
		}
	}
	
	public static void EscribirArreglo(Integer[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("[" + i + "] => " + arreglo[i]);
		}
	}

}
