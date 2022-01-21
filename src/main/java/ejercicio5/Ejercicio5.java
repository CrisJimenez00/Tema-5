/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Ejercicio5 {

    private static int[] array = new int[10];
    private static int contadorPositivo = 0;
    private static int contadorNegativo = 0;
    private static int contadorCero = 0;

    private static void leerValores() {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca el valor que quiera que se encuentre en la posición " + i);
            int numero = teclado.nextInt();
            array[i]= numero;
        }
    }

}
