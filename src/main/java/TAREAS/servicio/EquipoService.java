/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TAREAS.servicio;

import TAREAS.modelo.Equipo;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface EquipoService {
    
    public void crear(Equipo equipo);
  
    public List<Equipo> listar();
    public void modificar(Equipo equipo, int codigo);
    public void eliminar(int codigo);
    
    public Equipo buscarPorCodigo(int codigo);
    public void almacenarArchivo(Equipo equipo, String ruta);

    public List<Equipo> recuperarArchivo(String ruta);


    
}
