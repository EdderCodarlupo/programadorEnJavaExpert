package Arreglos_Unidimensionales;

/**
 *
 * @author Edder
 */
public class Ejemplo01 {

    public static void main(String[] args) {
 
        int[] numeros = new int[5];
        
        numeros[0] = 7;
        numeros[1] = 9;
        numeros[2] = 4;
        numeros[3] = 80;
        numeros[4] = 12;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);            
        }
       
    }
}
