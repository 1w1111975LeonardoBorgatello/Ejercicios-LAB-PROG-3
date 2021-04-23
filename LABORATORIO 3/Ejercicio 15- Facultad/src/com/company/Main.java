package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a verificar:");
        int cantidadPersonas = sc.nextInt();
        Persona p1 = new Persona();
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese el nombre de la persona: ");
            String name1 = sc.next();
            p1.setNombre(name1);

            System.out.println("Ingrese el apellido de la persona: ");
            String lastName1 = sc.next();
            p1.setApellido(lastName1);

            System.out.println("Ingrese la edad de la persona: ");
            int age1 = sc.nextInt();
            p1.setEdad(age1);

            System.out.println(p1.toString());
        }

        System.out.println("Ingrese el peso: ");
        double peso = sc.nextDouble();
        p1.setPeso(peso);
        System.out.println("Ingrese la altura en mts: ");
        double altura = sc.nextDouble();
        p1.setAltura(altura);
        System.out.println("El IMC es: " + p1.calculoIMC());
    }
}
