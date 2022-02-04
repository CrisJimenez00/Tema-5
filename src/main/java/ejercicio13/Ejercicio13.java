/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Ejercicio13 {

    private static void mostrarAsteriscos(int numero, int contador) {
        System.out.print(numero + ": ");
        for (int i = 0; i < contador; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        boolean fin = true;
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList();

        int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0,
                contador5 = 0, contador6 = 0, contador7 = 0, contador8 = 0,
                contador9 = 0, contador10 = 0, contador11 = 0, contador12 = 0,
                contador13 = 0, contador14 = 0, contador15 = 0, contador16 = 0,
                contador17 = 0, contador18 = 0, contador19 = 0, contador20 = 0;

        do {
            System.out.println("Introduzca el número que desee");
            int numero = teclado.nextInt();

            if (numero == 0) {
                fin = false;
            } else {
                if (numero <= 20 && numero >= 1) {
                    lista.add(numero);
                }

            }

        } while (fin);
        System.out.println("Los números introducidos son: " + lista.toString());
        for (int i = 0; i < lista.size(); i++) {
            switch (lista.get(i)) {
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
                case 6:
                    contador6++;
                    break;
                case 7:
                    contador7++;
                    break;
                case 8:
                    contador8++;
                    break;
                case 9:
                    contador9++;
                    break;
                case 10:
                    contador10++;
                    break;
                case 11:
                    contador11++;
                    break;
                case 12:
                    contador12++;
                    break;
                case 13:
                    contador13++;
                    break;
                case 14:
                    contador14++;
                    break;
                case 15:
                    contador15++;
                    break;
                case 16:
                    contador16++;
                    break;
                case 17:
                    contador17++;
                    break;
                case 18:
                    contador18++;
                    break;
                case 19:
                    contador19++;
                    break;
                case 20:
                    contador20++;
                    break;

            }
        }
        mostrarAsteriscos(1, contador1);
        mostrarAsteriscos(2, contador2);
        mostrarAsteriscos(3, contador3);
        mostrarAsteriscos(4, contador4);
        mostrarAsteriscos(5, contador5);
        mostrarAsteriscos(6, contador6);
        mostrarAsteriscos(7, contador7);
        mostrarAsteriscos(8, contador8);
        mostrarAsteriscos(9, contador9);
        mostrarAsteriscos(10, contador10);
        mostrarAsteriscos(11, contador11);
        mostrarAsteriscos(12, contador12);
        mostrarAsteriscos(13, contador13);
        mostrarAsteriscos(14, contador14);
        mostrarAsteriscos(15, contador15);
        mostrarAsteriscos(16, contador16);
        mostrarAsteriscos(17, contador17);
        mostrarAsteriscos(18, contador18);
        mostrarAsteriscos(19, contador19);
        mostrarAsteriscos(20, contador20);

    }

}
