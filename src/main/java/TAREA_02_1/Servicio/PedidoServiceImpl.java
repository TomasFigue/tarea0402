/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_02_1.Servicio;

import TAREA_02_1.Modelo.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class PedidoServiceImpl implements PedidoService {
   private List<Pedido> pedidoList;
    public PedidoServiceImpl(){
        this.pedidoList=new ArrayList<>();
    }

    public void crear(Pedido pedido) {
        this.pedidoList.add(pedido);
    }
    
    public List<Pedido> listar() {
        return this.pedidoList;
    }

    
    public void modificar(int codigoPedido ,Pedido pedidomod) {
        var indice=0;
        this.pedidoList.set(indice, pedidomod);
    }

    public void eliminar(int codigoPedido) {
        var indice=0;
        for(var pedido:this.pedidoList){
            if(pedido.getCodigoPedido()==codigoPedido){
                this.pedidoList.remove(indice);
                break;
            }else{
                indice++;
            }
        }
    }

    
}