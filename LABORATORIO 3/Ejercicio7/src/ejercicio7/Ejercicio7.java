package ejercicio7;

import java.util.Scanner;
//7. Una empresa de alquiler de autos cobra $300 por día si no se superan 
//los 200 km de uso diario. Por cada km extra hasta los 1000 km cobra $5 
//adicionales, y a partir de los 1000 cobra $10 adicionales. 
//Hacer un programa que solicite la cantidad de km realizados por un cliente 
//e indique el importe que se le debe cobrar.

public class Ejercicio7 {

    public static void main(String[] args) {

        double cantKm;
        double importe;
        int dias;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Km realizados: ");
        cantKm = sc.nextDouble();
        System.out.println("Ingrese los días de alquiler: ");
        dias = sc.nextInt();
        double precioXdia = 300;
        double precioXkm;
        importe = dias * precioXdia;

        if (cantKm <= 200) {

            System.out.println("El importe es: " + importe);
        } else if (cantKm <= 1000) {
            cantKm = (cantKm - 200) * 5;
            System.out.println("El importe es: " + (importe + cantKm));

        } else {
            double cantAnterior = 4000;
            cantKm = ((cantKm - 1000) * 10) + cantAnterior;
            System.out.println("El importe es: " + (importe + cantKm));

        }

    }

}
