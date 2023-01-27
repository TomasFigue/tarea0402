/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3;

/**
 *
 * @author sebas
 */
public class Empleado {
    private String nombre;
    private int fechaNacimiento;
    private double salario;
    private Departamento departamento;
    
    public String mostrarInfoEmpleado(){
        return "El nombre del empleado es "+this.nombre+", el empleado nacio en "+
                this.fechaNacimiento+", el salario actual es "+this.salario
                +"y su departamento es el de"+this.departamento.getArea();
        
    }
    
    public Empleado(String nombre,int fechaNacimiento,double salario,Departamento departamento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
