/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Arrays;

/**
 *
 * @author cristina
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 2};
        int[] array4 = {1, 2, 3};

        System.out.println(Arrays.compare(array1, array2));
        System.out.println(Arrays.compare(array1, array3));
        System.out.println(Arrays.compare(array1, array4));
        System.out.println(" ");
        System.out.println(compararArrays(array1, array2));
        System.out.println(compararArrays(array1, array3));
        System.out.println(compararArrays(array1, array4));
        Arrays.compare(array1, array2);
    }

    public static boolean compararArrays(int[] a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (a[i] == b[i]) {
                return true;
            }
        }
        return false;
    }
}


