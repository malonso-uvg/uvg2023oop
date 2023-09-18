/**
 * 
 */
package edu.uvg.portal.model;

import java.util.ArrayList;

/**
 * @author MAAG
 *
 */
public class Estudiante extends User {


	private ArrayList<Nota> notas;
	
	public Estudiante(String username, String password) {
		super(username, password);
		setType(ESTUDIANTE);
		notas = new ArrayList<Nota>();
	}
	
	
	/**
	 * @return the notas
	 */
	public ArrayList<Nota> getNotas() {
		return notas;
	}


	@Override
	public void showMenu() {
		System.out.println("BIENVENIDO ESTUDIANTE");
		System.out.println("1. Ver Notas");
		System.out.println("2. Adquirir parqueo");
		System.out.println("3. Salir");

	}

}
