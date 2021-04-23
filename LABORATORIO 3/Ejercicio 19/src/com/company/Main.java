package com.company;

import java.util.Scanner;

/*
19.Dado el valor de los tres lados de un triángulo se necesita calcular su perímetro.
Se pide crear en el método main() un objeto y determinar si el perímetro es
superior a 10. Determinar la o las clases necesarias, sus atributos y métodos.
 */
public class Main {

    public static void main(String[] args) {

        Triangulo tri = new Triangulo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado 1 del traingulo: ");
        double lado1 = sc.nextDouble();
        tri.setLado1(lado1);

        System.out.println("Ingrese el lado 2 del traingulo: ");
        double lado2 = sc.nextDouble();
        tri.setLado2(lado2);

        System.out.println("Ingrese el lado 3 del traingulo: ");
        double lado3 = sc.nextDouble();
        tri.setLado3(lado3);

        if (tri.perimetroTriangulo() > 10) {
            System.out.println("El perímetro es mayor a 10 y es: " + tri.perimetroTriangulo());
        }
        else System.out.println("El perímetro es menor a 10.");


    }
}
