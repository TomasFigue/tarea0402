/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.servicio;

import TAREAS.modelo.Equipo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
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
public class EquipoServiceImpl implements EquipoService {

    private static List<Equipo> equipoList = new ArrayList<>();

    @Override
    public void crear(Equipo equipo) {
        
        this.equipoList.add(equipo);
        this.almacenarArchivo(equipo, "C:/Netbeans1/equipo.dat");

        
        

    }

    @Override
    public List<Equipo> listar() {
        return this.equipoList;
    }

    @Override
    public Equipo buscarPorCodigo(int codigo) {
        Equipo retorno = null;
        for (var equipo : this.equipoList) {
            if (codigo == equipo.getCodigo()) {
                retorno = equipo;
                break;
            }
        }
        return retorno;
    }

    @Override
    public void modificar(Equipo equipo, int codigo) {
        var indice = -1;
        for (var equipos : this.equipoList) {
            indice++;
            if (codigo == equipo.getCodigo()) {
                this.equipoList.set(indice, equipo);

            }

        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var equipo : this.equipoList) {
            indice++;
            if (codigo == equipo.getCodigo()) {
                this.equipoList.remove(indice);

            }

        }
    }

    @Override
    public void almacenarArchivo(Equipo equipo, String ruta) {

        ObjectOutputStream salida = null;

        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta, true));
            salida.writeObject(equipo);
            salida.close();

        } catch (Exception ex) {
            Logger.getLogger(EquipoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Equipo> recuperarArchivo(String ruta) {

        var equipoList = new ArrayList<Equipo>();

        ObjectInputStream entrada = null;

        try {
            var fis = new FileInputStream(new File(ruta));
            while (fis.available() > 0) {
                entrada = new ObjectInputStream(fis);
                Equipo equipo = (Equipo) entrada.readObject();
                equipoList.add(equipo);
            }
            entrada.close();
        } catch (Exception ex) {
            try {
                entrada.close();

            } catch (IOException ex1) {
                Logger.getLogger(EquipoServiceImpl.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        return equipoList;

    }

    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        EquipoServiceImpl.equipoList = equipoList;
    }

  
}
