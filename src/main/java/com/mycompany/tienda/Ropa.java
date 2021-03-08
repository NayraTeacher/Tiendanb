/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

/**
 * Clase que hereda de artículo y nos sirve para definir articulos de tipo ropa de los que nos interesa tambien el color y la talla.
 * @author Nayra
 */
public class Ropa extends Articulo{
    private String color;
    private TallaSML talla;
    
    public Ropa(){}
    
    public Ropa(String color, TallaSML talla, String codigo, String nombre, float precio, int stock){
       super(codigo, nombre, precio, stock);
       this.color = color;
       this.talla = talla;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Color: " + getColor() + "\nTalla: " + getTalla() + "\n"; 
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the talla
     */
    public TallaSML getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(TallaSML talla) {
        this.talla = talla;
    }
}
