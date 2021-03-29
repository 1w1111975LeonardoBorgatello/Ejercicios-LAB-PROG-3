/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyectojava;

/**
 *
 * @author Cuis
 */
public class PrimerProyectoJava {  

    

    public static void main(String[] args) {
        // Crear el famoso "Hola Mundo"
        String mensaje;
        mensaje = "Hola Mundo";
        
        //1. Declarar dos variables enteras y cargar sus valores por teclado.
        // Informar su suma, diferencia, producto y cociente.
        int a = 5;
        int b = 6;
        
        int suma;
        int resta;
        int producto;
        double cociente;
        
        suma = b + a;
        resta = a - b;
        producto = a * b;
        cociente = (double)(b / a);
        
        System.out.println(mensaje);
        System.out.println("La suma de los numeros es: " + suma
                            + "\nLa resta de los numeros es "+ resta);
        System.out.println("La multiplicación de los numeros es "+ producto);
        System.out.println("La división de los numeros es: "+ cociente);
    }
    
}

