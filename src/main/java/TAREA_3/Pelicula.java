/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3;

/**
 *
 * @author sebas
 */
public class Pelicula {
    private String nombre;
    private int presupuesto;
    private Actor actorPrincipal;

    public Pelicula(String nombre, int presupuesto, Actor actorPrincipal) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.actorPrincipal = actorPrincipal;
    }
    
    public String mostrarInfoPelicula(){
        return "El nombre de la pelicula: "+this.nombre
                +", El presuspuesto de la pelicula es : "+
                +this.presupuesto+"$ El actor principal es: "
                +this.actorPrincipal.getNombre();
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
