package paqueteTarea6;

//     Esta clase representa un carro de la compra de una web en el que se aplican descuentos a productos

public class Tarea6EdClase {
    
    private static final double Dto_20 = 0.8;
        private static final double Dto_5 = 0.95;
        
 /*    Este método aplica productos segun el numero de productos que se vayan a adquirir       

       @param precioProducto         El precio del producto.
       @param numProductos          La cantidad de productos.            */
 
    public void aplicarDescuento(double precioProducto, int numProductos) {

        precioProducto = Mas_De_3_Productos(numProductos, precioProducto);
        Dto_20_Por_Ciento(numProductos, precioProducto);

    }
    
    /*   Aplica un descuento del 20% si hay productos, de lo contrario aplica un descuento del 5%.
     
     @param numProductos            La cantidad de productos.
     @param precioProducto           El precio del producto.                     */


    private void Dto_20_Por_Ciento(int numProductos, double precioProducto) {
        
        double Total;
        if (numProductos != 0) {
            Total = precioProducto * Dto_20;
            System.out.println("El total a pagar es:" + Total);
            System.out.println("Enviado");
        } else {
            Dto_5_Por_Ciento(precioProducto);
        }
        
    }
    
    /*   Aplica un descuento del 5% al precio del producto.
     
     @param precioProducto          El precio del producto.                  */
    
    private void Dto_5_Por_Ciento(double precioProducto) {
        
        double Total;
        Total = precioProducto * Dto_5;
        System.out.println("El total a pagar es:" + Total);
        System.out.println("Enviado");
        
    }
    
     /*  Aplica un descuento de 5 unidades monetarias si la cantidad de productos es mayor a 3.
     
     @param numProductos               La cantidad de productos.
     @param precioProducto              El precio del producto.
     @return El precio del producto después de aplicar el descuento.                */

    private double Mas_De_3_Productos(int numProductos, double precioProducto) {
        
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        return precioProducto;
    }
    
}
