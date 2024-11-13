/*
 * A una reunion asistieron n personas.
 * ¿Cuantos apretones de mano hubieron?
*/
package programadorenjavaexpert;

public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        //Variables
        int numeroPersonas = 5; 
        int totalApretonesMano;
        
        //Proceso
        totalApretonesMano = numeroPersonas * (numeroPersonas - 1 ) / 2;
        
        //Salida
        System.out.println(totalApretonesMano);
        
    }
    
}
