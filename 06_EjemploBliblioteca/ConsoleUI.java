import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUI {
    ArrayList< ArrayList<Book> > miLibraries;

    public ConsoleUI(){
        miLibraries = new ArrayList< ArrayList<Book> >(); //Aca solo estoy instanciando las librerias
    }

    private void menu(){
        System.out.println("** Biblioteca Electronica**");
        System.out.println("Seleccione una opción");
        System.out.println("1. Crear Nueva biblioteca");
        System.out.println("2. Seleccionar una biblioteca");
        System.out.println("3. Crear Libro en biblioteca seleccionada");
        System.out.println("4. Crear Libro en biblioteca Especifica");
        System.out.println("5. Mostrar libros de la biblioteca actual");
        System.out.println("6. Mostrar todos los libros");
        System.out.println("7. Salir");
    }

    private void createNewLibrary(Scanner in){

        String opt = "";
        do{
            System.out.println("Desea crear Una libreria nueva? S / N");
            opt = in.nextLine();

            if (!opt.equalsIgnoreCase("S") || !opt.equalsIgnoreCase("N")){
                System.out.println("Opción no válida, ingrese la opción correcta");
            }

        }while(!opt.equalsIgnoreCase("S") || !opt.equalsIgnoreCase("N"));
        

        if (opt.equalsIgnoreCase("s")){
            miLibraries.add( new ArrayList<Book>() );
            System.out.println("Se creo la nueva biblioteca con ID " + (miLibraries.size() - 1));
        } else {
            System.out.println("No se creo ninguna libreria");
        }

    }

    public ArrayList< Book > selectLibrary(Scanner in){

        boolean isCorrectIndex = true;
        ArrayList<Book> selectedLibrary = null;

        do {

            System.out.println("Ingrese el ID de la biblioteca");
            int index = Integer.parseInt(in.nextLine());

            try {
                selectedLibrary = miLibraries.get(index);
                isCorrectIndex = true;
            } catch (IndexOutOfBoundsException e){
                isCorrectIndex = false;
                System.out.println("El ID no es correcto, por favor intentar nuevamente");
            }

        }while(!isCorrectIndex);
        

        return selectedLibrary;
    
    }
}

