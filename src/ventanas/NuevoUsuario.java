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
public class NuevoUsuario extends JFrame{
    
    public static JLabel fondo = new JLabel();
    
    Fondo panelFondo;
    JLabel ingDatos;
    JLabel nombre;
    JLabel cedula;
    JLabel contrasena;
    JLabel tipoUsu;
    JTextField ingNombre;
    JTextField ingCedula;
    JTextField ingContrasena;
    JButton btnBorrar;
    JButton btnEnviar;
    
    public NuevoUsuario() { 
        super("Creación de un Nuevo Usuario");
        this.setSize(850, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        this.setLayout(null);
       
        panelFondo = new Fondo();
        panelFondo.setBounds(0, 0, 850, 700);
        panelFondo.setLayout(null);
        
        ingDatos = new JLabel();
        ingDatos.setText("INGRESE SUS DATOS");
        ingDatos.setBounds(250, 70, 300, 40);
        ingDatos.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30)); //Tipo y tamaño de letra
	ingDatos.setForeground(Color.pink); //Pone color a las letras 
        panelFondo.add(ingDatos);
               
        nombre = new JLabel();
        nombre.setBounds(220, 160, 100, 30);
        nombre.setText("Nombre:");
        panelFondo.add(nombre); 
                
        cedula = new JLabel();
        cedula.setBounds(220, 220, 100, 30);
        cedula.setText("Cédula:");
        panelFondo.add(cedula);
        
        contrasena = new JLabel();
        contrasena.setBounds(220, 280, 100, 30);
        contrasena.setText("Contraseña:");
        panelFondo.add(contrasena);
        
        tipoUsu = new JLabel();
        tipoUsu.setBounds(220, 340, 100, 30);
        tipoUsu.setText("Tipo de Usuario:");
        panelFondo.add(tipoUsu);
        
        ingNombre = new JTextField();
        ingNombre.setBounds(400, 160, 130, 30);
        ingNombre.setText(" ");
        panelFondo.add(ingNombre);
        
        ingCedula = new JTextField();
        ingCedula.setBounds(400, 220, 130, 30);
        ingCedula.setText(" ");
        panelFondo.add(ingCedula);
        
        ingContrasena = new JTextField();
        ingContrasena.setBounds(400, 280, 130, 30);
        ingContrasena.setText(" ");
        panelFondo.add(ingContrasena);        
                
        btnBorrar = new JButton();
        btnBorrar.setBounds(250, 550, 70, 70);
        Icon imgLabel = new ImageIcon(getClass().
                getResource("/imagenes/borrar.png"));
        btnBorrar.setIcon(imgLabel);
        btnBorrar.setBorderPainted(false); //Desaparece el borde del botón
        btnBorrar.setContentAreaFilled(false);
        panelFondo.add(btnBorrar);
        
        btnEnviar = new JButton();
        btnEnviar.setBounds(450, 550, 70, 70);
        Icon imgLabel1 = new ImageIcon(getClass().
                getResource("/imagenes/guardar.png"));
        btnEnviar.setIcon(imgLabel1);
        btnEnviar.setBorderPainted(false); //Desaparece el borde del botón
        btnEnviar.setContentAreaFilled(false);
        panelFondo.add(btnEnviar);       
        
        this.add(panelFondo);
        this.setVisible(true);     
    }       
}