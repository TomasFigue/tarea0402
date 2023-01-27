/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3;

/**
 *
 * @author sebas
 */
public class Jugador {
    private String nombre;
    private String posicion;
    private Equipo team;
    
    public String mostrarInfoJugador(){
        return "El nombre del jugador: "+this.nombre+" La posicion del jugador es "+
                this.posicion+" y juega en "+this.team.getNombre();
        
    }
    
    public Jugador(String nombre,String posicion,Equipo team) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.team = team;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return team;
    }

    public void setEquipo(Equipo equipo) {
        this.team = equipo;
    }
    
}
