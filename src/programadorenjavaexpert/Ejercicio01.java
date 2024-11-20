/*
 * A una reunion asistieron n personas.
 * ¿Cuantos apretones de mano hubieron?
*/
package programadorenjavaexpert;

public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        final double IGV = 0.18;
        
        //Variables
        int numeroPersonas = 5,totalApretonesMano =0; 
        
        int num = totalApretonesMano + 1 ;
        //Proceso
        //totalApretonesMano = numeroPersonas * (numeroPersonas - 1 ) / 2;
        
        totalApretonesMano = (numeroPersonas + 3 ) ;
        
        //Salida
        System.out.println(totalApretonesMano);
        
        totalApretonesMano = totalApretonesMano / num;
        
        System.out.println(totalApretonesMano);
        
    }
    
}
