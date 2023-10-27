/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class Vehiculo {

	private String placa;
	private String marca;
	private String linea;
	private int modelo;
	
	public Vehiculo() {
		setPlaca("");
		setMarca("");
		setLinea("");
		setModelo(0);
	}
	
	public Vehiculo(String placa, String marca, String linea, int modelo) {
		setPlaca(placa);
		setMarca(marca);
		setLinea(linea);
		setModelo(modelo);
	}
	
	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}
	/**
	 * @param linea the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}
	/**
	 * @return the modelo
	 */
	public int getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	
}
