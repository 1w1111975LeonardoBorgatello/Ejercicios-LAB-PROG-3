
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
//3. Hacer un programa que ingrese los datos de una factura en la cual 
    //haya tres artículos vendidos. De cada artículo ingresar el precio
    //unitario y la cantidad. Finalmente imprimir el total de la factura
    public static void main(String[] args) {
        String nombre1;
        String nombre2;
        String nombre3;
        double art1;
        double art2;
        double art3;
        int cant1;
        int cant2;
        int cant3;  
        String factura;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del primer articulo; ");
        nombre1 = sc.next();
        System.out.println("Ingrese el precio: ");
        art1 = sc.nextDouble();
        System.out.println("Ingrese la cantidad: ");
        cant1 = sc.nextInt();
        System.out.println("Ingrese el nombre del segundo articulo; ");
        nombre2 = sc.next();
        System.out.println("Ingrese el precio: ");
        art2 = sc.nextDouble();
        System.out.println("Ingrese la cantidad: ");
        cant2 = sc.nextInt();
        System.out.println("Ingrese el nombre del tercer articulo; ");
        nombre3 = sc.next();
        System.out.println("Ingrese el precio: ");
        art3 = sc.nextDouble();
        System.out.println("Ingrese la cantidad: ");
        cant3 = sc.nextInt();
        
        factura = nombre1.toUpperCase() + ", Precio: " + art1 + " Cantidad: " + cant1
                + "\n" + nombre2.toUpperCase() + ", Precio: " + art2 + " Cantidad: " + cant2
                + "\n" + nombre3.toUpperCase() + ", Precio: " + art3 + " Cantidad:" + cant3;
        
        System.out.println("\nFactura: \n"+factura);
        
        
    }
    
}
