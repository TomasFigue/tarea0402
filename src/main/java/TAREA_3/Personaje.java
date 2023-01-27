/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3;

/**
 *
 * @author sebas
 */
public class Personaje{
    private Actor actor;
    private Pelicula pelicula;
    private String personaje;
    
    public String mostrarinfoPersonaje(){
        
        return " El actor es: "+this.actor.getNombre()+", la pelicula en la que actua es "+
                this.pelicula.getNombre()+"y el personaje que interpreta es "+this.personaje;    
    }    
     
    public Personaje(Actor actor,Pelicula pelicula,String personaje) {
        this.actor=actor;
        this.pelicula=pelicula;
        this.personaje=personaje;
        
    }
    
    
    
    
}