package com.company;
/*
19.Dado el valor de los tres lados de un triángulo se necesita calcular su perímetro.
Se pide crear en el método main() un objeto y determinar si el perímetro es
superior a 10. Determinar la o las clases necesarias, sus atributos y métodos.
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double perimetroTriangulo(){
        double perimetro = getLado1()+getLado2()+getLado3();
        return perimetro;
    }


}
