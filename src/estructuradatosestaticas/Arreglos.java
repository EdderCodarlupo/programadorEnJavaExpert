/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradatosestaticas;

/**
 *
 * @author renejose
 */
public class Arreglos {
    
    public static void main(String[] args) {
        int [] arrayenteros = new int[6];
        
//        int[] arrayenteros = {4,5,6,39,8,7,40};
//        arrayenteros[0] = 4;
//        arrayenteros[1] = 6;
//        arrayenteros[2] = 7;
//        arrayenteros[3] = 1;
//        arrayenteros[4] = 9;
//        arrayenteros[5] = 8;
        
        
//        for (int i = 0; i < arrayenteros.length; i++) {
//            System.out.println(""+ arrayenteros[i]);
//        }
        
//        int i = 0;
//        while( i < arrayenteros.length){
//            System.out.println(""+ arrayenteros[i]);
//            i++;
//        }



        int[][] arraybidimensional = new int[2][2];

         arraybidimensional[0][0] = 4;
         arraybidimensional[0][1] = 17;
         arraybidimensional[1][0] = 16;
         arraybidimensional[1][1] = 22;


         for (int i = 0; i < arraybidimensional.length; i++) {
             for (int j = 0; j < arraybidimensional[i].length; j++) {
                 System.out.println("el arreglo con valores : ["+ i +"]["+ j+"] = " + arraybidimensional[i][j]);
             }
        }







    }
    
    
}
