
package primerproyectojava;

import java.util.Scanner;


public class Ejercicio2conScanner {
    
        public static void main(String[] args){
        
            Scanner lector = new Scanner(System.in); 
            double precio;
            double IVA = 1.21;
        
            System.out.println("Ingrese el precio del articulo: ");
            precio = lector.nextDouble();
            System.out.println("El precio con IVA es: "+(IVA * precio));
        
        
    
    }
    
}
