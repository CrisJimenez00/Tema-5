/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio20;

import java.util.ArrayList;

/**
 *
 * @author cristina
 */
public class ListaLibros {

    //Atributo encapsulado de tipo lista.
    private ArrayList<Libros> lista;

    //Constructor por defecto, solo instancia la estructura list
    //sin incluir ningún objeto.
    public ListaLibros() {
        this.lista = new ArrayList<>();
    }

    //Guarda un libro al final de la lista, si no es null
    public void insertarLibro(Libros libro) {

        if (libro != null) {

            lista.add(libro);

        }

    }

    public void imprimirConsola() {

        System.out.println("Imprimendo lista de libros...");
        lista.forEach(System.out::println);
    }

    public int getCantidadLibros() {
        return lista.size();
    }

    public boolean borrarLibros(Libros libro) {
        //ya hace antes un if de si tiene cointains y todo
        return lista.remove(libro);
    }

    public Libros buscarISBNCuentaVieja(String isbn) {
        Libros aux = null;
        for (int i = 0; i < lista.size(); i++) {
            aux = lista.get(i);
            if (aux.getNombre().equals(isbn)) {
                return aux;
            }
        }
        return aux;
    }

    public Libros buscarISBN(String isbn) {
        Libros aux = new Libros(isbn, "", "", 0, 0);

        int indice = lista.indexOf(aux);
        if (indice >= 0) {
            return lista.get(indice);
        }
        return null;
    }

    public ArrayList<Libros> buscarPorPrecio(double precio) {
        ArrayList<Libros> aux = new ArrayList<>();
        for (Libros libros : lista) {
            if (libros.getPrecio() == precio) {
                aux.add(libros);
            }
        }
        return aux;
    }
}
