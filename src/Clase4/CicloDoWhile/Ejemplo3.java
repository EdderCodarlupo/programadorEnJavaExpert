package Clase4.CicloDoWhile;

import java.util.Scanner;

/**
 *
 * @author Edder
 */

// Menú simple interactivo
public class Ejemplo3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la Opcion 1");
                    break;
                case 2:
                    System.out.println("Has elegido la Opcion 2");
                    break;
                case 3:
                    System.out.println("Has elegido la Opcion 3");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }
        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }

}
