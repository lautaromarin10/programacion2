package BibliotecaLibros;

/**
 *
 * @author lautaromarin
 */
public class Libro {
    
    String isbn;
    String titulo;
    int anioPublicacion;
    Autor autor;
    
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + "\naño de publicación: " + anioPublicacion + "\nautor: " + autor.nombre + "\nisbn: " + isbn);
    }

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
   
    @Override
    public String toString() {
    return "Titulo: " + titulo +
           "\nAño de publicación: " + anioPublicacion +
           "\nISBN: " + isbn +
           "\n" + autor; // acá se usa el toString() de Autor
    }
    
}
