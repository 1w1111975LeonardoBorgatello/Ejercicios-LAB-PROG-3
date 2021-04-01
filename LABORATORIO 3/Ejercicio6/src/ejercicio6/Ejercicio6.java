
package ejercicio6;
//6. Ingresar un año e indicar si ese año es bisiesto. 
//Un año es bisiesto si es múltiplo de 4 y no es múltiplo de 100 o si es múltiplo de 400.

import java.util.Scanner;


public class Ejercicio6 {


    public static void main(String[] args) {
        
        int año;
        double resto1;
        double resto2;
        double resto3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        año = sc.nextInt();
        resto1 = año%4;
        resto2 = año%100;
        resto3 = año%400;        
        
        if (resto1 == 0 && resto2!=0){
            System.out.println("El año es bisiesto");
        }
        else
            if(resto3 == 0){
                System.out.println("El año es bisiesto");
            }
            else {
                System.out.println("El año no es bisiesto");
            }
    }
    
}
