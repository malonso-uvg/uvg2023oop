/**
 * 
 */
package edu.uvg.portal.model;

/**
 * @author MAAG
 *
 */
public class Nota {

	private Curso curso;
	private double nota;
	
	public Nota(Curso _curso, double _nota) {
		curso = _curso;
		nota = _nota;
	}
	
	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	/**
	 * @return the nota
	 */
	public double getNota() {
		return nota;
	}
	/**
	 * @param nota the nota to set
	 */
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return getCurso().toString() + " NOTA: " + getNota();
	}
	
}
