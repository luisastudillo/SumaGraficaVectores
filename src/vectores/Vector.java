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
    private Point puntoFinal;

    public Vector(int id, Point puntoFinal) {
        this.id = id;
        this.puntoFinal = puntoFinal;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public Point getPuntoFinal() {
        return puntoFinal;
    }

    public void setPuntoFinal(Point puntoFinal) {
        this.puntoFinal = puntoFinal;
    }
    
    
    
}
