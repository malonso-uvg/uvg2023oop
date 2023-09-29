/**
 * 
 */
package gui;

/**
 * @author MAAG
 *
 */
public class ArregloInterno {

	public Integer[] miArregloInterno;
	public String[] miArregloInternoStrings;
	
	public ArregloInterno(int cantidad_elementos) {
		miArregloInterno = new Integer[cantidad_elementos];
		miArregloInternoStrings = new String[cantidad_elementos];
	}
	
	public void getInformation(String ... parametros ) {
		String valor = parametros[0];
	}
	
	public void getInformation2(String[] parametros ) {
		String valor = parametros[0];
	}
}
