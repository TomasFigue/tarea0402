/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TAREA_03_1.vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sebas
 */
public class Bandera extends JFrame {

    public List<JPanel> jPanelList;

    public Bandera(String title) throws HeadlessException {
        super(title);
        this.setSize(600, 300);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.inciarPanelesBandera();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void inciarPanelesBandera() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(1).setBackground(Color.WHITE);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBackground(Color.WHITE);

        this.jPanelList.get(6).setBackground(Color.red);
        this.jPanelList.get(7).setBackground(Color.white);
        this.jPanelList.get(8).setBackground(Color.blue);
        this.jPanelList.get(9).setBackground(Color.white);
        this.jPanelList.get(10).setBackground(Color.red);
        this.jPanelList.get(11).setBackground(Color.red);

        this.jPanelList.get(12).setBackground(Color.white);
        this.jPanelList.get(13).setBackground(Color.white);
        this.jPanelList.get(14).setBackground(Color.blue);
        this.jPanelList.get(15).setBackground(Color.white);
        this.jPanelList.get(16).setBackground(Color.white);
        this.jPanelList.get(17).setBackground(Color.white);

        this.jPanelList.get(18).setBackground(Color.blue);
        this.jPanelList.get(19).setBackground(Color.blue);
        this.jPanelList.get(20).setBackground(Color.blue);
        this.jPanelList.get(21).setBackground(Color.blue);
        this.jPanelList.get(22).setBackground(Color.blue);
        this.jPanelList.get(23).setBackground(Color.blue);

        this.jPanelList.get(24).setBackground(Color.white);
        this.jPanelList.get(25).setBackground(Color.white);
        this.jPanelList.get(26).setBackground(Color.blue);
        this.jPanelList.get(27).setBackground(Color.white);
        this.jPanelList.get(28).setBackground(Color.white);
        this.jPanelList.get(29).setBackground(Color.white);

        this.jPanelList.get(30).setBackground(Color.red);
        this.jPanelList.get(31).setBackground(Color.white);
        this.jPanelList.get(32).setBackground(Color.blue);
        this.jPanelList.get(33).setBackground(Color.white);
        this.jPanelList.get(34).setBackground(Color.red);
        this.jPanelList.get(35).setBackground(Color.red);

        this.jPanelList.get(0).setLayout(new GridLayout(5, 1));
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));

        this.jPanelList.get(1).setLayout(new GridLayout(1, 6));
        this.jPanelList.get(1).add(this.jPanelList.get(6));
        this.jPanelList.get(1).add(this.jPanelList.get(7));
        this.jPanelList.get(1).add(this.jPanelList.get(8));
        this.jPanelList.get(1).add(this.jPanelList.get(9));
        this.jPanelList.get(1).add(this.jPanelList.get(10));
        this.jPanelList.get(1).add(this.jPanelList.get(11));

        this.jPanelList.get(2).setLayout(new GridLayout(1, 6));
        this.jPanelList.get(2).add(this.jPanelList.get(12));
        this.jPanelList.get(2).add(this.jPanelList.get(13));
        this.jPanelList.get(2).add(this.jPanelList.get(14));
        this.jPanelList.get(2).add(this.jPanelList.get(15));
        this.jPanelList.get(2).add(this.jPanelList.get(16));
        this.jPanelList.get(2).add(this.jPanelList.get(17));

        this.jPanelList.get(3).setLayout(new GridLayout(1, 6));
        this.jPanelList.get(3).add(this.jPanelList.get(18));
        this.jPanelList.get(3).add(this.jPanelList.get(19));
        this.jPanelList.get(3).add(this.jPanelList.get(20));
        this.jPanelList.get(3).add(this.jPanelList.get(21));
        this.jPanelList.get(3).add(this.jPanelList.get(22));
        this.jPanelList.get(3).add(this.jPanelList.get(23));

        this.jPanelList.get(4).setLayout(new GridLayout(1, 6));
        this.jPanelList.get(4).add(this.jPanelList.get(24));
        this.jPanelList.get(4).add(this.jPanelList.get(25));
        this.jPanelList.get(4).add(this.jPanelList.get(26));
        this.jPanelList.get(4).add(this.jPanelList.get(27));
        this.jPanelList.get(4).add(this.jPanelList.get(28));
        this.jPanelList.get(4).add(this.jPanelList.get(29));
        

        this.jPanelList.get(5).setLayout(new GridLayout(1, 6));
        this.jPanelList.get(5).add(this.jPanelList.get(30));
        this.jPanelList.get(5).add(this.jPanelList.get(31));
        this.jPanelList.get(5).add(this.jPanelList.get(32));
        this.jPanelList.get(5).add(this.jPanelList.get(33));
        this.jPanelList.get(5).add(this.jPanelList.get(34));
        this.jPanelList.get(5).add(this.jPanelList.get(35));

        
    }
}
