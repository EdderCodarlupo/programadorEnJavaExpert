/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuracondicional;

/**
 *
 * @author renejose
 */
public class Ejercicio2 {
    
    
    public static void main(String[] args) {
        
        /*
        int numeroDias = 3;
        
        switch(numeroDias){
            case 1 :
                System.out.println("este es el dia Lunes");
                break;
            case 2 : 
                System.out.println("este es el dia Martes");
                break;
            case 3 : 
                System.out.println("este es el dia Miercoles");
                break;
            case 4 : 
                System.out.println("este es el dia Jueves");
                break;
            case 5 : 
                System.out.println("este es el dia Viernes");
                break;
            case 6 : 
                System.out.println("este es el dia Sabado");
                break;
            case 7 : 
                System.out.println("este es el dia Domingo");   
                break;
        }
         */
        
        
        /*
        Crea un programa que tome dos números y un operador (+, -, *, /) y realice la operación correspondiente.
        
        */
        double numero1= 17.5;
        Double numero3 = 12.69;
        double numero2= 11.8;
        char operador = '/';
        double resultado=0;
        switch(operador){
            case '+':
                resultado = numero1  + numero2;
                break;
            case '-':
                resultado = numero1  - numero2;
                break;
            case '*':
                resultado = numero1  * numero2;
                break;
            case '/':
                resultado = numero1  / numero2;  
                break;
        }
        
        System.out.println("el resultado es : " + resultado);
        
    }
    
    
}
