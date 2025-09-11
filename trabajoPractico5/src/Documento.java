/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lautaromarin
 */
public class Documento {
    private String titulo, contenido;
    private UsuarioDocumento usuario; //agregación
    private Firma firma; //composición

    public Documento(String titulo, String contenido, String codigoHash, String fecha, UsuarioDocumento usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.usuario = usuario;
        this.firma = new Firma(codigoHash, fecha);
    }
    
    public class Firma{
        private String codigoHash, fecha;
        
        public Firma(String codigoHash, String fecha){
            this.codigoHash = codigoHash;
            this.fecha = fecha;
        }
        
    }
    
    
}
