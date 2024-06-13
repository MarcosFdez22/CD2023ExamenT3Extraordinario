package exament3;

/**
 * La clase Producto representa un nombre, precio y cantidad de un producto.
 */
public class Producto {
/**
          * Parametros del objeto Producto
          * @param nombre Representa el nombre del producto
          * @param precio Representa el precio del producto
          * @param cantidad Representa la cantidad del producto
         */
    
    private String nombre;
    private double precio;
    private int cantidad;




    /**
          * Constructor de Producto.
          * @param nombre Representa el nombre del producto
          * @param precio Representa el precio del producto
          * @param cantidad Representa la cantidad del producto.
         */
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }



    
    /**
          * Método getNombre()
          *  @return Devuelve el nombre del producto
         */
    public String getNombre() {
        return nombre;
    }
/**
          * Método getPrecio()
          *  @return Devuelve el precio del producto
         */
    public double getPrecio() {
        return precio;
    }
/**
          * Método getCantidad()
          *  @return Devuelve la cantidad del producto
         */
    public int getCantidad() {
        return cantidad;
    }
/**
          * Método getTotal()
          *  @return Devuelve el total de gasto del producto
         */
    public double getTotal() {
        return precio * cantidad;
    }
/**
 * Método toString
  * {@inheritDoc} 
  */
    @Override
    public String toString() {
        return nombre + " - " + cantidad + " x " + precio + " = " + getTotal();
    }
}