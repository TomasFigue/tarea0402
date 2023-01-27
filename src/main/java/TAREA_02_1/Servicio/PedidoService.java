/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TAREA_02_1.Servicio;

import TAREA_02_1.Modelo.Pedido;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface PedidoService {
    
    public abstract void crear (Pedido pedido);
    public abstract void modificar (int codigoPedido ,Pedido pedidomod);
    public abstract void eliminar (int codigoPedido);
    public abstract List<Pedido> listar();
    
}