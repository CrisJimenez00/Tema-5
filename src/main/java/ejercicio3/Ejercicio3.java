/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        //Creamos objetos para las clases Scanner y Random
        Random numRandom = new Random();
        Scanner sc = new Scanner(System.in);

        boolean repetir = true; //Variable para repetición de bucle

        //Declaramos e inicializamos la variable para obtener el tamaño de los arrays
        int tam = 0;
        //Bucle para repetir en caso de error al introducir dato
        do {
            System.out.println("Introduce el tamaño de Array deseado");
            try { //Comprobación de que se introduzca un número
                tam = sc.nextInt();
                if (tam < 0) {//En caso de valor negativo se convierte en positivo
                    tam = Math.abs(tam);
                }
                if (tam == 0) { //Si el numero introducido es cero se pide un número válido
                    System.out.println("El número no puede ser igual a cero");
                    repetir = true;
                }
                repetir = false;
            } catch (InputMismatchException ime) {//Lanzamiento de excepción y repetición del bucle
                System.out.println("Introduzca un número por favor");
                System.out.println(" ");
                sc.nextLine(); //Limpieza de memoria
                repetir = true;
            }
        } while (repetir);

        //Declaramos e inicializamos el array
        int[] array1 = new int[tam];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Introduzca el número que desea que ocupe la posición " + i);
            sc.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {

            System.out.print("*");

        }
    }

}

