/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_3;

/**
 *
 * @author sebas
 */
public class Departamento {
    private String area;
    private int numeroEmpleados;
    private String jefe;
    
     public String mostrarInfoDepartamento(){
        return "El departamento se desarrolla en el area de "+this.area
                +", tiene "+this.numeroEmpleados+" empleados"+"y su jefe es: "+this.jefe;
    }
     
    public Departamento(String area,int numeroEmpleados,String jefe) {
        this.area = area;
        this.numeroEmpleados = numeroEmpleados;
        this.jefe = jefe;
    }

    public String getArea() {
        return area;
    }
    
    public void setArea(String area){
        this.area=area;
    }

}
