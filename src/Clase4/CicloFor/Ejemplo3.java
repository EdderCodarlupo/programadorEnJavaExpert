package Clase4.CicloFor;

/**
 *
 * @author Edder
 */

/*
 * Crear un algoritmo para hallar el factorial de un número,
 * el factorial es el producto de todos los números consecutivos
 * desde la unidad hasta el número.
 * Por ejemplo: Factorial de 3! es 1 * 2 * 3 = 6.
 */
public class Ejemplo3 {

    public static void main(String[] args) {

        int numero = 3;
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);

    }

}
