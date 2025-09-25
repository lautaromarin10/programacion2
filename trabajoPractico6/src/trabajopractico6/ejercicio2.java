
package trabajopractico6;
import BibliotecaLibros.Biblioteca;
import BibliotecaLibros.Autor;
import BibliotecaLibros.Libro;

/**
 *
 * @author lautaromarin
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //1- crear biblioteca
        Biblioteca biblioteca = new Biblioteca();
        
        //2 - creamos autores
        Autor edgar = new Autor("edgarp", "Edgar Allan Poe" , "Estadounidense");
        Autor cortazar = new Autor("julioc", "Julio Cortázar" , "Argentino");
        Autor jorgeb = new Autor("jorgeb", "Jorge Luis Borges" , "Argentino");
        
        //3 - agregamos 5 libros
        biblioteca.agregarLibro("lax21", "Casa tomada", 1946, cortazar);
        biblioteca.agregarLibro("ray1", "Rayuela", 1963, cortazar);
        biblioteca.agregarLibro("babl1", "La biblioteca de Babel", 1941, jorgeb);
        biblioteca.agregarLibro("al3p", "El aleph", 1945, jorgeb);
        biblioteca.agregarLibro("cuer1", "El cuervo", 1845, edgar);
        
        //4 - Listamos los libros con su información y la del autor
        biblioteca.listarLibros();
        
        //5 - Buscar libro por su ISBN y mostrar información
        System.out.println(biblioteca.buscarLibroPorIsbn("lax21"));
        
        //6 - Filtrar y mostrar los libros publicados en un año especifico
        System.out.println(biblioteca.filtrarLibrosPorAnio(1945));
        
        //7 - Eliminar un libro por su ISBN y listar los libros restantes.
        biblioteca.EliminarLibro("cuer1");
        biblioteca.listarLibros();
        
        //8 - Mostrar la cantidad total de libros de la biblioteca.
        System.out.println("Lista de libros totales: " + biblioteca.obtenerCantidadLibros());
        
        //9 - Listar todos los autores disponbiles en la biblioteca.
        System.out.println(biblioteca.mostrarAutoresDisponibles());
        
    }
}
