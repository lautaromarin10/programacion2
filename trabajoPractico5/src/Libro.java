/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Libro {
    private String titulo;
    private int isbn;
    private Autor autor; //asociacion 
    private Editorial editorial; //agregacion
    
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    
    public Libro(String titulo, int isbn, Editorial editorial){
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    
}
