package Clase4.CondicionalSwitch;

/**
 *
 * @author Edder
 */
public class Ejemplo3 {
    
    public static void main(String[] args) {
        
        String fruta = "manzana";
        
        switch (fruta) {
            case "naranja":
                System.out.println("La fruta es una naranja");
                break;
            case "manzana":
                System.out.println("La fruta es una manzana");
                break;
            case "plátano":
                System.out.println("La fruta es un plátano");
                break;
            default:
                System.out.println("Fruta no reconocida");
        }
    }
    
}
