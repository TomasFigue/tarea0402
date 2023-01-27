/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3;

/**
 *
 * @author sebas
 */
public class Actor {
    private String nombre;
    private String Pelicula;
    private int precio;
    private int actuaciones;

    public Actor(String nombre, String Pelicula, int precio, int actuaciones) {
        this.nombre = nombre;
        this.Pelicula = Pelicula;
        this.precio = precio;
        this.actuaciones = actuaciones;
    }
    
    public String mostrarinfoActor(){
        
        return "El actor es: "+this.nombre+" La pelicula en la que actua es: "+
                this.Pelicula+" El precio por obra del acto es: "+this.precio+
                " El numero de actuaciones es: "+this.actuaciones;    
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getActuaciones() {
        return actuaciones;
    }

    public void setActuaciones(int actuaciones) {
        this.actuaciones = actuaciones;
    }
    
    
    
}
