import java.util.ArrayList;

public class Book{
    private String title;
    private ArrayList<String> authors;
    private int year;
    private String ISBN;

    public Book(String title, String ISBN, ArrayList<String> authors, int year) throws Exception{
        setTitle(title);
        setAuthors(authors);
        setYear(year);
        setISBN(ISBN);
    }

    
    @Override
    public String toString() {
        
        return "Titulo > " + title + " ISBN > " + ISBN;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws Exception{
        if (title.trim().equals("")) //Si el if es de una sola linea puedo omitir las llaves {}
            throw new Exception("The title must not be empty");

        this.title = title;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) throws Exception{
        if (iSBN.trim().equals("")) //Si el if es de una sola linea puedo omitir las llaves {}
            throw new Exception("The ISBN must not be empty");

        ISBN = iSBN;
    }

    
    
}
