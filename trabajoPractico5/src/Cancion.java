/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Cancion {
    private String titulo;
    private Artista artista; //unidireccional
    
    
    public void setArtista(Artista artista){
        this.artista = artista;
    }

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    
    
    
}
