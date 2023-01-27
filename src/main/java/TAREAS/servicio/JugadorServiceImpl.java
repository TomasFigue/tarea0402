/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREAS.servicio;

import TAREAS.modelo.Jugador;
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
public class JugadorServiceImpl implements JugadorService {

    private static List<Jugador> jugadorList = new ArrayList<>();

    @Override
    public void crear(Jugador jugador) {
        this.jugadorList.add(jugador);
        this.almacenarArchivo(jugador, "C:/Netbeans1/jugador.dat");
    }

    @Override
    public List<Jugador> listar() {
        return this.jugadorList;
    }

    @Override
    public Jugador buscarPorCodigo(int codigo) {
        Jugador retorno = null;
        for (var jugador : this.jugadorList) {
            if (codigo == jugador.getCodigo()) {
                retorno = jugador;
                break;
            }
        }
        return retorno;
    }

    @Override
    public void modificar(Jugador jugador, int codigo) {
        var indice = -1;
        for (var jugadores : this.jugadorList) {
            indice++;
            if (codigo == jugador.getCodigo()) {
                this.jugadorList.set(indice, jugador);

            }

        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var jugador : this.jugadorList) {
            indice++;
            if (codigo == jugador.getCodigo()) {
                this.jugadorList.remove(indice);

            }

        }
    }

    @Override
    public void almacenarArchivo(Jugador jugador, String ruta) {
        ObjectOutputStream salida = null;

        try {
            salida = new ObjectOutputStream(new FileOutputStream(ruta, true));
            salida.writeObject(jugador);
            salida.close();

        } catch (Exception ex) {
            Logger.getLogger(JugadorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Jugador> recuperarArchivo(String ruta) {
        var jugadorList = new ArrayList<Jugador>();

        ObjectInputStream entrada = null;
        try {
            var fis = new FileInputStream(new File(ruta));
            while (fis.available() > 0) {
                entrada = new ObjectInputStream(fis);
                Jugador jugador = (Jugador) entrada.readObject();
                jugadorList.add(jugador);
            }
            entrada.close();
        } catch (Exception ex) {
            try {
                entrada.close();

            } catch (IOException ex1) {
                Logger.getLogger(JugadorServiceImpl.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        return jugadorList;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        JugadorServiceImpl.jugadorList = jugadorList;
    }

}
