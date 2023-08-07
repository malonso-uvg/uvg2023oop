import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class ConsoleUI {

	public void run() {
		Scanner in = new Scanner(System.in);
		String opt = "";
		
		do {
			ShowMenu();
			opt = in.nextLine(); 
			if (opt.equals("1")) {
				System.out.println("Ingrese el path del archivo");
				String path = in.nextLine();
				
				//Mando a llamar a FilesManager 
				ArrayList<String> todasLasPalabras = FilesManager.readFiles(path);
				ArrayList<String> palabrasPalindromas = Analyzer.analyze(todasLasPalabras);
				
				System.out.println("Texto analizado, escriba la ruta en donde desea guardar el resultado");
				path = in.nextLine();
				
				FilesManager.writeFiles(path, palabrasPalindromas);
				
				System.out.println("Generado exitosamente");
				
			} else if (opt.equals("2")){
				System.out.println("Muchas gracias por usar el programa");
			} else {
				System.out.println("Opcion no valida");
			}
			
		} while (!opt.equals("2"));
	}
	
	private void ShowMenu() {
		System.out.println("Desea analizar un archivo?");
		System.out.println("1. Analizar Archivo");
		System.out.println("2. Salir");
		
		//Si lo quisieran hacer en una sola linea
		//System.out.println("Desea analizar un archivo?\r\n1. Analizar Archivo\r\n2. Salir");
	}
}
