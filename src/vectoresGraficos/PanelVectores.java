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
import vectores.ManejoVectores;

/**
 *
 * @author User
 */
public class PanelVectores extends Canvas{
    
    ManejoVectores manejadorVectores;

    public PanelVectores() {
        this.setSize(800, 800);
        manejadorVectores = new ManejoVectores();
//        manejadorVectores.agregarVector(new Point(10, 80));
    }
    
    
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3.5f));

        if (manejadorVectores.getId() > 0) {

            for (VectorGrafico vector : manejadorVectores.getListaVectoresGraficos()) {
                g2.setColor(vector.getColor());
                //Grafico el vector
                g2.drawLine(vector.getPuntoInicial().x, vector.getPuntoInicial().y, vector.getPuntoFinal().x, vector.getPuntoFinal().y);
                //Grafico las saetas
                g2.drawLine(vector.getPuntoFinal().x, vector.getPuntoFinal().y, vector.getpFlecha1().x, vector.getpFlecha1().y);
                g2.drawLine(vector.getPuntoFinal().x, vector.getPuntoFinal().y, vector.getpFlecha2().x, vector.getpFlecha2().y);
            }

        }
        g2.setColor(Color.RED);
        VectorGrafico vector = manejadorVectores.getTemporal();
        g2.drawLine(vector.getPuntoInicial().x, vector.getPuntoInicial().y, vector.getPuntoFinal().x, vector.getPuntoFinal().y);
        //Grafico las saetas
        g2.drawLine(vector.getPuntoFinal().x, vector.getPuntoFinal().y, vector.getpFlecha1().x, vector.getpFlecha1().y);
        g2.drawLine(vector.getPuntoFinal().x, vector.getPuntoFinal().y, vector.getpFlecha2().x, vector.getpFlecha2().y);

        g2.setStroke(new BasicStroke(3.5f));
        g2.drawRect(0, 0, 700, 650);
        g2.fillOval(346, 321, 5, 5);

    }

    public ManejoVectores getManejadorVectores() {
        return manejadorVectores;
    }
    
    
    
}
