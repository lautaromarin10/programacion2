package trabajopractico6;

import InventarioProducto.Producto;
import InventarioProducto.Inventario;

/**
 *
 * @author lautaromarin
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Inventario inventario = new Inventario();
        
        //1 - creamos los productos y los añadimos
        inventario.agregarProducto(new Producto("pizzaDeluxe", "Pizza Deluxe", 15000, 100, Producto.CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("iPhone17R", "iPhone 17 Rojo", 1000000, 20, Producto.CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("camperaCueroN", "Campera de Cuero Negra", 100000, 40, Producto.CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("airFrier13", "Air Frier de capacidad de 13l", 80000, 17, Producto.CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("papasFritas", "Papas Fritas grandes", 3500, 200, Producto.CategoriaProducto.ALIMENTOS));
        
        //2 - listamos los productos
        inventario.listarProductos();
        
        //3 - busco un producto por ID y muestro su información
        System.out.println(inventario.buscarProductoPorID("pizzaDeluxe"));
        
        //4 - filtrar y mostrar productos que pertenecen a una categoria especifica
        System.out.println(inventario.filtrarPorCategoria(Producto.CategoriaProducto.ALIMENTOS));
        
        //5 - eliminar un producto por su ID y listar los productos restantes
        inventario.eliminarProducto("airFrier13");
        inventario.listarProductos();
        
        //6 - actualizar el stock de un producto existente
        inventario.actualizarStock("pizzaDeluxe", 5);
        
        //7 - Mostrar el total de stock disponbile
        System.out.println("El total de stock es: " + inventario.obtenerTotalStock());
        
        //8 - Obtener y mostrar el producto con mayor stock
        System.out.println("El producto con mayor stock es: " + inventario.obtenerProductoConMayorStock().nombre);
        
        //9 - Filtrar productos con precios entre $1000 y $3000
        System.out.println(inventario.filtrarProductosPorPrecio(1000, 3000)); //no hay nada
        
        //10 - Mostrar las categorias disponibles con sus descripciones
        inventario.mostrarCategoriasDisponibles();
        
    }
}
