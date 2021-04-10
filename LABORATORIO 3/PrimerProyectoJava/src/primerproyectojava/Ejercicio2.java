
package primerproyectojava;
import java.util.Scanner;

public class Ejercicio2 {
    //2. Hacer un programa que ingrese el precio de un artículo a la 
    //venta y calcule el precio con IVA.
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in); 
        
        double precio;
        precio = 100;
        
        double calculoIVA;
        calculoIVA = precio * 1.21 ;
        
        System.out.println("El calculo con el IVA es: "+calculoIVA);
    }
    
}
