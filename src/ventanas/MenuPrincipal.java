package ventanas;

import java.awt.Color;
import java.awt.Font;
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
        menu.setBounds(250, 50, 390, 40);
        menu.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40)); //Tipo y tamaño de letra
	menu.setForeground(Color.yellow); //Pone color a las letras 
        panelFondo.add(menu);
        
        btnTeoria = new JButton();
        btnTeoria.setBounds(300, 100, 190, 40);
        btnTeoria.setText("FUNDAMENTOS TEÓRICOS");
        panelFondo.add(btnTeoria);
        
        btnEjerResueltos = new JButton();
        btnEjerResueltos.setBounds(300, 160, 190, 40);
        btnEjerResueltos.setText("EJERCICIOS RESUELTOS");
        panelFondo.add(btnEjerResueltos);
        
        btnEjerPropuestos = new JButton();
        btnEjerPropuestos.setBounds(300, 220, 190, 40);
        btnEjerPropuestos.setText("EJERCICIOS PROPUESTOS");
        panelFondo.add(btnEjerPropuestos);
        
        btnSumaVectores = new JButton();
        btnSumaVectores.setBounds(300, 280, 190, 40);
        btnSumaVectores.setText("SUMA DE VECTORES");
        panelFondo.add(btnSumaVectores);
        
        btnReportesUso = new JButton();
        btnReportesUso.setBounds(300, 340, 190, 40);
        btnReportesUso.setText("SUMA DE VECTORES");
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