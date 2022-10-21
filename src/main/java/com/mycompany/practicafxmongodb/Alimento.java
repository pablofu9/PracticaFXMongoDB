/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafxmongodb;

/**
 *
 * @author furu9
 */
public class Alimento {
    private String nombre;
    private String tipo;
    private double precioKg;
    private String sabor;

    public Alimento(String nombre, String tipo, double precioKg, String sabor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioKg = precioKg;
        this.sabor = sabor;
    }

    public Alimento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioKg() {
        return precioKg;
    }

    public void setPrecioKg(double precioKg) {
        this.precioKg = precioKg;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    
}
