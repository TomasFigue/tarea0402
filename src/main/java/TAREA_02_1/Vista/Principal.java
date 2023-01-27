/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_02_1.Vista;

import TAREA_02_1.Modelo.Controlador.PedidoControl;
import TAREA_02_1.Modelo.Pedido;
import TAREA_02_1.Modelo.Proveedor;
import TAREA_02_1.Servicio.PedidoServiceImpl;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author sebas
 */
public class Principal {
    public static void main(String[] args) {
        
        var enviosc= new Proveedor(1, "Envios Cuenca"
            ,20, "Av. de las Americas",
                LocalDate.of(2022, Month.NOVEMBER, 10));
        
        var iphone=new Pedido(10,"Iphone",20
            , "Azogues", LocalDate.of(2022, Month.MARCH, 10), enviosc);
        
        var BDproveedor= new PedidoServiceImpl();
        BDproveedor.crear(iphone);
        
        var pedidoControl = new PedidoControl();
       var data= new String[5];
       data[0]="10";                
       data[1]="Iphone";   
       data[2]="";                 
       data[3]="";               
       data[4]="";               
       data[5]="";
       data[6]="";
       data[7]="";
       data[8]="";
       
       System.out.println(BDproveedor.listar());
        
        
    }

    
}
        
    }
    
}
