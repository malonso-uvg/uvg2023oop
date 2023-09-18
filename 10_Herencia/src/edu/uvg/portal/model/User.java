/**
 * 
 */
package edu.uvg.portal.model;

import java.util.Date;

/**
 * @author MAAG
 *
 */
public abstract class User {

	protected String username;
	protected String password;
	protected Date creationDate;
	protected int type;
	protected boolean isActive;
	
	public static int ESTUDIANTE = 0;
	public static int DOCENTE = 1;
	public static int ADMINISTRATIVO = 2;
	
	public User() {
		isActive = true;
		creationDate = new Date();
	}
	
	public User(String username, String password) {
		isActive = true;
		creationDate = new Date();
		setUsername(username);
		setPassword(password);
	}
	
	public void Deactivate(User adminUser) {
		if (adminUser.getType() == ADMINISTRATIVO) {
			isActive = false;
		}
	}
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	
	public boolean login(String username, String password) {
		return username.equals(getUsername()) && password.equals(getPassword());	
	}
	
	public abstract void showMenu();
	
}
