package ventanas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
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
        ingDatos.setBounds(270, 70, 300, 40);
        ingDatos.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30)); //Tipo y tamaño de letra
	ingDatos.setForeground(Color.MAGENTA); //Pone color a las letras 
        panelFondo.add(ingDatos);
               
        nombre = new JLabel();
        nombre.setBounds(220, 170, 100, 30);
        nombre.setText("Nombre:");
        nombre.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 17)); //Tipo y tamaño de letra
        panelFondo.add(nombre); 
                
        cedula = new JLabel();
        cedula.setBounds(220, 230, 100, 30);
        cedula.setText("Cédula:");
        cedula.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 17));
        panelFondo.add(cedula);
        
        contrasena = new JLabel();
        contrasena.setBounds(220, 290, 150, 30);
        contrasena.setText("Contraseña:");
        contrasena.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 17));
        panelFondo.add(contrasena);
        
        tipoUsu = new JLabel();
        tipoUsu.setBounds(220, 365, 150, 30);
        tipoUsu.setText("Tipo de Usuario:");
        tipoUsu.setFont(new Font("Franklin Gothic Heavy", Font.BOLD, 17)); 
        panelFondo.add(tipoUsu);
        
        ingNombre = new JTextField();
        ingNombre.setBounds(400, 170, 200, 30);
        ingNombre.setText(" ");
        panelFondo.add(ingNombre);
        
        ingCedula = new JTextField();
        ingCedula.setBounds(400, 230, 200, 30);
        ingCedula.setText(" ");
        panelFondo.add(ingCedula);
        
        ingContrasena = new JTextField();
        ingContrasena.setBounds(400, 290, 200, 30);
        ingContrasena.setText(" ");
        panelFondo.add(ingContrasena); 
        
        
        JRadioButton rbtn1 = new JRadioButton("txt1",true);
        JRadioButton rbtn2 = new JRadioButton("txt2",true);
        
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(rbtn1);
        grupo1.add(rbtn2);
        
        rbtn1.setText("Docente");
        rbtn1.setBounds(400, 350, 200, 30);
        rbtn1.setSelected(true);

        rbtn2.setText("Estudiante");
        rbtn2.setBounds(400, 390, 200, 30);
        rbtn2.setSelected(true);

        panelFondo.add(rbtn1);  
        panelFondo.add(rbtn2);



                        
        btnBorrar = new JButton();
        btnBorrar.setBounds(250, 550, 70, 70);
        Icon imgLabel = new ImageIcon(getClass().
                getResource("/imagenes/borrar.png"));
        btnBorrar.setIcon(imgLabel);
        btnBorrar.setBorderPainted(false); //Desaparece el borde del botón
        btnBorrar.setContentAreaFilled(false);
        panelFondo.add(btnBorrar);
        
        btnEnviar = new JButton();
        btnEnviar.setBounds(450, 555, 70, 70);
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