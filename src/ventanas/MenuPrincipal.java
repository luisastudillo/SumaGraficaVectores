package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author HP USER
 */
public class MenuPrincipal extends JFrame{    
    public static JLabel fondo = new JLabel();
    
    Fondo panelFondo;
    JFrame esta = this;
    JLabel menu;
    JButton btnTeoria;
    JButton btnEjerResueltos;
    JButton btnEjerPropuestos;
    JButton btnSumaVectores;
    JButton btnReportesUso;
    JButton btnRegresar;
    
    public MenuPrincipal() { 
        super("Menú Principal");
        this.setSize(850, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        this.setLayout(null);
       
        panelFondo = new Fondo();
        panelFondo.setBounds(0, 0, 850, 700);
        panelFondo.setLayout(null);   
        
        menu = new JLabel();
        menu.setText("MENÚ PRINCIPAL");
        menu.setBounds(280, 50, 390, 40);
        menu.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30)); //Tipo y tamaño de letra
	menu.setForeground(Color.BLUE); //Pone color a las letras 
        panelFondo.add(menu);
        
        btnTeoria = new JButton();
        btnTeoria.setBounds(260, 140, 280, 40);
        btnTeoria.setText("FUNDAMENTOS TEÓRICOS");
        btnTeoria.setFont(new Font("Sakkal Majalla", Font.BOLD, 24));
        btnTeoria.setBorderPainted(false); //Desaparece el borde del botón
        btnTeoria.setContentAreaFilled(false);
        panelFondo.add(btnTeoria);
        
        btnEjerResueltos = new JButton();
        btnEjerResueltos.setBounds(251, 200, 270, 40);
        btnEjerResueltos.setText("EJERCICIOS RESUELTOS");
        btnEjerResueltos.setFont(new Font("Sakkal Majalla", Font.BOLD, 24));
        btnEjerResueltos.setBorderPainted(false); //Desaparece el borde del botón
        btnEjerResueltos.setContentAreaFilled(false);
        panelFondo.add(btnEjerResueltos);
        
        btnEjerPropuestos = new JButton();
        btnEjerPropuestos.setBounds(256, 260, 280, 40);
        btnEjerPropuestos.setText("EJERCICIOS PROPUESTOS");
        btnEjerPropuestos.setFont(new Font("Sakkal Majalla", Font.BOLD, 24));
        btnEjerPropuestos.setBorderPainted(false); //Desaparece el borde del botón
        btnEjerPropuestos.setContentAreaFilled(false);
        panelFondo.add(btnEjerPropuestos);
        
        btnSumaVectores = new JButton();
        btnSumaVectores.setBounds(262, 320, 230, 40);
        btnSumaVectores.setText("SUMA DE VECTORES");
        btnSumaVectores.setFont(new Font("Sakkal Majalla", Font.BOLD, 24));
        btnSumaVectores.setBorderPainted(false); //Desaparece el borde del botón
        btnSumaVectores.setContentAreaFilled(false);
        btnSumaVectores.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SumaVectores ventana = new SumaVectores(esta);
                esta.setVisible(false);
                ventana.setVisible(true);
            }
        });
        panelFondo.add(btnSumaVectores);
        
        btnReportesUso = new JButton();
        btnReportesUso.setBounds(256, 380, 230, 40);
        btnReportesUso.setText("REPORTES DE USO");
        btnReportesUso.setFont(new Font("Sakkal Majalla", Font.BOLD, 24));
        btnReportesUso.setBorderPainted(false); //Desaparece el borde del botón
        btnReportesUso.setContentAreaFilled(false);
        panelFondo.add(btnReportesUso);
        
        btnRegresar = new JButton();
        btnRegresar.setBounds(55, 550, 80, 70);
        Icon imgLabel = new ImageIcon(getClass().
                getResource("/imagenes/regresar.png"));
        btnRegresar.setIcon(imgLabel);
        btnRegresar.setBorderPainted(false); //Desaparece el borde del botón
        btnRegresar.setContentAreaFilled(false);
        panelFondo.add(btnRegresar);
        
        this.add(panelFondo);
        this.setVisible(true);     
    }      
}