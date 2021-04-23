package ejercicio.pkg13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Persona {

    private String name;
    private String lastName;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Persona p1 = new Persona();
        List<Persona> arr = new ArrayList();
        Iterator iter = arr.iterator();

        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese el nombre de la persona: ");
            String name1 = sc.next();
            p1.setName(name1);

            System.out.println("Ingrese el apellido de la persona: ");
            String lastName1 = sc.next();
            p1.setLastName(lastName1);

            System.out.println("Ingrese la edad de la persona: ");
            int age1 = sc.nextInt();
            p1.setAge(age1);     
            
            arr.add(p1);
          
        }

        System.out.println("Los nombres, apellidos y edades de las personas "
                + "son; " + arr );

    }

}
