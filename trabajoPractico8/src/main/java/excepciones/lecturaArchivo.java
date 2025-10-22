
package excepciones;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
/**
 *
 * @author lautaromarin
 */
public class lecturaArchivo {

    
    public static void main(String args[]) throws FileNotFoundException {
        
        String rutaArchivo = "/archivo.txt";
        
        try{
            BufferedReader buffer = new BufferedReader(new FileReader(rutaArchivo));
        } catch (FileNotFoundException ex){
            throw new FileNotFoundException("El archivo no estaba en la ruta indicada");
        }
        
    }
}
