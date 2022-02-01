/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosclase;

import java.util.Random;

/**
 *
 * @author cristina
 */
public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;
    private Random random;
    private String[] colorcillo = {"Blanco", "Negro", "Azul", "Rojo", "Amarillo", "Dorado", "Morado", "Naranja"};
    private String[] marquita = {"Peugeot", "Seat", "Ferrari", "Volkswagen", "Range Rover", "Renault", "Citroen", "Audi"};
    private String[] modeloito = {"Clio", "Golf", "A3", "Ibiza", "Leon", "C3", "Focus", "Fiesta"};

    // el método constructor de la clase Vehiculo 
    public Vehiculo(String matricula,
            String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }

    public Vehiculo() {
        this.matricula = "0001 ASD";
        int posiMarca = random.nextInt(marquita.length);
        this.marca = marquita[0];
        this.modelo = modeloito[0];
        this.color = colorcillo[0];
        this.tarifa = 40.8;
        this.disponible = false;

    }

    // los métodos ‘get’ y ‘set’ de la clase Vehiculo 
    public void aplicarDescuentoTarifa(double descuento) {
        this.tarifa -= descuento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }

}
