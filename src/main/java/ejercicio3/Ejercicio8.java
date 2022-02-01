/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el largo del array");
        int tamanio = teclado.nextInt();

        int[] array = new int[tamanio];

        for (int i = 0; i < array.length; i++) {

            System.out.println("Introduce el valor en la posicion" + i);
            array[i] = teclado.nextInt();

        }

        for (int i = 0; i < array.length; i++) {

            int valor = array[i];

            for (int j = valor; j >= 0; j--) {

                System.out.print("*");

            }

            System.out.println("\n");

        }
    }

}
