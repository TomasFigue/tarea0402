/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TAREAS.servicio;

import TAREAS.modelo.Jugador;
import java.util.List;

/**
 *
 * @author sebas
 */
public interface JugadorService {
    
    public void crear(Jugador jugador);
    public List<Jugador> listar();
    public void modificar(Jugador jugador, int codigo);
    public void eliminar(int codigo);
    
    public Jugador buscarPorCodigo(int codigo);
    public void almacenarArchivo(Jugador jugador, String ruta);

    public List<Jugador> recuperarArchivo(String ruta);
    
}
