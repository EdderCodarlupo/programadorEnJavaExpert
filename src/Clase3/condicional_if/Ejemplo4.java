/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase3.condicional_if;

/**
 *
 * @author Edder
 */
public class Ejemplo4 {

    public static void main(String[] args) {

        int edad = 90;

        if (edad > 0 && edad <= 18) {
            System.out.println("El menor de edad");
        } else if (edad < 100) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Ingrese una edad correcta");
        }
    }

}
