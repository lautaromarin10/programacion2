/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Render {
    public String formato;
    private Proyecto proyecto; //asociacion
    
    public void setProyecto(Proyecto proyecto){
        this.proyecto = proyecto;
    }

    public Render(String formato) {
        this.formato = formato;
    }
    
    
    
}
