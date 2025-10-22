
package excepciones;
import java.util.Scanner;

public class cadenaANumero {

   
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String stringAConvertir;
        Double numeroConvertido;
        
        try{
            System.out.println("Ingrese el texto a convertir");
            stringAConvertir = input.nextLine();
            numeroConvertido = Double.parseDouble(stringAConvertir);
            System.out.println("Texto convertido a numero con exito");
        } catch(NumberFormatException error){
            throw new NumberFormatException("No es posible convertir el String a numero");
        }
    }
}
