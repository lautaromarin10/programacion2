/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class CuentaBancaria {
    private int cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; //composición
    private CuentaTitular titular; //bidireccional

    public CuentaBancaria(int cbu, double saldo, int codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }
    
    public void setCuentaTitular(CuentaTitular titular){
        this.titular = titular;
        if(titular != null && titular.getCuentaBancaria() != this){
            titular.setCuentaBancaria(this);
        }
        
    }
    
    public CuentaTitular getTitular(){
        return titular;
    }
    
    public class ClaveSeguridad{
        private int codigo;
        private String ultimaModificacion;

        public ClaveSeguridad(int codigo, String ultimaModificacion) {
            this.codigo = codigo;
            this.ultimaModificacion = ultimaModificacion;
        }
    
    }
    
}
