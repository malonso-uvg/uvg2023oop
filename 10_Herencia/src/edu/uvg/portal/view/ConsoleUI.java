/**
 * 
 */
package edu.uvg.portal.view;

import java.util.Scanner;

import edu.uvg.portal.controller.Validation;
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
		} else { //Fallo credenciales o usuario
			System.out.println("Fallo credenciales");
		}
	}

}
