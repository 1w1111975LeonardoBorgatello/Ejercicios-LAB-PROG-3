package ejercicio14;

import java.util.Scanner;

public class Punto {

    private float x;
    private float y;

    public double getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float CalculoDistancia(float A, float B, float C, float D) {

        float difX = A - B;
        float difY = C - D;
        float dist = (float) Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
        return dist;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la coordenada x del punto  1");
        float x1 = sc.nextFloat();
        System.out.println("Ingrese la coordenada y del punto  1");
        float y1 = sc.nextFloat();

        System.out.println("Ingrese la coordenada x del punto  2");
        float x2 = sc.nextFloat();
        System.out.println("Ingrese la coordenada y del punto  2");
        float y2 = sc.nextFloat();
        Punto p = new Punto();
        Punto p1 = new Punto();
        Punto p2 = new Punto();

        p1.setX(x1);
        p1.setY(y1);
        p2.setX(x2);
        p2.setY(y2);

        System.out.println("La distancia entre los puntos es: "
                + p.CalculoDistancia(x1, y1, x1, y2));

    }

}
