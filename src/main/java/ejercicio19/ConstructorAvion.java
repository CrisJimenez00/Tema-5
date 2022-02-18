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
    private void llenarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = false;
            }
        }

    }

    //Método el cual muestra como se encuentran los asientos en el avión.
    private void mostrarAvion() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
    
    //Método el cual hace que compres el boleto
    private void comprarBoleto(){
        int asientoTeclado = 0, filaAsiento = 0, columnaAsiento = 0;
        try {
            //Seguido la fila en la que lo desea y controlamos que no se salga de la matriz
            System.out.println("¿En qué fila desea los asientos?(de fila 1 a 26)");
            asientoTeclado = teclado.nextInt();

            //Tiene que estar dentro de los parámetros de la matriz
            if (asientoTeclado <= 26 && asientoTeclado >= 1) {
                //se le resta 1 para que escoja la posición correcta del array
                //(porque aparece comenzado en 1 para el usuario por comodidad de este)
                filaAsiento = asientoTeclado - 1;

            } else {

                System.out.println("No existe la fila");

            }
            //Seguido la fila en la que lo desea y controlamos que no se salga de la matriz
            System.out.println("¿En qué posición desea los asientos?(del 1 al 4)");
            asientoTeclado = teclado.nextInt();
            //Volvemos a mirra que los datos introducidos sean correctios
            if (asientoTeclado <= 4 && asientoTeclado >= 1) {

                columnaAsiento = asientoTeclado - 1;

            } else {

                System.out.println("No existe el asiento");

            }

            for (int i = 0; i < asientos.length; i++) {

                //miramos primero las filas y nos paramos en la elegida
                if (i == filaAsiento) {

                    for (int j = 0; j < asientos[i].length; j++) {

                        //Después nos paramos en la columna  o sitio elegido
                        if (j == columnaAsiento) {

                            //Miramos si está libre(false)
                            if (asientos[i][j] == false) {

                                //Si está libre se ocupa en true y se muestra el avión actualizando la situación
                                asientos[i][j] = true;
                                mostrarAvion();

                            } else {

                                System.out.println("El asiento está ocupado");

                            }
                        }
                    }
                }
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Introduzca un dígito numérico");
        }


    }
    private void devolverBoleto(){
        int asientoTeclado = 0, filaAsiento = 0, columnaAsiento = 0;
        try {
            //Seguido la fila en la que lo desea y controlamos que no se salga de la matriz
            System.out.println("¿En qué fila desea los asientos?(de fila 1 a 26)");
            asientoTeclado = teclado.nextInt();

            if (asientoTeclado <= 26 && asientoTeclado >= 1) {

                filaAsiento = asientoTeclado - 1;

            } else {

                System.out.println("No existe la fila");
            }
            //Seguido la fila en la que lo desea y controlamos que no se salga de la matriz
            System.out.println("¿En qué posición desea los asientos?(del 1 al 4)");
            asientoTeclado = teclado.nextInt();

            if (asientoTeclado <= 4 && asientoTeclado >= 1) {

                columnaAsiento = asientoTeclado - 1;

            } else {

                System.out.println("No existe el asiento");

            }

            for (int i = 0; i < asientos.length; i++) {

                //Nos paramos primero en la fila
                if (i == filaAsiento) {

                    for (int j = 0; j < asientos[i].length; j++) {

                        //Después nos paramos en la columna elegida
                        if (j == columnaAsiento) {

                            //Miramos si está ocupado
                            if (asientos[i][j] == true) {

                                //Si está ocupaod se deja libre
                                asientos[i][j] = false;
                                mostrarAvion();

                            } else {

                                System.out.println("El asiento está libre");

                            }
                        }
                    }
                }
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Introduzca un dígito numérico");
        }


    }
    
    //Menú que inicializa todo
    public void menu(){
        boolean salida = false;
        
        llenarAsientos();
        System.out.println("Asientos en el comienzo---------");
        
        mostrarAvion();
        System.out.println("---------");
        
            do{
                System.out.println("Elija su opción insertando el número:"
                        + "\n1.Comprar boleto"
                        + "\n2.Devolver boleto"
                        + "\n3.salir");
                int opcion = teclado.nextInt();

                switch(opcion){

                    case 1: 
                        comprarBoleto();
                        break;

                    case 2:
                        devolverBoleto();
                        break;

                    case 3:
                        salida = true;
                        System.out.println("Hasta la próxima");
                        break;

                    default:
                        System.out.println("Ha introducido un dato no válido");

                }
            }while(!salida);
    
    }

}
