/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author cristina
 */
public class PruebaPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pista lista = new Pista();
        lista.push('3');
        lista.push('4');
        lista.push('8');
        lista.mostrarLista();
        System.out.println("");
        lista.pop();
        lista.mostrarLista();
    }

}
