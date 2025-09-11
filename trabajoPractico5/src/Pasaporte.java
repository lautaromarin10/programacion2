/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Pasaporte {
     private int numero;
     private String fechaEmision;
     //composicion
     private Foto foto;
     //asociacion bidireccional
     private Titular titular;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

     

    public Pasaporte(int numero, String fechaEmision, String imagen, String formato, String nombre, int dni) {
        setNumero(numero);
        setFechaEmision(fechaEmision);
        //asociamos la foto a la nueva Foto
        this.foto = new Foto(imagen, formato);
        //seteamos el titular y luego hacemos la relación bidreccional.
        this.titular = new Titular(nombre, dni);
        this.titular.setPasaporte(this);
    }
     
   
     
     
    public class Foto {
        private String imagen,formato;

        public void setImagen(String image) {
            this.imagen = imagen;
        }

        public void setFormato(String formato) {
            this.formato = formato;
        }
        
        public String getFormato(){
            return formato;
        }
        
        public String imagen(){
            return imagen;
        }
        
        public Foto(String imagen, String formato) {
            setImagen(imagen);
            setFormato(formato);
        }
    
    }
}


