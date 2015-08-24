/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresGraficos;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class MiCanvas extends Canvas{
    
    @Override
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        VectorGrafico vector = new VectorGrafico( 1, new Point(40, 40), new Point(100, 100));
        g2.setColor(vector.getColor());
        g2.setStroke(new BasicStroke(3.5f));
        g2.drawLine(vector.getPuntoInicial().x, vector.getPuntoInicial().y, vector.getPuntoFinal().x, vector.getPuntoFinal().y);
        g2.drawLine(vector.getPuntoFinal().x, vector.getPuntoFinal().y, vector.getpFlecha1().x, vector.getpFlecha1().y);
        g2.drawLine(vector.getPuntoFinal().x, vector.getPuntoFinal().y, vector.getpFlecha2().x, vector.getpFlecha2().y);
        
    }
    
    public static void main(String[] args){
        MiCanvas canvas = new MiCanvas();
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Here we add it to the frame
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
        
        
    }
    
}
