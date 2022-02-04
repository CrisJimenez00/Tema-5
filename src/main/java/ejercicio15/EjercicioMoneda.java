/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Random;

/**
 *
 * @author cristina
 */
public class EjercicioMoneda {

    private boolean[] moneda;
    private int lanzamientos;

    public EjercicioMoneda(int lanzamientos) {
        this.lanzamientos = lanzamientos;
        this.moneda = new boolean[lanzamientos];
    }

    public static boolean lanzar() {
        Random rd = new Random();
        return rd.nextBoolean();
    }

    public void llenarArray() {
        for (int i = 0; i < moneda.length; i++) {
            this.moneda[i] = lanzar();
        }
    }

    public int caras() {
        int contador = 0;
        for (int i = 0; i < moneda.length; i++) {
            if (this.moneda[i]) {
                contador++;
            }
        }
        return contador;
    }

    public int cruces() {
        int contador = 0;
        for (int i = 0; i < moneda.length; i++) {
            if (!this.moneda[i]) {
                contador++;
            }
        }
        return contador;
    }

    public void imprimir() {
        System.out.println("");
        for (int i = 0; i < moneda.length; i++) {
            System.out.print("Lanzamiento " + (i + 1) + ": ");
            if (this.moneda[i]) {
                System.out.println("cara");
            } else {
                System.out.println("cruz");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjercicioMoneda monedas = new EjercicioMoneda(1000);

        monedas.llenarArray();
        System.out.println("Hay " + monedas.caras() + " caras y " + monedas.cruces() + " cruces");
        monedas.imprimir();
    }

}
