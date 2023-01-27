/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.modelo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 '
 * @author sebas
 */
public class Partido implements Serializable{
    private int codigo;
    private Equipo equipo1;
    private Equipo equipo2;
    private LocalDate fechaPartido;

    public Partido(int codigo, Equipo equipo1, Equipo equipo2, LocalDate fechaPartido) {
        this.codigo = codigo;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fechaPartido = fechaPartido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    @Override
    public String toString() {
        return "Partido{" + "codigo=" + codigo + ", equipo1=" 
                + equipo1.toString()+ ", equipo2=" + equipo2.toString() 
                + ", fechaPartido=" + fechaPartido.toString() + '}';
    }



}
