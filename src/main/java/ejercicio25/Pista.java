/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

import java.util.ArrayList;

/**
 *
 * @author cristina
 */
public class Pista {

    ArrayList<Character> lista;

    public Pista() {
        this.lista = new ArrayList<>(15);
    }

    public void push(char a) {
        lista.add(a);
    }

    public void pop() {
        lista.remove(lista.size() - 1);
    }

    public void mostrarLista() {
        for (Character character : lista) {
            System.out.print(character + ",");
        }
    }

}
