package trabajopractico7;
import Animales.Animal;
import Animales.Gato;
import Animales.Perro;
import Animales.Vaca;
import java.util.ArrayList;

public class Animales {


    public static void main(String args[]) {
       
            
        Gato adolfina = new Gato("Adolfina", 6);
        Perro luz = new Perro("Luz", "Golden", 13);
        Vaca lola = new Vaca("Lola", "Blanca");
        
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        
        listaAnimales.add(adolfina);
        listaAnimales.add(luz);
        listaAnimales.add(lola);
        
        for(Animal animal: listaAnimales){
            animal.hacerSonido();
        }
        
    }
}
