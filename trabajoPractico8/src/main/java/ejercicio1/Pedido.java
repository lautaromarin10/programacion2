/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;
import ejercicio1.Pagable;
import ejercicio1.Producto;
import ejercicio1.Notificable;
import java.util.ArrayList;

/**
 *
 * @author lautaromarin
 */
public class Pedido implements Pagable, Notificable {
    
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public void agregarProductoALaLista(Producto producto){
        System.out.println("Añadiendo el producto " + producto.nombre + " a la lista" );
        listaProductos.add(producto);
    }
    
    @Override
    public double calcularTotal(){
        double totalPrecio = 0;
        
        for(Producto producto: listaProductos){
            totalPrecio = totalPrecio + producto.calcularTotal();
        }
        
        return totalPrecio;
        
    }
    
    
    
}
