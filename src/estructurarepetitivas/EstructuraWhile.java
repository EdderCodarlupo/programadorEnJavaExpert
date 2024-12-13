/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurarepetitivas;

import javax.swing.JOptionPane;

/**
 *
 * @author renejose
 */
public class EstructuraWhile {
    
    
    public static void main(String[] args) {
        // Escribe un programa que pida al usuario números positivos y calcule la suma de estos. El programa debe terminar si se ingresa un número negativo.
        /*
        
        int valorentero =0 ;
         int suma = 0 ;
        do{
            suma += valorentero;
            String valor = JOptionPane.showInputDialog(null,"ingrse datos");
            valorentero= Integer.parseInt(valor);
            
        }
        while(valorentero > 0);
        System.out.println("la sumatoria es : " +suma);
        */
        
//        int i = 0 ;
//        int suma = 0;
//        while(i < 4){
//            suma  = suma  + i ; 
//            i = i + 2 ;
//            suma = i - suma ;  
//        }
//        System.out.println("la suma es : " + suma);

//        for(inicializacion , condicion , decremento o incremento){
//        }
//           int suma = 0;
//           for(int i = 0 ;i < 4 ;i = i + 2 ){
//               suma  = suma  + i ;
//               suma = i - suma ; 
//           } 
            
            
//            for(int i = 0,num = 5 ; i < 11 ; i++ ){
//                int resultado = num * i ;
//                System.out.println(""+ num +" X " + i + " = " + resultado);
//                
//            }
            
            
//            int num = 5;
//            int i = 0;
//            while(i < 11){
//                int resultado = num * i ;
//                System.out.println(""+ num +" X " + i + " = " + resultado);
//                i++;
//            }

//1. Sumar los primeros N números naturales
//Este algoritmo suma los números naturales desde 1 hasta N.
            
        //int  numeroLimite;
//        String valor = JOptionPane.showInputDialog(null,"ingrse datos");
//        int numeroLimite= Integer.parseInt(valor);
//        int suma = 0;
//        for(int i = 1 ; i <= numeroLimite ; i++){
//            suma = suma + i ;
//            
//        }
//        System.out.println("el valor es : "+ suma );

        
//        boolean respuestadeVerificacion = verificarMayordeEdad(25); 
//        
//        if (respuestadeVerificacion) {
//            imprimirMensaje();
//        }
//        else{
//            System.out.println("lo siento no puedes entrar");
//        }

          int edad = 0 ;
          Integer edad2 = 80 ;
          
          String decimal = JOptionPane.showInputDialog(null,"ingresa el promedio de un alumno");
          double promedioDecimal = Double.parseDouble(decimal);
          
          






    }
    
   
    public static boolean verificarMayordeEdad(int edad){
        
        if (edad >= 18) {
            return true;
        }else{
            return false;
        }
    }
    
    
    public static void imprimirMensaje(){
        JOptionPane.showMessageDialog(null,"hola bienvenido a mi discoteca");
    }
    
    
    
    
}
