package Clase4.CicloDoWhile;

import java.util.Scanner;

/**
 *
 * @author Edder
 */
// Sumar números hasta que el usuario ingrese un cero
public class Ejemplo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese un numero (0 para salir): ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);
                
        System.out.println("La suma total de los numeros ingresados es: " + suma);
    }

}
