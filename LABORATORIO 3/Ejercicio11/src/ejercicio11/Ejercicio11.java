
package ejercicio11;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//11. Ingresar el tiempo en segundos que realizó el ganador de la clasificación
//de una carrera de F1. Luego ingresar los tiempos de los otros 9 corredores e
//informar cuántos disputarán la carrera. Para que un corredor pueda participar
//su tiempo de clasificación no puede superar en 15 % al del ganador.
public class Ejercicio11 {

    public static void main(String[] args) {
        double tiempo1; 
        double tiempoN;
        String nombreCorredor;
        int corredores = 3;
        int cont = 0;
        //ArrayList<Double> aCorredoresGral = new ArrayList();
        HashMap<String,Double> aCorredoresGral= new HashMap<>();
        ArrayList<Double> aCorredoresQparticipan = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tiempo del ganador: ");
        tiempo1 = sc.nextDouble();
        
        for (int i = 0; i < corredores; i++) {
            System.out.println("Ingrese el tiempo del corredor y luego su nombre:");
            tiempoN = sc.nextDouble();
            nombreCorredor = sc.next();
            
            while (tiempoN < tiempo1){
                System.out.println("El tiempo ingresado es menor al del ganador."
                        + "No corresponde. Ingrese nuevamente el tiempo y su nombre: ");
                tiempoN = sc.nextDouble();
                nombreCorredor = sc.next();

            }
            if (tiempoN > tiempo1 && tiempoN <= Ejercicio11.calculoTiempo(tiempo1)){
                cont++;
                aCorredoresQparticipan.add(tiempoN);
            } 
            aCorredoresGral.put(nombreCorredor,tiempoN);
                    
        }
        System.out.println("Los corredores que pueden participar son: " + cont);
        System.out.println("Los tiempos de los corredores que participaran son: "
                + aCorredoresQparticipan + " Su tiempo no supero en 15% al del ganador.");
        System.out.println("Los tiempos de los corredores en general son: " + aCorredoresGral+ 
                " y del ganador es: "+ tiempo1);
        
    }
    public static double calculoTiempo(double t){
        double cTiempo;
        cTiempo = t * 1.15;
        return cTiempo;
    }

    
}


