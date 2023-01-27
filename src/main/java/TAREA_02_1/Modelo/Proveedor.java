/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_02_1.Modelo;

import java.time.LocalDate;

/**
 *
 * @author sebas
 */
public class Proveedor {
     private int codigoProveedor;
    private String nombreProveedor;
    private double precioEnvio;
    private String direccionProveedor;
    private LocalDate fechaEnvio;

    public Proveedor(int codigoProveedor, String nombreProveedor
            , double precioEnvio, String direccionProveedor, LocalDate fechaEnvio) {
        this.codigoProveedor = codigoProveedor;
        this.nombreProveedor = nombreProveedor;
        this.precioEnvio = precioEnvio;
        this.direccionProveedor = direccionProveedor;
        this.fechaEnvio = fechaEnvio;
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "codigoProveedor=" + codigoProveedor 
                + ", nombreProveedor=" + nombreProveedor + ", precioEnvio=" 
                + precioEnvio + ", direccionProveedor=" + direccionProveedor 
                + ", fechaEnvio=" + fechaEnvio + '}';
    }

    
    
    

}
