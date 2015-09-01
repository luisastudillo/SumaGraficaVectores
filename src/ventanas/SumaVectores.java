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

/**
 *
 * @author HP USER
 */
public class SumaVectores extends JFrame{
    
    public static JLabel fondo = new JLabel();
    JFrame anterior;
    JFrame esta;
    Fondo panelFondo;
    JLabel sumaVect;
    JLabel imgSumaVect;
    JButton btnIngGrafico;
    JButton btnIngCoor;
    JButton btnRegresar;
    
    public SumaVectores(JFrame anterior) { 
        super("Suma de Vectores");
        this.anterior = anterior;
        esta = this;
        
        this.setSize(850, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        this.setLayout(null);
       
        panelFondo = new Fondo();
        panelFondo.setBounds(0, 0, 850, 700);
        panelFondo.setLayout(null);   
        
        sumaVect = new JLabel();
        sumaVect.setText("SUMA DE VECTORES");
        sumaVect.setBounds(280, 60, 390, 40);
        sumaVect.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30)); //Tipo y tamaño de letra
	sumaVect.setForeground(Color.BLUE); //Pone color a las letras 
        panelFondo.add(sumaVect);
        
        btnIngGrafico = new JButton();
        btnIngGrafico.setBounds(250, 187, 280, 40);
        btnIngGrafico.setText("INGRESO GRÁFICO");
        btnIngGrafico.setFont(new Font("Sakkal Majalla", Font.BOLD, 30));
        btnIngGrafico.setBorderPainted(false); //Desaparece el borde del botón
        btnIngGrafico.setContentAreaFilled(false);
        btnIngGrafico.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                IngresoGrafico ventana = new IngresoGrafico(esta);
                ventana.setVisible(true);
                esta.setVisible(false);
            }
        });
        panelFondo.add(btnIngGrafico);
        
        btnIngCoor = new JButton();
        btnIngCoor.setBounds(262, 290, 380, 40);
        btnIngCoor.setText("INGRESO POR COORDENADAS");
        btnIngCoor.setFont(new Font("Sakkal Majalla", Font.BOLD, 30));
        btnIngCoor.setBorderPainted(false); 
        btnIngCoor.setContentAreaFilled(false);
        btnIngCoor.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                IngresoCoordenadas ventana = new IngresoCoordenadas(esta);
                ventana.setVisible(true);
                esta.setVisible(false);
            }
        });
        panelFondo.add(btnIngCoor);
        
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