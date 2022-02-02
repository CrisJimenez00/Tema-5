/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosclase;

import java.util.Arrays;

/**
 *
 * @author cristina
 */
public class PruebaCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo[] lista = new Vehiculo[100];
        for (int i = 0; i < 100; i++) {
            Vehiculo vehiculo = new Vehiculo();
            lista[i] = vehiculo;
        }

        System.out.println(Arrays.toString(lista));
    }

}
