
package excepciones;
import java.util.Scanner;

public class divisionSegura {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        double numero1;
        double numero2;
        double resultado;
        
        System.out.println("Ingrese el primer numero a dividir\n");
        numero1 = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el divisor\n");
        numero2 = Double.parseDouble(input.nextLine());
        
        if(numero2 == 0){
            throw new ArithmeticException("No se puede dividir por 0");
        }
    
        resultado = numero1 / numero2;
        System.out.println("Resultado: " + resultado);
        
    }
}
