/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase3;

/**
 *
 * @author Edder
 */
public class Comparacion {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        boolean igual = (a == b); // Comprueba si a es igual a b (igual será false).
        boolean noIgual = (a != b); // Comprueba si a no es igual a b (noIgual será true).
        boolean mayorQue = (a > b); // Comprueba si a es mayor que b (mayorQue será false).
        boolean menorIgual = (a <= b); // Comprueba si a es menor o igual que b (menorIgual será true).
        
        System.out.println(igual);
    }
    
}
