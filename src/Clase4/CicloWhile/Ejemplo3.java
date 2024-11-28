package Clase4.CicloWhile;

import javax.swing.JOptionPane;

/**
 *
 * @author Edder
*/

// Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
public class Ejemplo3 {
    
    public static void main(String[] args) {
        
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

    while (numero != 0) {
      if (numero > 0) {
        System.out.println("El numero ingresado es POSITIVO");
      } else {
        System.out.println("El numero ingresado es NEGATIVO");
      }
      numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
    }
    System.out.println("Fin del programa");
    }
    
}
