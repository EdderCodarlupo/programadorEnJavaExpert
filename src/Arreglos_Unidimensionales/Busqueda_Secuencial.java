package Arreglos_Unidimensionales;

/**
 *
 * @author Edder
 */
public class Busqueda_Secuencial {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        numeros[0] = 7;
        numeros[1] = 9;
        numeros[2] = 4;
        numeros[3] = 80;
        numeros[4] = 12;

        boolean encontrado = false;
        
        for (int i = 0; i<numeros.length; i++) {
            if (numeros[i] == 4) {
                encontrado = true;
                break; 
            }
        }

        if (encontrado) {
            System.out.println("Se encontró el valor.");
        } else {
            System.out.println("No se encontró el valor.");
        }
       
    }

}
