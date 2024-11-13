/*
 * Dado el valor de venta de un producto.
 * Hallar el igv(18%) y el precio de venta.
 */
package programadorenjavaexpert;

public class Ejercicio03 {
    
    public static void main(String[] args) {
        
        // Variables
        
        double valorVenta, igv, precioVenta;
        valorVenta = 100;
        
        // Proceso
        igv = valorVenta * 0.18;
        precioVenta = valorVenta + igv;
        
        // Salida
        System.out.println("El igv es: " +igv);
        System.out.println("El precio de venta es: " +precioVenta);
        
    }
    
}
