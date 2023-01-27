/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TAREAS.servicio;

import TAREAS.modelo.Partido;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface PartidoService {
    
    public void crear(Partido partido);
    public List<Partido> listar();
    public void modificar(Partido partido, int codigo);
    public void eliminar(int codigo);
    
    public Partido buscarPorCodigo(int codigo);
    
    public void almacenarArchivo(Partido partido, String ruta);

    public List<Partido> recuperarArchivo(String ruta);

    
}
