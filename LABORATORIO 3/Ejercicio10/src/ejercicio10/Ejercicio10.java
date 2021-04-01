
package ejercicio10;

import java.util.Scanner;
//10. Ingresar un número y validar que sea positivo.
//Si no lo es continuar solicitándolo al usuario hasta que ingrese un número correcto.
public class Ejercicio10 {

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        numero = sc.nextInt();
        
        while (numero < 0 ){
            System.out.println("El número debe ser positivo, ingrese un número:");
            numero = sc.nextInt();
        }
        System.out.println("El número ingresado es positivo y es: " + numero);
      
        
    }
    
}
