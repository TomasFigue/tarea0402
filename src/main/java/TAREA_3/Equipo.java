/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3;

/**
 *
 * @author sebas
 */
public class Equipo {
    private int numeroJugadores;
    private boolean clasifica;
    private String popularidad;
    private Pais pais;
    private double presupuesto;
    private String nombre;
    
    public String mostrarInfoEquipo(){
        return "El equipo se llama:"+this.nombre+", el numero de jugadorese es de "
                +this.numeroJugadores+", el equipo clasifica: "+
                this.clasifica+", la popularidad del equipo es: "+this.popularidad+
                ", el presupuesto actual del equipo es: "+this.presupuesto+" millones"
                +" y el equipo es de "+this.pais.getNombre();
        
    }
    
    public Equipo(int numeroJugadores,boolean clasifica,String popularidad
            ,Pais pais,double presupuesto,String nombre) {
        this.numeroJugadores = numeroJugadores;
        this.clasifica = clasifica;
        this.popularidad = popularidad;
        this.pais = pais;
        this.presupuesto = presupuesto;
        this.nombre = nombre;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public boolean getClasifica() {
        return clasifica;
    }

    public void setClasifica(boolean clasifica) {
        this.clasifica = clasifica;
    }

    public String getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(String popularidad) {
        this.popularidad = popularidad;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Pais getPais() {
        return pais;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}