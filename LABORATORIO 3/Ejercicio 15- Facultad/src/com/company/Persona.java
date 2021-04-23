package com.company;

import static java.lang.Math.pow;

/*
15.Agregar a la clase persona un método que retorne su índice de masa corporal.
Este último dato se calcula como:
IMC = peso / altura2
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double altura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double calculoIMC(){
        double  IMC = 0;
        return IMC = getPeso()/pow(getAltura(),2);
    }

    @Override
    public String toString(){
        return  "Nombre: " + getNombre() + ", Apellido: "+ getApellido() + ", Edad: "+ getEdad();

    }
}
