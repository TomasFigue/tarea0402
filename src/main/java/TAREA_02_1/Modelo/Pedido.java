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
public class Pedido {
    private int codigoPedido;
    private String nombrePedido;
    private double peso;
    private String direccionEnvio;
    private LocalDate fechaEntrega;
    private Proveedor proveedor;

    public Pedido(int codigoPedido, String nombrePedido, double peso, String direccionEnvio, LocalDate fechaEntrega, String proveedor) {
        this.codigoPedido = codigoPedido;
        this.nombrePedido = nombrePedido;
        this.peso = peso;
        this.direccionEnvio = direccionEnvio;
        this.fechaEntrega = fechaEntrega;
        this.proveedor = Proveedor;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getNombrePedido() {
        return nombrePedido;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigoPedido=" + codigoPedido + ", nombrePedido=" 
                + nombrePedido + ", peso=" + peso + ", direccionEnvio=" + direccionEnvio 
                + ", fechaEntrega=" + fechaEntrega + ", proveedor=" + proveedor + '}';
    }
    
    
    
    
}

   
