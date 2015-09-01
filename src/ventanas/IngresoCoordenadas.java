package ventanas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import vectoresGraficos.PanelVectores;

/**
 *
 * @author HP USER
 */
public class IngresoCoordenadas extends JFrame{
    
    public static JLabel fondo = new JLabel();
    
    Fondo panelFondo;
    PanelVectores panel;
    JLabel coordenadas;
    JLabel coorX;
    JLabel coorY;
    JLabel resultante;
    JTextField resultado;
    JTextField ingCoorX;
    JTextField ingCoorY;
    JButton btnTeoria;
    JButton btnEjerResueltos;
    JButton btnEjerPropuestos;
    JButton btnSumaVectores;
    JButton btnReportesUso;
    JButton btnAgregar;
    JButton btnBorrar;
    JButton btnRegresar;
    JButton btnLimpiar;
        
    public IngresoCoordenadas() { 
        super("Ingreso por Coordenadas");
        this.setSize(850, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        this.setLayout(null);
       
        panel = new PanelVectores();
        panel.setBounds(0, 0, 700, 650);
        
        panelFondo = new Fondo();
        panelFondo.setBounds(0, 0, 850, 700);
        panelFondo.setLayout(null);   
        
        coordenadas = new JLabel();
        coordenadas.setText("Ingrese las coordenadas");
        coordenadas.setBounds(575, 20, 300, 40);
        coordenadas.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20)); 
	coordenadas.setForeground(Color.black); //Pone color a las letras 
        panelFondo.add(coordenadas);
        
        coorX = new JLabel();
        coorX.setText("X");
        coorX.setBounds(590, 75, 20, 40);
        coorX.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18)); 
        panelFondo.add(coorX);
        
        coorY = new JLabel();
        coorY.setText("Y");
        coorY.setBounds(700, 75, 20, 40);
        coorY.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18)); 
        panelFondo.add(coorY);
        
        ingCoorX = new JTextField();
        ingCoorX.setText("");
        ingCoorX.setBounds(612, 85, 45, 25);
        panelFondo.add(ingCoorX);
        
        ingCoorY = new JTextField();
        ingCoorY.setText("");
        ingCoorY.setBounds(722, 85, 45, 25);
        panelFondo.add(ingCoorY);
              
        btnAgregar = new JButton();
        btnAgregar.setBounds(613, 155, 150, 70);
        Icon imgLabel = new ImageIcon(getClass().
                getResource("/imagenes/agregar.png"));
        btnAgregar.setIcon(imgLabel);
        btnAgregar.setBorderPainted(false); //Desaparece el borde del botón
        btnAgregar.setContentAreaFilled(false);
        panelFondo.add(btnAgregar);
        
        btnBorrar = new JButton();
        btnBorrar.setBounds(613, 237, 150, 70);
        Icon imgLabel1 = new ImageIcon(getClass().
                getResource("/imagenes/borrar2.png"));
        btnBorrar.setIcon(imgLabel1);
        btnBorrar.setBorderPainted(false); 
        btnBorrar.setContentAreaFilled(false);
        panelFondo.add(btnBorrar);
        
        btnRegresar = new JButton();
        btnRegresar.setBounds(614, 318, 150, 75);
        Icon imgLabel2 = new ImageIcon(getClass().
                getResource("/imagenes/regresar2.png"));
        btnRegresar.setIcon(imgLabel2);
        btnRegresar.setBorderPainted(false); 
        btnRegresar.setContentAreaFilled(false);
        panelFondo.add(btnRegresar);
        
        btnLimpiar = new JButton();
        btnLimpiar.setBounds(614, 388, 150, 75);
        Icon imgLabel3 = new ImageIcon(getClass().
                getResource("/imagenes/limpiar.png"));
        btnLimpiar.setIcon(imgLabel3);
        btnLimpiar.setBorderPainted(false); 
        btnLimpiar.setContentAreaFilled(false);
        panelFondo.add(btnLimpiar);
        
        resultante = new JLabel();
        resultante.setText("Vector Resultante:");
        resultante.setBounds(575, 490, 160, 40);
        resultante.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15)); 
        panelFondo.add(resultante);
        
        resultado = new JTextField();
        resultado.setText("");
        resultado.setBounds(720, 494, 80, 27);
        resultado.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15)); 
        panelFondo.add(resultado);
        
        this.add(panelFondo);
        this.add(panel);
        this.setVisible(true);     
    }         
}