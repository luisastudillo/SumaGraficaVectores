/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresGraficos;

import java.awt.Point;
import java.util.Random;

/**
 *
 * @author USUARIO
 */
public class VectorGrafico {
    
    private int id;
    private int[] color  = new int[3];
    private Point puntoInicial, puntoFinal, pFlecha1, pFlecha2;
        
    public VectorGrafico(int id, Point puntoInicial, Point puntoFinal){
        
        this.id = id;
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
        this.color = generarColor();
        puntosFlecha();
    }
    
    private void puntosFlecha() {
        double ang = 0.0, angSep = 0.0;
        double tx, ty;
        int dist = 0;
       
        /* (la coordenadas de la ventana es al revez)
         calculo de la variacion de "x" y "y" para hallar el angulo
         **/

        ty = -(puntoInicial.y - puntoFinal.y) * 1.0;
        tx = (puntoInicial.x - puntoFinal.x) * 1.0;
        //angulo
        ang = Math.atan(ty / tx);

        if (tx < 0) {// si tx es negativo aumentar 180 grados
            ang += Math.PI;
        }

        //puntos de control para la punta
        //p1 y p2 son los puntos de salida
        //Point p1 = new Point(), p2 = new Point(), punto = puntoFinal;

        //angulo de separacion
        angSep = 25.0;

        pFlecha1.x = (int) (puntoFinal.x + dist * Math.cos(ang - Math.toRadians(angSep)));
        pFlecha1.y = (int) (puntoFinal.y - dist * Math.sin(ang - Math.toRadians(angSep)));
        pFlecha2.x = (int) (puntoFinal.x + dist * Math.cos(ang + Math.toRadians(angSep)));
        pFlecha2.y = (int) (puntoFinal.y - dist * Math.sin(ang + Math.toRadians(angSep)));

    }
            
    private int[] generarColor(){
        int[] retorno = new int[3];
        Random r = new Random();
        retorno[0] = r.nextInt(256);
        retorno[1] = r.nextInt(256);
        retorno[2] = r.nextInt(256);
        return retorno;
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
