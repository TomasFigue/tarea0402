/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_03_1.vista;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sebas
 */
public class Ventana_tarea2 extends JFrame{
    private List<JPanel> jPanelList;
    public List<JButton> jButtonList;
    
    public Ventana_tarea2(String title) throws HeadlessException {
        super(title);
        this.setSize(300, 200);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPanels();
        //this.iniciarJTextFields();
        this.iniciarJButtons();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }
    
    public void iniciarPanels() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());


        this.jPanelList.get(0).setBackground(Color.lightGray);
        this.jPanelList.get(1).setBackground(Color.lightGray);
        this.jPanelList.get(2).setBackground(Color.lightGray);
        this.jPanelList.get(3).setBackground(Color.lightGray);
        this.jPanelList.get(4).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(5).setBackground(Color.lightGray);
        this.jPanelList.get(6).setBackground(Color.lightGray);
    
}}
