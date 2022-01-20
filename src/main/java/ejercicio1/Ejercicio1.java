/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author cristina
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            suma += array[i];
        }
        System.out.println("resultado del sumatorio de todos es de: " + suma);
    }

}
