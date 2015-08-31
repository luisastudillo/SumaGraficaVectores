/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import vectores.ManejoVectores;
import vectoresGraficos.PanelVectores;

/**
 *
 * @author USUARIO
 */
public class VentanaSumaVectoresCoordenadas extends JFrame{
    
    JButton agregar = new JButton();
    JTextField x = new JTextField();
    JTextField y = new JTextField();
    PanelVectores canvas = new PanelVectores();

    public VentanaSumaVectoresCoordenadas() {
        super("Suma de Vectores");
        this.setLayout(null);
        
        canvas.setBounds(0, 0, 710, 660);
        
        x.setBounds(740, 50, 30, 20);
        y.setBounds(790, 50, 30, 20);
        agregar.setBounds(760, 100, 40, 20);
        
        agregar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Point p = new Point(Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
                canvas.getManejadorVectores().agregarVector(p);
                canvas.repaint();
            }
        });
        
        this.setSize(850, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().add(canvas);
        this.setVisible(true);
        
        this.add(x);
        this.add(y);
        this.add(agregar);
        
    
    }
    
    
    
}
