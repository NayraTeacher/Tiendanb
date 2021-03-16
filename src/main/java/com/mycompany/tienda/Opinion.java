/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tienda;

/**
 *
 * @author Nayra
 */
public class Opinion {
    private Usuario user;
    private Puntuacion puntuacion;
    private String comment;
    private int votoPositivo;
    private int votoNegativo;
    
    public Opinion(){
        votoPositivo=0;
        votoNegativo=0;
    }
    
    public Opinion(Usuario user, Puntuacion puntos, String comment){
        this.user = user;
        this.puntuacion = puntos;
        this.comment = comment;
        votoPositivo=0;
        votoNegativo=0;
    }
    
    public void votarPositivo(){
        this.votoPositivo++;
    }
    
     public void votarNegativo(){
        this.votoNegativo++;
    }
     
    public Puntuacion getPuntuacion(){
        return this.puntuacion;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario=").append(user);
        sb.append("\npuntuacion=").append(puntuacion);
        sb.append("\ncomentario=").append(comment);
        sb.append("\npositivos=").append(votoPositivo);
        sb.append("\nnegativos=").append(votoNegativo);
        sb.append('\n');
        return sb.toString();
    }
}
    

