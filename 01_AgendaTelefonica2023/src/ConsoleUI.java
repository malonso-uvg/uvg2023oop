/**
 * 
 */
import java.util.Scanner;

/**
 * @author MAAG
 *
 */
public class ConsoleUI {
	
	Agenda miAgenda;
	
	public ConsoleUI() {
		miAgenda = new Agenda("Moises Alonso");
	}
	
	public ConsoleUI(String owner) {
		miAgenda = new Agenda(owner);
	}

	public void showMenu() {
		String opt = "";
		do {
			System.out.println("BIENVENIDO A LA AGENDA ELECTRONICA");
			System.out.println("Seleccione su opción");
			System.out.println("1. Mostrar la lista de contactos");
			System.out.println("2. Guardar Nuevo Contacto");
			System.out.println("3. Salir");
			
			Scanner in = new Scanner(System.in); //Lectura de datos desde la consola Entrada Estandar
			opt = in.nextLine();
			
			if (opt.equals("1")) {
				showContactList();
			} else if (opt.equals("2")) {
				saveContact(in);
			} else if (opt.equals("3")) {
				System.out.println("Adios");
			} else {
				System.out.println("Opción no valida");
			}
			
			
		}while(!opt.equals("3"));
	}
	
	public void showContactList() {
		for (int i = 0; i < miAgenda.showAllContacts().size() ; i++) {
			Persona actual = miAgenda.showAllContacts().get(i);
			System.out.println("***************************");
			System.out.println("CONTACTO " + (i + 1));
			System.out.println("nombre: " + actual.getNombre());
			System.out.println("telefono: " + actual.getPhoneNumber());
			System.out.println("email: " + actual.getEmail());
		}
	}
	
	public void saveContact(Scanner in) {
		
		
		System.out.println("Ingrese el nombre");
		String nombre = in.nextLine();
		System.out.println("Ingrese el email");
		String email = in.nextLine();
		System.out.println("Ingrese el numero de telefono");
		Integer phoneNumber = Integer.parseInt(in.nextLine());
		
		Persona nuevaPersona = new Persona(nombre, email, phoneNumber);
		
		miAgenda.saveContact(nuevaPersona);

		System.out.println("Contacto guardado exitosamente");
	}
}
