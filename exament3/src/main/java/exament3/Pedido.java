package exament3;
import java.util.ArrayList;
import java.util.List;
/**
 * La clase Pedido representa un array list de objetos "Producto".
 */
public class Pedido {
    /**
          * Parametros del objeto Pedido
          * @param productos Lista de Productos: ArrayList que almacena los pedidos de un producto.
         */
    private List<Producto> productos;
    

 /**
          * Constructor de Pedido.
          * Dentro genera el Array list de productos.
         */

    public Pedido() {
        productos = new ArrayList<>();
    }


 /**
          * Método agregarProducto.
          *  @param producto Agrega un producto a la lista
         */

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }



    /**
          * Método calcularTotal()
          *  @return Devuelve el importe de todos los productos
         */
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getTotal();
        }
        return total;
    }
}
