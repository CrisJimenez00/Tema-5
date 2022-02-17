/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class ConstructorAvion {

    private boolean[][] asientos;
    private Scanner teclado = new Scanner(System.in);

    public ConstructorAvion() {
        this.asientos = new boolean[25][4];
    }

    //Método el cual marca todos los asientos vacíos
    public void llenarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = false;
            }
        }

    }

    //Método el cual muestra como se encuentran los asientos en el avión.
    public void mostrarAvion() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    
    private void comprarBoleto(){
        int asientoTeclado = 0, filaAsiento = 0, columnaAsiento = 0;

        //Seguido la fila en la que lo desea y controlamos que no se salga de la matriz
        System.out.println("¿En qué fila desea los asientos?");
        asientoTeclado = teclado.nextInt();
        if (asientoTeclado <= 25 && asientoTeclado >= 0) {
            filaAsiento = asientoTeclado;
        } else {
            System.out.println("No existe la fila");
        }
        //Seguido la fila en la que lo desea y controlamos que no se salga de la matriz
        System.out.println("¿En qué posición desea los asientos?(del 1 al 4)");
        asientoTeclado = teclado.nextInt();
        if (asientoTeclado <= 4 && asientoTeclado >= 1) {
            columnaAsiento = asientoTeclado;
        } else {
            System.out.println("No existe el asiento");
        }
        //Un for para la cantidad de tickets, otro para asiento y otro para la columna

        for (int j = 0; j < 10; j++) {
            if (j == filaAsiento) {
                for (int k = 0; k < 10; k++) {
                    if (k == columnaAsiento) {
                        if (asientos[j][k] == false) {
                            asientos[j][k] = true;
                        } else {
                            System.out.println("El asiento está ocupado");
                        }
                    }
                }
            }
        }


    }
    
    
    
    
    
    
    
    
    
    //Menú que inicializa todo
    public void menu(){
        System.out.println("Elija su opción insertando el número:"
                + "\n1.Comprar boleto"
                + "\n2.Devolver boleto");
        int opcion = teclado.nextInt();
        switch(opcion){
            case 1: 
                break;
            case 2:
                break;
            default:
                System.out.println("Ha introducido un dato no válido");

        }
    
    
    
    }

}
