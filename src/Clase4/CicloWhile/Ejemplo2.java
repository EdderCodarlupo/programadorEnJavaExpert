package Clase4.CicloWhile;

/**
 *
 * @author Edder
 */

// Obtener la suma de los n primeros numeros naturales
public class Ejemplo2 {

    public static void main(String[] args) {

        int limite = 5; 
        int valorInicial = 1;
        int suma = 0;

        while (valorInicial <= limite) {
            suma = suma + valorInicial;
            valorInicial++;
        }
        System.out.println("La suma de los " +limite+ " primeros numeros naturales es: " + suma);
    }

}
