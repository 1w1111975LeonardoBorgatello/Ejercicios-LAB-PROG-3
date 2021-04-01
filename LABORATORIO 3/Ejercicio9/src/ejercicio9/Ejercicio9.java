
package ejercicio9;


import java.util.Scanner;
//9. Ingresar un número n y a continuación n números positivos. 
//Informar la cantidad de mayores a 5 que se hayan ingresado.
public class Ejercicio9 {

    public static void main(String[] args) {
        double numero;
        int cant;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que va consultar: ");
        cant = sc.nextInt();
        
        for (int i = 0; i < cant; i++) {
            
            System.out.println("Ingrese el número a consultar: ");
            numero = sc.nextDouble();
            
            while (numero < 0){
                System.out.println("Ingrese un número positivo, no se aceptan negativos");
                numero = sc.nextDouble();
            }
            if (numero > 5){
                c++;
            }
        }  
        
        System.out.println("La cantidad de número mayores a 5 es: " + c);
        
    }
    
}
