package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import vectores.ManejoVectores;
import vectoresGraficos.PanelVectores;

/**
 *
 * @author HP USER
 */
public class IngresoGrafico extends JFrame{
    
    public static JLabel fondo = new JLabel();
    JFrame esta;
    JFrame anterior;
    Fondo panelFondo;
    PanelVectores panel;
    JLabel resultante;
    JLabel ingGrafico;
    JTextField resultado;
    JButton btnBorrar;
    JButton btnRegresar;
    JButton btnLimpiar;
        
    public IngresoGrafico(JFrame anterior) { 
        super("Ingreso Gráfico");
        this.anterior = anterior;
        esta = this;
        
        this.setSize(980, 730);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        this.setLayout(null);
          
        panelFondo = new Fondo();
        panelFondo.setBounds(0, 0, 980, 800);
        panelFondo.setLayout(null);   
        
        panel = new PanelVectores();
        panel.setBounds(0, 40, 700, 650);
        panel.getManejadorVectores().setTemporal(null);
        Listener listener = new Listener();
        panel.addMouseListener(listener);
        panel.addMouseMotionListener(listener);
        panelFondo.add(panel);
        
        ingGrafico = new JLabel();
        ingGrafico.setText("Ingrese gráficamente las coordenadas");
        ingGrafico.setBounds(215, 5, 420, 40);
        ingGrafico.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 24)); 
	ingGrafico.setForeground(Color.black); //Pone color a las letras 
        panelFondo.add(ingGrafico);
        
        btnBorrar = new JButton();
        btnBorrar.setBounds(760, 120, 150, 70);
        Icon imgLabel1 = new ImageIcon(getClass().
                getResource("/imagenes/borrar2.png"));
        btnBorrar.setIcon(imgLabel1);
        btnBorrar.setBorderPainted(false); 
        btnBorrar.setContentAreaFilled(false);
        panelFondo.add(btnBorrar);
        
        btnRegresar = new JButton();
        btnRegresar.setBounds(761, 245, 150, 75);
        Icon imgLabel2 = new ImageIcon(getClass().
                getResource("/imagenes/regresar2.png"));
        btnRegresar.setIcon(imgLabel2);
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
        
        btnLimpiar = new JButton();
        btnLimpiar.setBounds(762, 370, 150, 75);
        Icon imgLabel3 = new ImageIcon(getClass().
                getResource("/imagenes/limpiar.png"));
        btnLimpiar.setIcon(imgLabel3);
        btnLimpiar.setBorderPainted(false); 
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setManejadorVectores(new ManejoVectores());
                panel.repaint();
            }
        });
        panelFondo.add(btnLimpiar);
        
        resultante = new JLabel();
        resultante.setText("Vector Resultante:");
        resultante.setBounds(725, 510, 160, 40);
        resultante.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15)); 
        panelFondo.add(resultante);
        
        resultado = new JTextField();
        resultado.setText("");
        resultado.setBounds(870, 516, 80, 27);
        resultado.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 15)); 
        resultado.setEditable(false);
        panelFondo.add(resultado);
        
        this.add(panelFondo);
        this.setVisible(true);     
    }      
    
    private class Listener extends MouseAdapter{
            @Override
            public void mouseMoved(MouseEvent event) {
                Point nuevo = new Point(event.getX(), event.getY());
                panel.getManejadorVectores().actualizarTemporal(nuevo);
                panel.repaint();
            }
            
            @Override
            public void mouseClicked(MouseEvent event){
                Point punto = new Point(event.getX(), event.getY());
                System.out.println(punto);
                punto = panel.getManejadorVectores().transformarALogicas(punto);               
                System.out.println(punto);
                panel.getManejadorVectores().agregarVector(punto);
                resultado.setText(panel.getManejadorVectores().resultante());
                panel.repaint();
            }
    }
    
}