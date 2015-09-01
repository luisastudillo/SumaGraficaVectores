package ventanas;

/**
 *
 * @author HP USER
 */

import Principal.Main;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
    
    public static JLabel fondo = new JLabel();
    
    JFrame este = this;
    Fondo panelFondo;
    JLabel sistema;
    JLabel usuario;
    JLabel contrasena;
    JTextField ingUsuario;
    JPasswordField ingContrasena;
    JButton btnIngresar;
    JButton btnNuevoUsuario;
    
    public Login() { 
        super("Login");
        this.setSize(850, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane();
        this.setLayout(null);
       
        panelFondo = new Fondo();
        panelFondo.setBounds(0, 0, 850, 700);
        panelFondo.setLayout(null);
        
        sistema = new JLabel();
        sistema.setText("INGRESO AL SISTEMA");
        sistema.setBounds(290, 70, 280, 40);
        sistema.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25)); //Tipo y tamaño de letra
	sistema.setForeground(Color.blue); //Pone color a las letras 
        panelFondo.add(sistema);
               
        usuario = new JLabel();
        usuario.setBounds(260, 190, 100, 100);
        usuario.setText("");
        Icon imgLabel = new ImageIcon(getClass().
                getResource("/imagenes/usuario1.png"));
        usuario.setIcon(imgLabel);
        panelFondo.add(usuario);
                
        contrasena = new JLabel();
        contrasena.setBounds(270, 310, 100, 100);
        contrasena.setText(" ");
        Icon imgLabel1 = new ImageIcon(getClass().
                getResource("/imagenes/contrasena.png"));
        contrasena.setIcon(imgLabel1);
        panelFondo.add(contrasena);
        
        ingUsuario = new JTextField();
        ingUsuario.setBounds(420, 230, 130, 30);
        ingUsuario.setText(" ");
        panelFondo.add(ingUsuario);
        
        ingContrasena = new JPasswordField();
        ingContrasena.setBounds(420, 340, 130, 30);
        ingContrasena.setText("");
        panelFondo.add(ingContrasena);
                
        btnIngresar = new JButton();
        btnIngresar.setBounds(250, 550, 110, 70);
        Icon imgLabel2 = new ImageIcon(getClass().
                getResource("/imagenes/ingresar.png"));
        btnIngresar.setIcon(imgLabel2);
        btnIngresar.setBorderPainted(false); //Desaparece el borde del botón
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario, contrasenia;
                usuario = ingUsuario.getText();
                System.out.println(usuario);
                contrasenia = ingContrasena.getText();
                System.out.println(usuario);
                if(usuario.equals("admin") && contrasenia.equals("secreta")){
                    MenuPrincipal menu = new MenuPrincipal();
                    menu.setVisible(true);
                    este.dispose();
                }
//                MenuPrincipal menu = new MenuPrincipal();
//                    menu.setVisible(true);
//                    este.dispose();
            }
        });
        
        panelFondo.add(btnIngresar);
              
        btnNuevoUsuario = new JButton();
        btnNuevoUsuario.setBounds(450, 550, 110, 75);
        Icon imgLabel3 = new ImageIcon(getClass().
                getResource("/imagenes/nuevoUsuario.png"));
        btnNuevoUsuario.setIcon(imgLabel3);
        btnNuevoUsuario.setBorderPainted(false); //Desaparece el borde del botón
        btnNuevoUsuario.setContentAreaFilled(false);
        panelFondo.add(btnNuevoUsuario);       
        
        this.add(panelFondo);
        this.setVisible(true);     
    }    
}