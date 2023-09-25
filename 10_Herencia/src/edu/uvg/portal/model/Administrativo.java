/**
 * 
 */
package edu.uvg.portal.model;

/**
 * @author MAAG
 *
 */
public class Administrativo extends User implements IAdministrable{

	public Administrativo(String username, String password) {
		super(username, password);
		setType(ADMINISTRATIVO);
	}
	
	@Override
	public void showMenu() {
		System.out.println("BIENVENIDO ADMINISTRATIVO");
		System.out.println("1. Ingresar Notas");
		System.out.println("2. Generar Factura");
		System.out.println("3. Pago de salario");
		System.out.println("4. Salir");
		
	}

	@Override
	public void pagoDeSalario(double salario) {
		// TODO Auto-generated method stub
		System.out.println("Salario: " + salario + " descuento ISR " + salario*0.05 + " Descuento IGSS: " + salario*0.95*0.043 + " Salario liquido: " + salario*0.95*0.957);
	}
	
	public void pagarSalario(IAdministrable usuario, double salario) {
		usuario.pagoDeSalario(salario);
	}

}
