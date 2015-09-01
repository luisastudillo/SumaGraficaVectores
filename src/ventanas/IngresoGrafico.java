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
public class IngresoGrafico extends JFrame{
    
    public static JLabel fondo = new JLabel();
    
    Fondo panelFondo;
    JLabel resultante;
    JLabel ingGrafico;
    JTextField resultado;
    JButton btnBorrar;
    JButton btnRegresar;
    JButton btnLimpiar;
        
    public IngresoGrafico() { 
        super("Ingreso Gráfico");
        this.setSize(850, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        this.setLayout(null);
          
        panelFondo = new Fondo();
        panelFondo.setBounds(0, 0, 850, 700);
        panelFondo.setLayout(null);   
                                 
        ingGrafico = new JLabel();
        ingGrafico.setText("Ingrese gráficamente las coordenadas");
        ingGrafico.setBounds(215, 30, 420, 40);
        ingGrafico.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 24)); 
	ingGrafico.setForeground(Color.black); //Pone color a las letras 
        panelFondo.add(ingGrafico);
        
        btnBorrar = new JButton();
        btnBorrar.setBounds(610, 120, 150, 70);
        Icon imgLabel1 = new ImageIcon(getClass().
                getResource("/imagenes/borrar2.png"));
        btnBorrar.setIcon(imgLabel1);
        btnBorrar.setBorderPainted(false); 
        btnBorrar.setContentAreaFilled(false);
        panelFondo.add(btnBorrar);
        
        btnRegresar = new JButton();
        btnRegresar.setBounds(611, 245, 150, 75);
        Icon imgLabel2 = new ImageIcon(getClass().
                getResource("/imagenes/regresar2.png"));
        btnRegresar.setIcon(imgLabel2);
        btnRegresar.setBorderPainted(false); 
        btnRegresar.setContentAreaFilled(false);
        panelFondo.add(btnRegresar);
        
        btnLimpiar = new JButton();
        btnLimpiar.setBounds(612, 370, 150, 75);
        Icon imgLabel3 = new ImageIcon(getClass().
                getResource("/imagenes/limpiar.png"));
        btnLimpiar.setIcon(imgLabel3);
        btnLimpiar.setBorderPainted(false); 
        btnLimpiar.setContentAreaFilled(false);
        panelFondo.add(btnLimpiar);
        
        resultante = new JLabel();
        resultante.setText("Vector Resultante:");
        resultante.setBounds(575, 510, 160, 40);
        resultante.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15)); 
        panelFondo.add(resultante);
        
        resultado = new JTextField();
        resultado.setText("");
        resultado.setBounds(720, 516, 80, 27);
        resultado.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15)); 
        panelFondo.add(resultado);
        
        this.add(panelFondo);
        this.setVisible(true);     
    }            
}