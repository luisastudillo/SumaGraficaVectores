/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.awt.Point;

/**
 *
 * @author User
 */
public class Vector {
    
    private int id;
    private Point puntoInicial, puntoFinal;

    public Vector(int id, Point puntoInicial, Point puntoFinal) {
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
