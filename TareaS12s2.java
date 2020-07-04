public class Magazine
{
    private int id;
    private String title;
    private String edition;
    private String editorial;
    private String autor;
    
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getEdition(){
        return edition;
    }
    public String getEditorial(){
        return editorial;
    }
    public String getAutor(){
        return autor;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setEdition(String edition){
        this.edition = edition;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
}

public class Book extends Magazine{
    private String isbn;
    private int timeReaded;
    
    public String getIsbn(){
        return isbn;
    }
    public int getTimeReaded(){
        return timeReaded;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setTimeReaded(int timeReaded){
        this.timeReaded = timeReaded;
    }
    public void read(){
        System.out.println("ID: " + getId() + "\nTitle: " + getTitle() + "\nEdition: " + getEdition() + "\nEditorial: " + getEditorial() + "\nAutor: " + getAutor() + "\nISBN: " + getIsbn() + "\nTiempo de lectura: " + getTimeReaded() + " horas");
    }
    
}
public class Principal{
    public static void main(String[] args){
        Book libro = new Book();
        libro.setId(1938463485);
        libro.setTitle("Harry Potter");
        libro.setEdition("primera edicion");
        libro.setEditorial("Scholastic Corporation");
        libro.setAutor("J. K. Rowling");
        libro.setIsbn("8d950200-5c3c-45cc-8f11-6a0110fc6e56");
        libro.setTimeReaded(50);
        libro.read();
    }
}
