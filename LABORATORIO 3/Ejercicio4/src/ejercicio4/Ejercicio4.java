package ejercicio4;

//4. Ingresar nombre y altura de dos personas, 
import java.util.Scanner;

//informar el nombre de la más alta.
public class Ejercicio4 {

    public static void main(String[] args) {
        String nombre1;
        String nombre2;
        double altura1;
        double altura2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre y "
                + "luego la altura de la primer persona: ");
        nombre1 = sc.next();
        altura1 = sc.nextDouble();
        System.out.println("\nIngrese el nombre y "
                + "luego la altura de la segunda persona: ");
        nombre2 = sc.next();
        altura2 = sc.nextDouble();

        if (altura1 > altura2) {
            System.out.println(nombre1 + " es la persona más alta");
        } else {
            System.out.println(nombre2 + " es la persona más alta");
        }
    }

}
