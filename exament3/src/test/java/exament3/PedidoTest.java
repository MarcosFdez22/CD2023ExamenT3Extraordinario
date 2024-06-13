package exament3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class PedidoTest {
    @Test
    public void testSetterCalificacion(){
         Pedido p1 = new Pedido();
         Producto pro1 = new Producto("Karol",2.0,5);
         p1.agregarProducto(pro1);
         assertNotEquals(22.2,p1.calcularTotal());
         assertEquals(10,p1.calcularTotal(),10);

         Pedido p2 = new Pedido();
         Producto pro2 = new Producto("Karol",1,1);
         p2.agregarProducto(pro2);
         assertNotEquals(2,p2.calcularTotal());
         assertEquals(1,p2.calcularTotal(),1);
    }

  
}