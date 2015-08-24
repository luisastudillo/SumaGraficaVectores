/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresGraficos;

import java.awt.Color;
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author USUARIO
 */
public class VectorGrafico {
    
    private int id;
    private Color color;
    private Point puntoInicial, puntoFinal, pFlecha1 , pFlecha2;
        
    public VectorGrafico(int id, Point puntoInicial, Point puntoFinal){
        
        this.id = id;
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
        this.color = generarColor();
        pFlecha1 = new Point();
        pFlecha2 = new Point();
        puntosFlecha();
    }
    
    private void puntosFlecha() {
        double ang = 0.0, angSep = 0.0;
        double tx, ty;
        int dist = 20;
       
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
        System.out.println("Coordenadas de flecha 1: " + pFlecha1.x + "," + pFlecha1.y);
        System.out.println("Coordenadas de flecha 2: " + pFlecha2.x + "," + pFlecha2.y);
    }
            
    private Color generarColor(){
        int[] retorno = new int[3];
        Random r = new Random();        
        Color color = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
        return color;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point getpFlecha1() {
        return pFlecha1;
    }

    public void setpFlecha1(Point pFlecha1) {
        this.pFlecha1 = pFlecha1;
    }

    public Point getpFlecha2() {
        return pFlecha2;
    }

    public void setpFlecha2(Point pFlecha2) {
        this.pFlecha2 = pFlecha2;
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
