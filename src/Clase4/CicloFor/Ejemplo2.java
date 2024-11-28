package Clase4.CicloFor;

/**
 *
 * @author Edder
 */

// Obtener la suma de los n primeros numeros naturales

public class Ejemplo2 {

    public static void main(String[] args) {
        
        int limite = 5;
        int suma = 0;

        for (int i = 1; i <= limite; i++) {
            suma += i;
        }
        System.out.println("la suma de los " + limite + " primeros numeros naturales es: " + suma);

    }

}
