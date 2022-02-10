/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

/**
 *
 * @author cristina
 */
public class PruebaListaLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaLibros catalogo = new ListaLibros();
        ListaLibros catalogo2 = new ListaLibros();
        catalogo.insertarLibro(new Libros("1232", "La muerte a pellizcos", "Planeta", 10, 0.9));
        catalogo.insertarLibro(new Libros("1233", "La muerte a pellizcos", "Planeta", 10, 0.9));
        catalogo.insertarLibro(new Libros("1234", "La muerte a pellizcos", "Planeta", 10, 0.9));
        catalogo.insertarLibro(new Libros("1235", "La muerte a pellizcos", "Planeta", 10, 1));
        catalogo.imprimirConsola();
        System.out.println("Tamaño del catálogo " + catalogo.getCantidadLibros());
        System.out.println("------------------------------");
        Libros libro = catalogo.buscarISBN("1232");
        System.out.println("Libro buscado " + libro);
        libro = catalogo.buscarISBNCuentaVieja("1235");
        System.out.println("---------------------/-----------------");
        System.out.println("Libro buscado " + libro);
        catalogo.borrarLibros(new Libros("1233", "", "", 10, 0));
        catalogo.imprimirConsola();
        System.out.println("------------LIBROS DE PRECIO 0.9-------------");
        catalogo.buscarPorPrecio(0.9).forEach(System.out::println);
    }

}
