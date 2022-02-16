/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author cristina
 */
public class Avion {

    public static void main(String[] args) {
        //mirar si se puede con boolean o con 1 y 2
        boolean[][] asientos = new boolean[25][4];

        //Primero ponemos todos los asientos en false(libres)
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 4; j++) {
                asientos[i][j] = false;
            }
        }
        //for dentro de un for para mostrarlo por pantalla
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(asientos[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        

    }

}
