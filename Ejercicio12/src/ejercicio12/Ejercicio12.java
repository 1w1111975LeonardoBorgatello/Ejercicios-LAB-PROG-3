
package ejercicio12;

import java.util.Scanner;


public class Ejercicio12 {


    public static void main(String[] args) {
        int antiguedad;
        int cTOTAL = 0;
        double promedio = 0;
        int cNuevo = 0;
        int cPocouso = 0;
        int cViejo = 0;
        int cMuchouso = 0;
        int acuNuevo = 0;
        int acuPocouso = 0;
        int acuMuchouso = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la antiguedad del automovil, "
                + "si desea finalizar ingrese 0: ");
        antiguedad = sc.nextInt();
        
        while (antiguedad != 0){
            if(antiguedad >= 1 && antiguedad <= 5){
                acuNuevo += antiguedad;         
                cNuevo++;
                System.out.println("NUEVO");
            }
            if (antiguedad >= 6 && antiguedad <= 10){
                cPocouso++;
                acuPocouso += antiguedad;
                System.out.println("POCO USO");
            }
            if (antiguedad >= 11 && antiguedad <= 20){
                cMuchouso++;
                acuMuchouso += antiguedad;
                System.out.println("MUCHO USO");
            }
            if (antiguedad > 20){
                cViejo++;
                System.out.println("MUY ANTIGUO");
            }            
            
            System.out.println("Ingrese la antiguedad del automovil, "
                    + "si desea finalizar ingrese 0: ");
            antiguedad = sc.nextInt();
        
        }           
            
        cTOTAL = cNuevo + cPocouso + cMuchouso + cViejo;
        promedio = (double)(acuNuevo + acuPocouso + acuMuchouso) / 
                (cNuevo + cPocouso + cMuchouso);
        System.out.println("\nFinalizo la carga de vehiculos." + "\n" +
                "La cantidad total de autos es: "+cTOTAL+ "\n"+
                "La cantidad de vehiculos con poco uso es: "+cPocouso);
        System.out.println("EL promedio de antiguedad de los vehiculos que no son"
                + " muy antiguos es: " + promedio);
    }
    
}
