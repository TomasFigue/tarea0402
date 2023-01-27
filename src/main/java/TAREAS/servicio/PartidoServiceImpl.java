/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.servicio;

import TAREAS.modelo.Partido;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sebas
 */
public class PartidoServiceImpl implements PartidoService{
    
    private static List<Partido> partidoList= new ArrayList<>();
    
    @Override
    public void crear(Partido partido) {
        this.partidoList.add(partido);
        this.almacenarArchivo(partido, "C:/Netbeans1/partido.dat");
    }

    @Override
    public List<Partido> listar() {
        return this.partidoList;
    }

    @Override
    public Partido buscarPorCodigo(int codigo) {
        Partido retorno=null;
        for(var partido:this.partidoList){
            if(codigo==partido.getCodigo()){
                retorno=partido;
                break;
            }
        }
        return retorno;
    }

    @Override
    public void modificar(Partido partido, int codigo) {
        var indice = -1;
        for (var partidos : this.partidoList) {
            indice++;
            if (codigo == partido.getCodigo()) {
                this.partidoList.set(indice, partido);

            }

        }
    }

    @Override
     public void eliminar(int codigo) {
        var indice = -1;
        for (var partido : this.partidoList) {
            indice++;
            if (codigo == partido.getCodigo()) {
                this.partidoList.remove(indice);

            }

        }
    }

    @Override
    public void almacenarArchivo(Partido partido, String ruta) {
    ObjectOutputStream salida = null;

        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta, true));
            salida.writeObject(partido);
            salida.close();

        } catch (Exception ex) {
            Logger.getLogger(PartidoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }

    @Override
    public List<Partido> recuperarArchivo(String ruta) {
    var viajeList = new ArrayList<Partido>();

        ObjectInputStream entrada = null;
        try {
            var fis = new FileInputStream(new File(ruta));
            while (fis.available() > 0) {
                entrada = new ObjectInputStream(fis);
                Partido partido = (Partido) entrada.readObject();
                viajeList.add(partido);
            }
            entrada.close();
        } catch (Exception ex) {
            try {
                entrada.close();

            } catch (IOException ex1) {
                Logger.getLogger(PartidoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        return viajeList;
    }
    
    public List<Partido> getPartidoList() {
        return partidoList;
    }

    public void setPartidoList(List<Partido> partidoList) {
        PartidoServiceImpl.partidoList = partidoList;
    }

}
