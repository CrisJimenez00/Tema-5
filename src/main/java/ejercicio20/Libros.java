/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio20;

import java.util.Objects;

/**
 *
 * @author cristina
 */
public class Libros {

    private String isbn;
    private String nombre;
    private String editorial;
    private int numPags;
    private double precio;

    public Libros(String isbn, String nombre, String editorial, int numPags, double precio) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.editorial = editorial;
        this.numPags = numPags;
        this.precio = precio;
    }

    public Libros() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libros{" + "isbn=" + isbn + ", nombre=" + nombre + ", editorial=" + editorial + ", numPags=" + numPags + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.isbn);
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.editorial);
        hash = 47 * hash + this.numPags;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    //Consideramos dos libros son iguales cuando el isbn coincide.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Libros other = (Libros) obj;
////        if (this.numPags != other.numPags) {
////            return false;
////        }
////        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
////            return false;
////        }
//        if (!Objects.equals(this.isbn, other.isbn)) {
//            return false;
//        }
////        if (!Objects.equals(this.nombre, other.nombre)) {
////            return false;
////        }
        return Objects.equals(this.isbn, other.isbn);
    }

}
