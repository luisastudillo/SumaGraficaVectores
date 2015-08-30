/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresGraficos;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import vectores.ManejoVectores;

/**
 *
 * @author User
 */
public class PanelVectores extends Canvas{
    
    ManejoVectores manejadorVectores;

    public PanelVectores() {
        manejadorVectores = new ManejoVectores();
        manejadorVectores.agregarVector(new Point(50, 50));
        manejadorVectores.agregarVector(new Point(50, 200));
        manejadorVectores.agregarVector(new Point(10, 80));
    }
    
    
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (VectorGrafico vector : manejadorVectores.getListaVectoresGraficos()) {
            g2.setColor(vector.getColor());
            g2.setStroke(new BasicStroke(3.5f));
            //Grafico el vector
            g2.drawLine(vector.getPuntoInicial().x, vector.getPuntoInicial().y, vector.getPuntoFinal().x, vector.getPuntoFinal().y);
            //Grafico las saetas
            g2.drawLine(vector.getPuntoFinal().x, vector.getPuntoFinal().y, vector.getpFlecha1().x, vector.getpFlecha1().y);
            g2.drawLine(vector.getPuntoFinal().x, vector.getPuntoFinal().y, vector.getpFlecha2().x, vector.getpFlecha2().y);
        }
    }    
    
}
