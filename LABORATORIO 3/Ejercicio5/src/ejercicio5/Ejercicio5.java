
package ejercicio5;



import java.util.Scanner;
//5. Ingresar la cantidad de horas trabajadas por un empleado y 
//el sueldo que cobra por hora. Indique el total a cobrar teniendo en
//cuenta que si trabajó más de 180 horas las excedentes 
//las cobra con un 50 % de aumento.
public class Ejercicio5 {

    public static void main(String[] args) {
        double horas;
        double sueldoXhora;
        double total;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        horas = sc.nextDouble();
        System.out.println("\nIngrese el sueldo por hora");
        sueldoXhora = sc.nextDouble();
        
                     
        if (horas > 180){
            double hasta180 = 180 * sueldoXhora;
            horas = horas - 180;
            sueldoXhora = sueldoXhora * 1.50;
            total = horas * sueldoXhora;
            
            System.out.println("El sueldo de las horas extras es: "+ total);
            System.out.println("El sueldo completo es: "+ (total + hasta180));
        }
        else {
            total = horas * sueldoXhora;
            System.out.println("El sueldo completo es: "+total);
        };
        
        
    }
    
}
