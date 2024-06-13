package exament3;

public class App 
{
    public static void main( String[] args )
    {
        Pedido p1 = new Pedido();

        Producto pro1 = new Producto("Pelota",10.0,2);
        Producto pro2 = new Producto("Guantes",5.0,10);
        p1.agregarProducto(pro1);
        p1.agregarProducto(pro2);

        System.out.println("El total de todos los productos del pedido es: " + p1.calcularTotal()+"€");
    }
}
