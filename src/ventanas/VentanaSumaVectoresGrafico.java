/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import vectores.ManejoVectores;
import vectoresGraficos.PanelVectores;

/**
 *
 * @author USUARIO
 */
public class VentanaSumaVectoresGrafico extends JFrame{
    
    PanelVectores canvas = new PanelVectores();

    public VentanaSumaVectoresGrafico(){
        super("Suma de Vectores");
        
        canvas.setBounds(0, 0, 710, 660);
        Listener listener = new Listener();
        canvas.addMouseListener(listener);
        canvas.addMouseMotionListener(listener);

        this.setSize(850, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().add(canvas);
        this.setVisible(true);
    }
    
    
    private class Listener extends MouseAdapter{
            @Override
            public void mouseMoved(MouseEvent event) {
                Point nuevo = new Point(event.getX(), event.getY());
                canvas.getManejadorVectores().actualizarTemporal(nuevo);
                canvas.repaint();
            }
            
            @Override
            public void mouseClicked(MouseEvent event){
                Point punto = new Point(event.getX(), event.getY());
                System.out.println(punto);
                punto = canvas.getManejadorVectores().transformarALogicas(punto);               
                System.out.println(punto);
                canvas.getManejadorVectores().agregarVector(punto);                
                
            }
    }
    
    
    
    
}










