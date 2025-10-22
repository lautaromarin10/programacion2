/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package excepciones;
import java.util.Scanner;
/**
 *
 * @author lautaromarin
 */
public class usoEdadInvalida {


    public static void main(String args[]) {
      
        Scanner input = new Scanner(System.in);
        int edad;
        
        try{
           System.out.println("Ingrese tu edad");
           edad = Integer.parseInt(input.nextLine());
            
           if(edad < 0 || edad > 120){
               throw new EdadInvalidaException();
           }
           
           System.out.println("Edad exitosa");
            
        } catch(EdadInvalidaException e){
           throw new EdadInvalidaException("La edad no puede ser negativa");
        }
        
        
    }
}
