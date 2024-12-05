package Matriz;

import java.util.Scanner;

/**
 * 
 * @author Edder
 */

/*
Ingresa 6 numeros en un arreglo de dos dimensiones matriz de 3*2
y obtenga la suma de los numeros ingresados.
*/
public class Ejemplo02 {

    public static void main(String[] args) {
        int[][] numeros = {
            {5,8,2},
            {1,9,2},
            {4,6,2},
        };

        int suma = 0;
        System.out.println("Su arreglo de 2 dimensiones es: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        // Sumando los valores del arreglo:
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                suma += numeros[i][j];
            }
        }
        System.out.println("La suma de los números ingresados es: " + suma);
    }

}
