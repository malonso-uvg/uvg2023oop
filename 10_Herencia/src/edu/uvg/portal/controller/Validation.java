/**
 * 
 */
package edu.uvg.portal.controller;

import java.util.ArrayList;

import edu.uvg.portal.model.Administrativo;
import edu.uvg.portal.model.Docente;
import edu.uvg.portal.model.Estudiante;
import edu.uvg.portal.model.User;

/**
 * @author MAAG
 *
 */
public class Validation {

	ArrayList<User> usuarios;
	
	public Validation() {
		usuarios = new ArrayList<User>();
		usuarios.add(new Docente("maalonso", "Test12345"));
		usuarios.add(new Estudiante("alo171164", "Test123"));
		usuarios.add(new Administrativo("super_admin", "1234"));
	}
	
	public User userHasAccess(String username, String password) {
		for (User usuario: usuarios) {
			if (usuario.login(username, password)) {
				return usuario;
			}
		}
		return null;
	}
}
