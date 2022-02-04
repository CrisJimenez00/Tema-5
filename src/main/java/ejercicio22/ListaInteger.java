/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio22;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author cristina
 */
public class ListaInteger {

    private ArrayList<Integer> lista;

    public ListaInteger(int tam) {
        Random random = new Random();
        lista = new ArrayList<>();
        for (int i = 0; i < tam; i++) {
            Integer aux = random.nextInt(91) + 10;
            lista.add(aux);
        }
    }

    public ListaInteger() {
        lista = new ArrayList<>();
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }
    

}
