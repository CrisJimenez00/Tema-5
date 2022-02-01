/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        double[] array = new double[20];
        double[] arrayCopia;

        Random random = new Random();

        Arrays.fill(array, 7.5);
        arrayCopia = Arrays.copyOf(array, 20);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayCopia));

        if (Arrays.equals(array, arrayCopia)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }

        array[random.nextInt(20)] = 6.3;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayCopia));

        if (Arrays.equals(array, arrayCopia)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }
    }

}
