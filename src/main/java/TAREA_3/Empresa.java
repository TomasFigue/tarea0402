/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3;

/**
 *
 * @author sebas
 */
public class Empresa {
    private int numeroEmpleados;
    private String nombre;
    private double ingresos;
    private String owner;
    
    public String mostrarInfoEmpresa(){
        return "Tiene  : "+this.numeroEmpleados+" trabajando Actualmente :"+
                " El nombre de la empresa es: "+this.nombre+
                " Los ingresos mensuales de la empresa son $"+this.ingresos+
                " y el actual dueño de la empresa es: "+this.owner;
        
    }
    
    public Empresa(int numeroEmpleados,String nombre,double ingresos,String owner) {
        this.numeroEmpleados = numeroEmpleados;
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.owner = owner;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
