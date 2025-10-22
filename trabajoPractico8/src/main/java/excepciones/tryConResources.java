/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class tryConResources {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {

        File archivo = new File("./archivo.txt");
        
        try(BufferedReader buffer = new BufferedReader(new FileReader(archivo));){
        System.out.println("Archivo leido con exito");
        } catch (IOException e){
         throw new IOException("Error al leer el archivo", e);
        }

    }
}
