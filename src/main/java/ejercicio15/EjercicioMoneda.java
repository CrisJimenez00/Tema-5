/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class EjercicioMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiradas;
        String resultado;
        int tiradaCara = 0, tiradaCruz = 0;
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas tiradas quiere hacer?");
        tiradas = teclado.nextInt();
        
        for (int i = 0; i < tiradas; i++) {
            int posisbilidadTirada = random.nextInt(2) + 1;
            if (posisbilidadTirada == 1) {
                resultado = "Cara";
                tiradaCara++;
            } else {
                resultado = "Cruz";
                tiradaCruz++;
            }
            System.out.println("La tirada " + (i + 1) + " ha salido: " + resultado);

        }
        System.out.println("Han salido " + tiradaCara + " veces cara" + "y ha salido " + tiradaCruz + " veces cruz");
    }

}
