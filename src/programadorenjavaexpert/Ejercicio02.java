// Hallar la suma de los n numeros naturales.

package programadorenjavaexpert;

public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        // Variables
        int suma, numero = 5;
        
        // Proceso
        suma = (numero * (numero + 1)) / 2;
        
        // Salida
        System.out.println("La suma de los " + numero + " primeros números naturales es: " + suma);
        
    }
    
}
