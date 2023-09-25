/**
 * 
 */
package edu.uvg.portal.view;

import java.util.Scanner;

import edu.uvg.portal.controller.Validation;
import edu.uvg.portal.model.Administrativo;
import edu.uvg.portal.model.Docente;
import edu.uvg.portal.model.Estudiante;
import edu.uvg.portal.model.User;

/**
 * @author MAAG
 *
 */
public class ConsoleUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Validation validacionUsuarios = new Validation();
		
		System.out.println("Bienvenido a Portal UVG");
		System.out.println("Ingrese su usuario");
		String username = in.nextLine();
		System.out.println("Ingrese su password");
		String password = in.nextLine();
		
		User usuario = validacionUsuarios.userHasAccess(username, password); 
		
		if (usuario != null) { //Si lo encontro con las credenciales correctas
			usuario.showMenu();
			
			switch(usuario.getType()) {
			
			case 0 :{ //Estudiante
				
				//Hago que usuario sea un estudiante
				Estudiante miEstudiante = (Estudiante)usuario;
				miEstudiante.getNotas(); //Este metodo solo es de esutidante
				
			}break;
			
			case 1:{ //Docente
				
				//Hago que el usuario sea un docente
				Docente miDocente = (Docente)usuario;
				miDocente.calificar(null, 0); //Este metodo solo es de docente
				
			}break;
			
			case 2:{ //Administrativo
				
				//Hago que el usuario sea un docente
				Administrativo miAdministrativo = (Administrativo)usuario;
				System.out.println("Seleccione su opcion");
				int opt = Integer.parseInt(in.nextLine());
				
				switch(opt) {
				case 3:{ //pago de salario
					System.out.println("Ingrese el salario del docente");
					Docente docente1 = new Docente("docente1", "1234");
					double salarioDocente = Double.parseDouble(in.nextLine());
					miAdministrativo.pagarSalario(docente1, salarioDocente);
					
					System.out.println("Ingrese el salario del administrativo");
					Administrativo admin1 = new Administrativo("admin1", "1234");
					double salarioAdministrativo = Double.parseDouble(in.nextLine());
					miAdministrativo.pagarSalario(admin1, salarioAdministrativo);
					
					
					

					
					}
					break;
				}
				
				
				
			}break;
			
			}
		} else { //Fallo credenciales o usuario
			System.out.println("Fallo credenciales");
		}
	}

}
