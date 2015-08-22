/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresGraficos;

import java.awt.Point;

/**
 *
 * @author USUARIO
 */
public class VectorGrafico {
    
    private int id;
    private int[] color  = new int[3];
    private Point puntoInicial, puntoFinal;
    
    
    public VectorGrafico(int id, Point puntoInicial, Point puntoFinal){
        
        this.id = id;
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
        
        
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getColor() {
        return color;
    }

    public void setColor(int r, int g, int b) {
        color[0] = r;
        color[1] = g;
        color[2] = b;
    }

    public Point getPuntoInicial() {
        return puntoInicial;
    }

    public void setPuntoInicial(Point puntoInicial) {
        this.puntoInicial = puntoInicial;
    }

    public Point getPuntoFinal() {
        return puntoFinal;
    }

    public void setPuntoFinal(Point puntoFinal) {
        this.puntoFinal = puntoFinal;
    }
    
    
    
}
