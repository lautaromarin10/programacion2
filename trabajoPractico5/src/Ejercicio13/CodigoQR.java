package Ejercicio13;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class CodigoQR {
    private String valor;
    private UsuarioQR usuario; //asociacion
    
    public void setUsuario(UsuarioQR usuario){
        this.usuario = usuario;
    }

    public CodigoQR(String valor) {
        this.valor = valor;
    }
    
    
    
    
}
