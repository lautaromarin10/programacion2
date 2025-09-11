/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Celular {
    
    private String imei, marca, modelo;
    private Bateria bateria; //agregación 1 a 1
    private Usuario usuario; //asociacion bidireccional

    public void setImei(String imei) {
        if(imei == null){
            this.imei = imei;
        }
    }

    public void setMarca(String marca) {
        if(marca == null){
            this.marca = marca;
        }
    }

    public void setModelo(String modelo) {
        if(modelo == null){
             this.modelo = modelo;
        }
    }
    
    public void setBateria(Bateria bateria){
        this.bateria = bateria;
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        
        if(usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }
    
    
    public Celular(String imei, String marca, String modelo, Bateria bateria){
        setImei(imei);
        setMarca(marca);
        setModelo(modelo);
        setBateria(bateria);
    }
    
}
