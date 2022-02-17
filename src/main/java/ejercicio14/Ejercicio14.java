/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Random;

/**
 *
 * @author cristina
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0, cantidad = 0;
        double media;
        int[][] matriz = new int[3][3];
        Random random = new Random();

        //Rellenamos de random entre 1 y 100
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
        int min = 100, max = 0;
        //Mostramos por pantalla
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //Para el mayor y el menor
                if (min < matriz[i][j]) {
                    min = matriz[i][j];
                    System.out.println("ay");
                }
                if (max > matriz[i][j]) {
                    max = matriz[i][j];
                    System.out.println("po");
                }
                //para mostrar
                System.out.print(matriz[i][j]);
                System.out.print("\t");
                //Para la media
                cantidad++;
                suma += matriz[i][j];
                
                
            }
            System.out.println();
        }

        //Calculamos la media
        media = (double) suma / cantidad;
        System.out.println("La media es de: " + media);
        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);

    }

}
