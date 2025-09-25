/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InventarioProducto;
import java.util.ArrayList;
/**
 *
 * @author lautaromarin
 */
public class Inventario {

    ArrayList<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto p){
        productos.add(p);
        System.out.println("Producto agregado con exito");
    }
    
    public void listarProductos(){
        for(Producto producto: productos){
            System.out.println("--------------------");
            System.out.println("Producto ID: " + producto.id + "\nNombre: " + producto.nombre + "\nCategoria: " + producto.categoria + "\nPrecio: $" + producto.precio + "\ncantidad: " + producto.cantidad);
        }
    }
    
    public Producto buscarProductoPorID(String id){
        for(Producto producto: productos){
            if(producto.id.equals(id)){
               return producto;
            }
        }
        return null;
    }

    
    public void eliminarProducto(String id){
       
        Producto producto = buscarProductoPorID(id);
        
        if(producto == null){
            System.out.println("El producto a eliminar no existe");
            return;
        }
        
        productos.remove(producto);
        System.out.println("El producto eliminado con exito");
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
          Producto producto = buscarProductoPorID(id);
        
        if(producto == null){
            System.out.println("El producto no existe");
            return;
        }
        
        //lo modificamos directamente
        producto.cantidad = nuevaCantidad;
        
        System.out.println("Actualizada la cantidad del producto");
        
    }
    
    public ArrayList<Producto> filtrarPorCategoria(Producto.CategoriaProducto categoria){
        
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        
        for(Producto producto: productos){
            if(producto.categoria.equals(categoria)){
                productosFiltrados.add(producto);
            }
        }
        
        return productosFiltrados;
    }
    
    public int obtenerTotalStock(){
       
        int stockActual = 0;
        
        for(Producto producto: productos){
            stockActual += producto.cantidad;
        }
        
        return stockActual;
    }
    
    public Producto obtenerProductoConMayorStock(){
        
        if(productos.isEmpty()){
            return null;
        }
        
        Producto productoConMasStock = productos.get(0);
        
        for(Producto producto: productos){
            if(productoConMasStock.cantidad < producto.cantidad){
                productoConMasStock = producto;
            }
        }
        
        return productoConMasStock;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        
        ArrayList<Producto> listaDeProductos = new ArrayList<>();
        
        for(Producto producto: productos){
            if(producto.precio >= min && producto.precio <= max){
                listaDeProductos.add(producto);
            }
        }
        
        return listaDeProductos;
        
    }
    
   public void mostrarCategoriasDisponibles() {
    ArrayList<Producto.CategoriaProducto> categoriasActual = new ArrayList<>();

    for (Producto.CategoriaProducto categoria : Producto.CategoriaProducto.values()) {
        if (!filtrarPorCategoria(categoria).isEmpty()) {
            categoriasActual.add(categoria);
        }
    }

    System.out.println("Categorías disponibles:");
    for (Producto.CategoriaProducto categoria : categoriasActual) {
        System.out.println("- " + categoria + " Descripcion: " + categoria.getDescripcion());
    }
    }

    
}
