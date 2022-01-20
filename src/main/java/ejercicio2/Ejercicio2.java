/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos el scanner
        Scanner teclado = new Scanner(System.in);
        
        //atributos que nos sirven para la media y para los resultados
        int suma = 0;
        double media = 0;
        int encimaMedia = 0;
        int debajoMedia = 0;
        
        //Primera parte
        System.out.println("indica el número de personas a las que vas a medir");
        int limite = teclado.nextInt();
        double[] altura = new double[limite];

        //para pedir datos por teclado
        for (int i = 0; i < altura.length; i++) {
            System.out.println("Introduzca la altura en cm de la persona " + (i + 1) + " por favor");
            int cm = teclado.nextInt();
            
            if (cm >= 0) {
                altura[i] = cm;
                
            } else {
                System.out.println("Ha introducido un número incorrecto, se guardará en positivo");
                altura[i] = -cm;
            }
        }

        //Para sumar todas las alturas(lo pongo aparte por limpieza)
        for (int i = 0; i < altura.length; i++) {
            suma += altura[i];
        }
        
        System.out.println("La suma de todas las alturas es de: " + suma);
        
        //Calculo la media y lo muestro por consola
        media = suma / altura.length;

        System.out.println("\n\n---------------RESULTADO MEDIA-----------");
        System.out.println("La media es de: " + media);

        
        //te indica en específico qué persona está por encima y por debajo de la media
        for (int i = 0; i < altura.length; i++) {
            if (altura[i] > media) {
                System.out.println("La persona " + (i + 1) + " tiene una altura superior a la media");
                encimaMedia++;
            } else {
                System.out.println("La persona " + (i + 1) + " tiene una altura por debajo de la media");
                debajoMedia++;

            }
        }
        
        //mostramos la conclusión con el número total de personas por debajo y por encima de la mediaf
        System.out.println("\n\n-------------------CONCLUSIÓN--------------------");
        System.out.println("En total hay " + encimaMedia + " por encima de la media"
                + "\n" + debajoMedia + " por debajo de la media");

    }

}
