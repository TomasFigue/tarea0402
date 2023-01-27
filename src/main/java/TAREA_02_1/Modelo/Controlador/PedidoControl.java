/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_02_1.Modelo.Controlador;

import TAREA_02_1.Modelo.Pedido;
import TAREA_02_1.Servicio.PedidoServiceImpl;
import java.time.LocalDate;

/**
 *
 * @author sebas
 */
public class PedidoControl {
    private PedidoServiceImpl pedidoServiceImpl;
    
    public PedidoControl(){
        this.pedidoServiceImpl=new PedidoServiceImpl();
    }
    
    public String crear(String[] data){
        var retorno="No se pudo crear el Pedido";
        var codigoPedido=Integer.valueOf(data[0]).intValue();
        var nombrePedido=data[1];
        var peso=Double.valueOf(data[2]).doubleValue();
        var direccionEnvio=data[3];
        var fechaEntrega=data[4];
        var proveedor=String.valueOf(data[5]);
        var year = Integer.valueOf(data[6]).intValue();
        var mes = Integer.valueOf(data[7]).intValue();
        var dia = Integer.valueOf(data[8]).intValue();
        
        if(peso <0){
            retorno+= "Precio no valido";
        }else{
            var pedido = new Pedido(codigoPedido,nombrePedido,peso
                    ,direccionEnvio,LocalDate.of(year, mes,dia),proveedor);
            this.pedidoServiceImpl.crear(pedido);
            retorno= "Pedido"+pedido.getNombrePedido()+"Creado";
        }
        return retorno;
    }
    
}