package Ejercicio14;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class EditorVideo {
    
    //dependencia de creación
    
    public void exportar(String formato, Proyecto proyecto){
        
        Render newRender = new Render(formato);
        newRender.setProyecto(proyecto);
        
    }
    
}
