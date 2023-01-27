/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadradotriangulo;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author sebas
 */
public class PanelPaintPrincipal extends JFrame{
    
    private PanelPaintCuadrado panelPaint;
    
    
    public PanelPaintPrincipal(){
        this.setSize(1000,600);
        this.setLocation(100, 100);
        this.setTitle("Paint 1");
        this.panelPaint=new PanelPaintCuadrado();
        this.panelPaint.setBackground(Color.white);
        this.setContentPane(this.panelPaint);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    public static void main(String[] args) {
        new PanelPaintPrincipal();
    }
    
}
