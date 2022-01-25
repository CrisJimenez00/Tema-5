/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Ejercicio7 {

    private static void rellenarArray(int[] array1, int[] array2) {
        int longitud = array1.length;

        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            array1[i] = random.nextInt(100) + 1;
            array2[i] = random.nextInt(100) + 1;
        }
    }

    private static int[] multiplicaArray(int[] array1, int[] array2) {
        int longitud = array1.length;
        int[] resultado = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            //Como los 3 arrays son de la misma longitud la posición de i es la misma en los 3
            resultado[i] = array1[i] * array2[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] array1, array2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿De cuánta longitud quiere que sea ambos arrays?");
        int longitud = teclado.nextInt();

        //Inicializamos los array dándole de longitud lo especifica el usuario
        array1 = new int[longitud];
        array2 = new int[longitud];
        rellenarArray(array1, array2);

        System.out.println("--------ARRAY 1--------");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "-");
        }

        System.out.println("\n\n-----ARRAY 2--------");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "-");
        }
        int[] resultado = multiplicaArray(array1, array2);

        System.out.println("\n\n-----RESULTADO--------");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + "-");
        }
    }
}
