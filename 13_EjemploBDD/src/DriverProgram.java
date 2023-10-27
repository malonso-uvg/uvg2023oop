import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.DriverManager;

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
		
		 
		 try {
			 
			 System.out.println("Para leer datos desde db, presione 1; para leer desde archivos, presiones 2");
			 Scanner in = new Scanner(System.in);
			 
			 AlmacenamientoLeible almac;
			 
			 if (Integer.parseInt(in.nextLine()) == 1) {
				 almac = new MySqlAlmacenamiento("localhost", "loginapp", "java_user", "test1234");
				 
			 } else {
				 almac = new ArchivoCsvAlmacenamiento("C:\\Ejemplos");
			 }
			 
			 almac.obtenerTodosLosVehiculos();
			
			 
			 
		 }catch(Exception e) {
			 System.out.println(e.getMessage() + e.getStackTrace());
		 }
		 
		 

	}

}
