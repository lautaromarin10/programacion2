/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InventarioProducto;

/**
 *
 * @author lautaromarin
 */
public class Producto {
    
    public String id;
    public String nombre;
    public double precio;
    public int cantidad;
    CategoriaProducto categoria;
    
    public enum CategoriaProducto{
        ALIMENTOS("Productos comestibles"),
        ELECTRONICA("Dispositvios electronicos"),
        ROPA("Prendas de vestir"),
        HOGAR("Artículos para el hogar");
        
        private final String descripcion;
        
        CategoriaProducto(String descripcion){
            this.descripcion = descripcion;
        }
        
        public String getDescripcion(){
            return descripcion;
        }
    }

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
    return "Producto {" +
           "ID='" + id + '\'' +
           ", Nombre='" + nombre + '\'' +
           ", Categoría=" + categoria + " (" + categoria.getDescripcion() + ")" +
           ", Precio=$" + precio +
           ", Cantidad=" + cantidad +
           '}';
    }
    
    
}
