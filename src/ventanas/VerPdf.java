/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author USUARIO
 */
public class VerPdf extends JFrame{
    
    public static JLabel fondo = new JLabel();
    JFrame esta;
    JFrame anterior;    
    Fondo panelFondo;
    JButton btnRegresar;
    
    public VerPdf(JFrame anterior){
        super("Menú de Ejercicios Resueltos");
        this.anterior = anterior;
        esta = this;
        this.setSize(850, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        this.setLayout(null);
        
        panelFondo = new Fondo();
        panelFondo.setBounds(0, 0, 850, 700);
        panelFondo.setLayout(null);   
        
        btnRegresar = new JButton();
        btnRegresar.setBounds(40, 565, 80, 70);
        Icon imgLabel = new ImageIcon(getClass().
                getResource("/imagenes/regresar.png"));
        btnRegresar.setIcon(imgLabel);
        btnRegresar.setBorderPainted(false); 
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                anterior.setVisible(true);
                esta.dispose();
            }
        });
        panelFondo.add(btnRegresar);
        
        this.add(panelFondo);
        this.setVisible(true);     
    }
    
}
