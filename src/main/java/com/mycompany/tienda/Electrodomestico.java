/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

/**
 *
 * @author Nayra
 * Es reciclable si su Clase energetica es A o mejor y su año de fabricacion
 * es posterior a hace 5 años
 * Descuento si reciclable de un 30%
 */
public class Electrodomestico extends Articulo{
    private ClaseE clasificacion;
    private String gama;
    
    public Electrodomestico(){}
    
    public Electrodomestico(String gama, ClaseE clasificacion, 
            String codigo, String nombre, 
            float precio, int stock){
       super(codigo, nombre, precio, stock);
       this.gama = gama;
       this.clasificacion = clasificacion;
    }
    
    public String getGama(){
        return gama;
    }
    
    public void setGama(String gama){
        this.gama = gama;
    }
    
    public ClaseE getClasificacion(){
        return clasificacion;
    }
    
    public void setClasificacion(ClaseE clasif){
        this.clasificacion = clasif;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Gama: " + getGama() + "\nClasificacion: " + getClasificacion() + "\n"; 
    }

    @Override
    public void applyPromo(String codigopromo) {
        //Si el codigo promocional es SINIVA aplicamos un 21% de descuento
        //Si el codigo promocional es ELECPROMO aplicamos un 10%
        float nuevoprecio = this.getPrecio();
        if (codigopromo.equals("SINIVA"))
            this.setPrecio(((float)nuevoprecio*0.79));
        if (codigopromo.equals("ELECPROMO"))
            this.setPrecio(((float)nuevoprecio*0.9));
        
    }
}
