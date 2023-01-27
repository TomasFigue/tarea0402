/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.controlador;

import TAREAS.modelo.Jugador;
import TAREAS.servicio.EquipoServiceImpl;
import TAREAS.servicio.JugadorServiceImpl;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author sebas
 */
public class JugadorControl {
    
    public JugadorServiceImpl JugadorServiceImpl=new JugadorServiceImpl();
    public EquipoServiceImpl EquipoServiceImpl=new EquipoServiceImpl();
    
    public void crear(String [] data){
        
        var codigo=Integer.valueOf(data[0]);
        var nombre=data[1];
        var posicion=data[2];
        var equipo=this.EquipoServiceImpl.buscarPorCodigo(Integer.valueOf(data[3]));
        var year=Integer.valueOf(data[4]).intValue();
        var month=Integer.valueOf(data[5]).intValue();
        var day=Integer.valueOf(data[6]).intValue();
        var fechaDebut = LocalDate.of(year,month, day);
        
        
        var jugador=new Jugador(codigo,nombre,posicion,equipo,LocalDate.of(year, month, day));
        this.JugadorServiceImpl.crear(jugador);
    }
    
    public List<Jugador> listar(){
        return this.JugadorServiceImpl.listar();
    }
    
    public String modificar(String[] data) {
        var retorno="No se puede modificar";
        var codigo=Integer.valueOf(data[0]);
        var nombre=data[1];
        var posicion=data[2];
        var equipo=this.EquipoServiceImpl.buscarPorCodigo(Integer.valueOf(data[3]));
        var year=Integer.valueOf(data[4]).intValue();
        var month=Integer.valueOf(data[5]).intValue();
        var day=Integer.valueOf(data[6]).intValue();
        var fechaDebut = LocalDate.of(year,month, day);
        var modificar = Integer.valueOf(data[7]).intValue();
        
       var jugador=new Jugador(codigo,nombre,posicion,equipo,LocalDate.of(year, month, day));
        this.JugadorServiceImpl.modificar(jugador, modificar);
        retorno="Modificado";
        return retorno;
     }
    
    public void eliminar(String codigos) {
        var codigo = Integer.valueOf(codigos).intValue();
        this.JugadorServiceImpl.eliminar(codigo);

    }
    
    
    
}
    

