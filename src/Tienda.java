import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Cuaderno", 4.22, 4));
        productos.add(new Producto("Libro", 1.83, 5));
        productos.add(new Producto("Lapiz", 0.5, 20));
        productos.add(new Producto("Borrador", 2.45, 2));

        // Muestra todos los productos
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }

        // Modifica el precio de un producto
        System.out.println("Precio del producto modificado:");
        for(Producto producto : productos) {
            if (producto.getNombre().equals("Libro")) {
                producto.setPrecio(4);
                System.out.println(producto.toString());

            }
        }

        // Modifica la cantidad del producto
        System.out.println("Cantidad del producto modificado:");
        for(Producto producto : productos) {
            if (producto.getNombre().equals("Borrador")) {
                producto.setCantidad(40);
                System.out.println(producto.toString());

            }
        }

        // Eliminar un producto
        System.out.println("Eliminar un producto y se muestra los productos restantes: ");
        productos.remove(2);
        for(Producto producto : productos) {
            System.out.println(producto.toString());
        }

        // Calcular el valor total del inventario
        System.out.println("Valor total del inventario: ");
        double total = 0;
        for(Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        System.out.println("Inventario: " + total);
    }
}
