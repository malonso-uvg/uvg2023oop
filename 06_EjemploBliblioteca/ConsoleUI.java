import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUI {
    private ArrayList< ArrayList<Book> > miLibraries;

    public ConsoleUI(){
        miLibraries = new ArrayList< ArrayList<Book> >(); //Aca solo estoy instanciando las librerias
    }

    public void run(){
        Scanner in = new Scanner(System.in);
        String opt = "";
        ArrayList<Book> selectedLibrery = null;
        do {
            menu();
            opt = in.nextLine();

            switch(opt){
                case "1":
                    createNewLibrary(in);
                break;

                case "2":
                    selectedLibrery = selectLibrary(in);
                break;

                case "3":
                    try {
                         createBookInLibrary(selectedLibrery, in);
                    } catch (Exception e) {
                        System.out.println("Error al crear libro " + e.getMessage());
                    }
                    
                break;

                case "6":
                    showAllBooks();
                break;

                case "7":
                    System.out.println("Hasta pronto");
                break;

                default: 
                    System.out.println("Opción no válida");
                break;
            }

        }while(!opt.equals("7"));
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

            if (!opt.equalsIgnoreCase("S") && !opt.equalsIgnoreCase("N")){
                System.out.println("Opción no válida, ingrese la opción correcta");
            }

        }while(!opt.equalsIgnoreCase("S") && !opt.equalsIgnoreCase("N"));
        

        if (opt.equalsIgnoreCase("s")){
            miLibraries.add( new ArrayList<Book>() );
            System.out.println("Se creo la nueva biblioteca con ID " + (miLibraries.size() - 1));
        } else {
            System.out.println("No se creo ninguna libreria");
        }

    }

    private ArrayList< Book > selectLibrary(Scanner in){

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

    private void createBookInLibrary(ArrayList<Book> library, Scanner in) throws Exception{
        String title = "";
        boolean isCorrectData = true;
        do{
            System.out.println("Ingrese el titulo del libro");
            title = in.nextLine();
            isCorrectData = !title.trim().equals("");

            if (!isCorrectData){
                System.out.println("El titulo no puede ser vacio");
            } else {
                System.out.println("Titulo correcto");
            }

        }while(!isCorrectData);


        String isbn = "";
        isCorrectData = true;
        do{
            System.out.println("Ingrese el isbn del libro");
            isbn = in.nextLine();
            isCorrectData = !isbn.trim().equals("");

            if (!isCorrectData){
                System.out.println("El ISBN no puede ser vacio");
            } else {
                System.out.println("ISBN correcto");
            }

        }while(!isCorrectData);

        String author = "";
        ArrayList<String> authors = new ArrayList<String>();

        do{
            System.out.println("Ingrese el nombre del autor o S para salir");

            author = in.nextLine();

            if (!author.equalsIgnoreCase("s") && !author.equalsIgnoreCase("")){
                authors.add(author);
            }

        }while(!author.equalsIgnoreCase("s"));

        library.add( new Book(title, isbn, authors, 0) );
    }

    private void showAllBooks(){
        for (int i = 0; i < miLibraries.size(); i++){
            ArrayList<Book> libreria = miLibraries.get(i);
            for (int j = 0; j < libreria.size(); j++){
                System.out.println("Libreria > " + i + " Libro " + j + " ===> " + libreria.get(j).toString());
            }   
        }
    }

}

