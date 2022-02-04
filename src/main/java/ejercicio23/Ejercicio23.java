/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author cristina
 */
public class Ejercicio23 {

    public static void rellenarNumeroAleatorios(int elementos, ArrayList<Integer> lista) {
        Random random = new Random();
        for (int i = 0; i < elementos; i++) {
            int num = random.nextInt();
            lista.add(num);
        }
    }

    public static ArrayList<Integer> listaCreada(int elementos) {

        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < elementos; i++) {
            int aux = random.nextInt();
            lista.add(aux);
        }

        return lista;
    }

    public static void main(String[] args) {

//        Random aleatorio = new Random();
//
//        //Declaración de las dos ArrayList de tipo Integer.
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = listaCreada(26);
        rellenarNumeroAleatorios(20, arrayList1);

//        //arrayList1 con una longitud al azar entre 5 y 15.
//        //Introducimos a arrayList1 números generados entre 50 y 100.
//        for (int i = 0; i < aleatorio.nextInt(15 - 5 + 1) + 5; i++) {
//            //Almacenamos en un objeto tipo Integer el número generado al azar.
//            Integer aux = aleatorio.nextInt(100 - 50 + 1) + 50;
//            //Agregamos al arrayList1 con el método .add el número generado y almacenado en aux.
//            arrayList1.add(aux);
//        }
//
//        //arrayList2 con una longitud al azar entre 10 y 20.
//        //Introducimos a arrayList2 números generados entre 50 y 100.
//        for (int i = 0; i < aleatorio.nextInt(20 - 10 + 1) + 10; i++) {
//            //Almacenamos en un objeto tipo Integer el número generado al azar.
//            Integer aux = aleatorio.nextInt(100 - 50 + 1) + 50;
//            //Agregamos al arrayList1 con el método .add el número generado y almacenado en aux.
//            arrayList2.add(aux);
//        }
//
//        //Imprimir las listas que han sido generadas, usando for-each.
//        //arrayList1
//        System.out.println("array 1: ");
//        for (Integer tmp : arrayList1) {
//            System.out.print(tmp + " - ");
//        }
//
//        //arrayList2
//        System.out.println("\n\narray 2: ");
//        for (Integer tmp : arrayList2) {
//            System.out.print(tmp + " - ");
//        }
//
//        //Creamos una tercera lista que contenga los elementos que están en la lista 1 y NO en la 2.
//        ArrayList<Integer> elementosNoRepetidos = new ArrayList<>();
//        //Recorremos arrayList1 y comparamos sus elementos con cada uno del arrayList2
//        for (int i = 0; i < arrayList1.size(); i++) {
//            //Variable aux que almacena la posición del arrayList1.
//            Integer aux = arrayList1.get(i);
//            //Boolean que me ayuda a controlar el bucle de comparación.
//            boolean seRepite = false;
//            //Mientras estamos en UNA posición del arrayList1, comparamos dicha posición con todas del arrayList2.
//            for (int j = 0; j < arrayList2.size(); j++) {
//                Integer aux2 = arrayList2.get(j);
//                //Condición que encuentra valores repetidos.
//                if (aux == aux2) {
//                    //Si se repiten,
//                    seRepite = true;
//                    break;
//                }
//            }
//            if (!(seRepite)) {
//                elementosNoRepetidos.add(aux);
//            }
//
//        }
//
//        //Imprimimos elementosNoRepetidos
//        System.out.println("\n\nNo repetidos: ");
//        for (Integer tmp : elementosNoRepetidos) {
//            System.out.print(tmp + " - ");
//        }
//
//        //Creamos una cuarta lista que contenga los elementos de la lista 1 que son pares y los elementos de la lista 2 que son impares.
//        ArrayList<Integer> pares1Impares2 = new ArrayList<>();
//        //Bucle para obtener los elementos de la lista 1 que sean pares.
//        for (int i = 0; i < arrayList1.size(); i++) {
//            Integer aux = arrayList1.get(i);
//            if (aux % 2 == 0) {
//                pares1Impares2.add(aux);
//            }
//        }
//        //Bucle para obtener los elemnetos de la lista 2 que sean impares.
//        for (int i = 0; i < arrayList2.size(); i++) {
//            Integer aux = arrayList2.get(i);
//            if (aux % 2 != 0) {
//                pares1Impares2.add(aux);
//            }
//
//        }
//
//        //Imprimimos pares1Impares2 usando una expresión lambda.
//        System.out.println("\n\nPares de la primera lista y los impares de la segunda lista: ");
//        pares1Impares2.forEach(integer -> {
//            System.out.print(integer + " - ");
//        });
//
    }

}
