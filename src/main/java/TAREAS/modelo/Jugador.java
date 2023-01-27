/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.modelo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author sebas
 */
public class Jugador implements Serializable{
    
    private int codigo;
    private String nombre;
    private String posicion;
    private Equipo equipo;
    private LocalDate fechaDebut;

    public Jugador(int codigo, String nombre, String posicion, Equipo equipo, LocalDate fechaDebut) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.posicion = posicion;
        this.equipo = equipo;
        this.fechaDebut = fechaDebut;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public LocalDate getFechaDebut() {
        return fechaDebut;
    }

    public void setFechaDebut(LocalDate fechaDebut) {
        this.fechaDebut = fechaDebut;
    }

    @Override
    public String toString() {
        return "Jugador{" + "codigo=" + codigo + ", nombre=" + nombre 
                + ", posicion=" + posicion + ", equipo=" + equipo.toString()
                + ", fechaDebut=" + fechaDebut.toString() + '}';
    }



}
