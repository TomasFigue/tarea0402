/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadradotriangulo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author sebas
 */
public class PanelpaintTriangulo extends JPanel implements MouseListener {

    public PanelpaintTriangulo() {
        this.addMouseListener(this);
    }

    private int x1 = -1;
    private int y1 = -1;
    private int x2 = 0;
    private int y2 = 0;
    private int x3 = 0;
    private int y3 = 0;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (x3 > 0) {
            var PuntosX = new int[3];
            PuntosX[0] = x1;
            PuntosX[1] = x2;
            PuntosX[2] = x3;
            var PuntosY = new int[3];
            PuntosY[0] = y1;
            PuntosY[1] = y2;
            PuntosY[2] = y3;

            g.drawPolygon(PuntosX, PuntosY, 3);

        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (x1 > 0) {
            if (x2 > 0) {
                x3 = e.getX();
                y3 = e.getY();
            } else {
                x2 = e.getX();
                y2 = e.getY();
            }
        } else {
            x1 = e.getX();
            y1 = e.getY();

        }
        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
