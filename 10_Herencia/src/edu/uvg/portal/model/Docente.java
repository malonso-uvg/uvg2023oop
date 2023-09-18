/**
 * 
 */
package edu.uvg.portal.model;

import java.util.ArrayList;

/**
 * @author MAAG
 *
 */
public class Docente extends User {

	private ArrayList<Curso> nombramientos;
	
	public Docente(String username, String password) {
		super(username, password);
		setType(DOCENTE);
		nombramientos = new ArrayList<Curso>();
	}
	
	
	
	/**
	 * @return the nombramientos
	 */
	public ArrayList<Curso> getNombramientos() {
		return nombramientos;
	}



	@Override
	public void showMenu() {
		System.out.println("BIENVENIDO DOCENTE");
		System.out.println("1. Ingresar Notas");
		System.out.println("2. Generar Factura");
		System.out.println("3. Salir");
	}
	
	public Nota calificar(Curso curso, double nota) {
		return new Nota(curso, nota);
	}
	
	public void mostrarNombramientos() {
		for (int i = 0; i < nombramientos.size(); i++) {
			System.out.println(nombramientos.get(i).toString());
		}
	}

}
