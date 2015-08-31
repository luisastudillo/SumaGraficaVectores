/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JFrame;
import vectoresGraficos.PanelVectores;

/**
 *
 * @author USUARIO
 */
public class VentanaSumaVectoresCoordenadas extends JFrame{

    public VentanaSumaVectoresCoordenadas() {
        super("Suma de Vectores");
        this.setLayout(null);
        PanelVectores canvas = new PanelVectores();
        this.setSize(800, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(canvas);
        this.setVisible(true);        
    }
    
}
