package trabajopractico7;
import Figura.Circulo;
import Figura.Rectangulo;
import Figura.Figura;
import java.util.ArrayList;

public class Figuras {

    public static void main(String args[]) {
        
        ArrayList<Figura> listaDeFiguras = new ArrayList<>();
        
        Circulo circulo1 = new Circulo("Circulo lindo", 10);
        Rectangulo rectangulo1 = new Rectangulo("Rectangulo rojo", 10, 4);
        Circulo circulo2 = new Circulo("Circulo chico", 2);
        
        listaDeFiguras.add(circulo1);
        listaDeFiguras.add(circulo2);
        listaDeFiguras.add(rectangulo1);
        
        for(Figura figura: listaDeFiguras){
            System.out.println(figura.calcularArea());
        }
        
        
    }
}
