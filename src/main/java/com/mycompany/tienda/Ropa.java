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
public class Ropa extends Articulo implements Reciclable{
    private String color;
    private TallaSML talla;
    private int numReciclado;
    
    public Ropa(){}
    
    public Ropa(String color, TallaSML talla, int num, String codigo, String nombre, float precio, int stock){
       super(codigo, nombre, precio, stock);
       this.color = color;
       this.talla = talla;
       this.numReciclado = num;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Color: " + color + "\nTalla: " + talla + "\n"; 
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

    @Override
    public void applyPromo(String codigopromo) {
       //Si el codigo promocional es "ROPAPROMO" aplico un 20% descuento en el precio
       if (codigopromo.equals("ROPAPROMO"))
            this.setPrecio(((float)this.getPrecio()*0.8));
       
    }

    @Override
    public boolean esReciclable() {
        //TODO
        //La ropa es reciclable solo 2 veces
        return this.numReciclado < 2;
    }

    @Override
    public void applyDiscount() {
        //TODO
        //La ropa reciclada tiene un 50% de descuento
        //Ademas de aplicar el descuento, modifica el atributo de que 
        // ha sido reciclada
        this.numReciclado +=1;
        this.setPrecio(((float)this.getPrecio()*0.5));
    }
}
