/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author HP USER
 */
public class MenuEjerResueltos extends JFrame{
    
    public static JLabel fondo = new JLabel();
    
    Fondo panelFondo;
    JLabel sumaVect;
    JLabel imgSumaVect;
    JButton btnSumaGrafica1;
    JButton btnSumaGrafica2;
    JButton btnSumaGraficaN;
    JButton btnRegresar;
    
    public MenuEjerResueltos() { 
        super("Menú de Ejercicios Resueltos");
        this.setSize(850, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        this.setLayout(null);
       
        panelFondo = new Fondo();
        panelFondo.setBounds(0, 0, 850, 700);
        panelFondo.setLayout(null);   
        
        sumaVect = new JLabel();
        sumaVect.setText("EJERCICIOS RESUELTOS");
        sumaVect.setBounds(265, 60, 390, 40);
        sumaVect.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30)); //Tipo y tamaño de letra
	sumaVect.setForeground(Color.BLUE);  
        panelFondo.add(sumaVect);
        
        btnSumaGrafica1 = new JButton();
        btnSumaGrafica1.setBounds(200, 187, 420, 40);
        btnSumaGrafica1.setText("SUMA GRÁFICA DE DOS VECTORES");
        btnSumaGrafica1.setFont(new Font("Sakkal Majalla", Font.BOLD, 30));
        btnSumaGrafica1.setBorderPainted(false); 
        btnSumaGrafica1.setContentAreaFilled(false);
        panelFondo.add(btnSumaGrafica1);
        
        btnSumaGrafica2 = new JButton();
        btnSumaGrafica2.setBounds(200, 270, 420, 40);
        btnSumaGrafica2.setText("SUMA GRÁFICA DE TRES VECTORES");
        btnSumaGrafica2.setFont(new Font("Sakkal Majalla", Font.BOLD, 30));
        btnSumaGrafica2.setBorderPainted(false); 
        btnSumaGrafica2.setContentAreaFilled(false);
        panelFondo.add(btnSumaGrafica2);
        
        btnSumaGraficaN = new JButton();
        btnSumaGraficaN.setBounds(200, 350, 510, 40);
        btnSumaGraficaN.setText("SUMA GRÁFICA CON VECTORES NEGATIVOS");
        btnSumaGraficaN.setFont(new Font("Sakkal Majalla", Font.BOLD, 30));
        btnSumaGraficaN.setBorderPainted(false); 
        btnSumaGraficaN.setContentAreaFilled(false);
        panelFondo.add(btnSumaGraficaN);
        
        btnRegresar = new JButton();
        btnRegresar.setBounds(40, 565, 80, 70);
        Icon imgLabel = new ImageIcon(getClass().
                getResource("/imagenes/regresar.png"));
        btnRegresar.setIcon(imgLabel);
        btnRegresar.setBorderPainted(false); 
        btnRegresar.setContentAreaFilled(false);
        panelFondo.add(btnRegresar);
        
        imgSumaVect = new JLabel ();
        imgSumaVect.setBounds(550, 450, 300, 200);
        Icon imgLabel1 = new ImageIcon(getClass().
                getResource("/imagenes/sumaVectores.png"));
        imgSumaVect.setIcon(imgLabel1);
        panelFondo.add(imgSumaVect);
               
        this.add(panelFondo);
        this.setVisible(true);     
    }      
}