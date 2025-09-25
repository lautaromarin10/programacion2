package BibliotecaLibros;
import java.util.ArrayList;

/**
 *
 * @author lautaromarin
 */
public class Biblioteca {
    String nombre;
    ArrayList<Libro> libros = new ArrayList<>();
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        
        libros.add(nuevoLibro);
        System.out.println("Nuevo libro agregado");
    }
    
    public void listarLibros(){
        System.out.println("Lista de libros");
        
        if(!libros.isEmpty()){
            System.out.println("Lista de libros vacia");
            for(Libro libro: libros){
            System.out.println(libro);
            }
        }
        
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
        for(Libro libro: libros){
            if(libro.isbn.equals(isbn)){
                return libro;
            }
        }
        return null;
    }
    
    public void EliminarLibro(String isbn){
        
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        
        if(libroAEliminar != null){
            libros.remove(libroAEliminar);
            System.out.println("Libro eliminado con exito");
        }
        
    }
    
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio){
        
        ArrayList<Libro> librosFiltrados = new ArrayList<>();
        
        for(Libro libro: libros){
            if(libro.anioPublicacion == anio){
                librosFiltrados.add(libro);
            }
        }
        
        return librosFiltrados;
        
    }

    
    public ArrayList<Autor> mostrarAutoresDisponibles(){
        
         ArrayList<Autor> AutoresDisponibles = new ArrayList<>();
         
         for(Libro libro: libros){
             if(!AutoresDisponibles.contains(libro.autor)){
                 AutoresDisponibles.add(libro.autor);
             }
         }
         
         return AutoresDisponibles;
    
    }
    
}
