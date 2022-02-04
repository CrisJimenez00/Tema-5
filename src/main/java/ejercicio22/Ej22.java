/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author cristina
 */
public class Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        ListaInteger miLista = new ListaInteger(10);
        ArrayList<Integer> list = miLista.getLista();
        for (int i = 0; i < 25; i++) {
            Integer aux = r.nextInt(91) + 10;
            list.add(aux);
        }
        for (Integer integer : list) {
            System.out.print(integer + " - ");

        }

        int sumaPares = 0, contadorPares = 0;
        int sumaImpares = 0, contadorImpares = 0;

        for (int i = 0; i < list.size(); i++) {
            int numero = list.get(i);
            if (numero % 2 == 0) {
                sumaPares += numero;
                contadorPares++;
            } else {
                sumaImpares += numero;
                contadorImpares++;
            }
        }

        //Para buscar el número mayor
        int mayor = Integer.MIN_VALUE;
        for (Integer integer : list) {
            if (integer > mayor) {
                mayor = integer;
            }
        }

        System.out.println("\nEl número mayor es " + mayor);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Total de impares " + contadorImpares);
        System.out.println("Borrado del elemento de la posición 3");
        list.remove(list.get(3));
        list.forEach(e -> System.out.print(e + " - "));
        list.set(0, 200);
        System.out.println("\n");
        list.forEach(e -> System.out.print(e + " - "));
        list.add(2, 500);
        System.out.println("\n");
        list.forEach(e -> System.out.print(e + " - "));
        int indice = list.indexOf(500);
        System.out.println("\n El 500 se encuentra en la posición " + indice);
    }

}
