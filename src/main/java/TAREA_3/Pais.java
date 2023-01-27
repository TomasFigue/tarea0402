/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3;

/**
 *
 * @author sebas
 */
public class Pais {
    private String nombre;
    private String poblacion;
    private String continente;
    private String area;
   
    
    public String mostrarInfoPais(){
        return "El pais es: "+this.nombre+" La poblacion es de: "+this.poblacion+
               " Esta en el Continente: "+this.continente+" Su area es: "+
                this.area;
        
    }
    
    public Pais(String nombre,String poblacion,String continente,String area) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.continente = continente;
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}
