
package BibliotecaLibros;

/**
 *
 * @author lautaromarin
 */
public class Autor {
    
    String id;
    String nombre;
    String nacionalidad;
    
    public void mostrarInfo(){
        System.out.println("El Autor tiene ID " + id + " de nombre " + nombre + " y nacionalidad " + nacionalidad);
    
    }

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    
    @Override
    public String toString() {
        return "Autor: " + nombre + " (" + nacionalidad + ")";
    }
    
}
