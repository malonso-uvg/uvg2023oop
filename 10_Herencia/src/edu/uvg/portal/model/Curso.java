/**
 * 
 */
package edu.uvg.portal.model;

/**
 * @author MAAG
 *
 */
public class Curso {
	private String name;
	private String semestre;
	private int codigo;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the semestre
	 */
	public String getSemestre() {
		return semestre;
	}
	/**
	 * @param semestre the semestre to set
	 */
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " (" + getCodigo() + ") CURSO: " + getName() + " IMPARTIDO EN: " + getSemestre();
	}
	
	
}
