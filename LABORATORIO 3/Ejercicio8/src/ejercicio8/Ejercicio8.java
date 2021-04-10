package ejercicio8;

//8. Ingresar 10 números por teclado, informar su suma y promedio.
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        int cons = 10;
        double numero, promedio;
        ArrayList<Double> aNumeros = new ArrayList();
        Scanner sc = new Scanner(System.in);
        double acuSuma = 0;

        for (int i = 0; i < cons; i++) {
            System.out.println("Ingrese un número:");
            numero = sc.nextDouble();
            aNumeros.add(numero);
            acuSuma = acuSuma + numero;

        }
        System.out.println("La suma de todos los numeros es: " + acuSuma);
        promedio = acuSuma / cons;
        System.out.println("El promedio es: " + promedio);
        System.out.println("Los números ingresados son: " + aNumeros);

    }

}
