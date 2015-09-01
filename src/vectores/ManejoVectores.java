/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import vectoresGraficos.VectorGrafico;

/**
 *
 * @author User
 */
public  class ManejoVectores {
    
    ArrayList<Vector> listaVectores;
    ArrayList<VectorGrafico> listaVectoresGraficos;
    VectorGrafico temporal;
    
    int id =0;
    
    public ManejoVectores(){
        listaVectores = new ArrayList<>();
        listaVectoresGraficos = new ArrayList<>();
        
        Point cero = new Point(0,0);        
        listaVectores.add(new Vector(id, cero));
        
        cero = new Point(350,325);
        listaVectoresGraficos.add(new VectorGrafico(id, cero,cero));
        
        temporal = new VectorGrafico(-1, cero, cero);
    }
        
    public boolean agregarVector(Point pFinalNuevo) {
        Vector ultimo = listaVectores.get(id);
        if (ultimo.getPuntoFinal().equals(pFinalNuevo)) {                       
            return false;
        } else {
            id++;
            Vector nuevo = new Vector(id, pFinalNuevo);
            listaVectores.add(nuevo);
            actualizarVectorResultante();
            agregarVectorGrafico(nuevo);
            return true;
        }
    }
    
    public void actualizarVectorResultante(){
        Vector v = listaVectores.get(id);
        Vector resultante = listaVectores.get(0);
        Point pFinal = resultante.getPuntoFinal();
        Point pFinalNuevo = v.getPuntoFinal();
        
        pFinal.x = pFinal.x + pFinalNuevo.x;
        pFinal.y = pFinal.y + pFinalNuevo.y;
        
    }
    
    public void agregarVectorGrafico(Vector agregado){
        VectorGrafico ultimo = listaVectoresGraficos.get(id-1);
        Point pFinalAnt = ultimo.getPuntoFinal();
        Point pInicialNuevo = pFinalAnt;
        Point pAgregado = agregado.getPuntoFinal();
        Point pFinalNuevo = new Point();
        pFinalNuevo.x = pFinalAnt.x + pAgregado.x;
        pFinalNuevo.y = pFinalAnt.y - pAgregado.y;
        
        VectorGrafico nuevo = new VectorGrafico(id, pInicialNuevo, pFinalNuevo);
        listaVectoresGraficos.add(nuevo);
        actualizarVectorGráficoResultante();
    }
    
    public void actualizarVectorGráficoResultante(){
        VectorGrafico resultante = listaVectoresGraficos.get(0);
        VectorGrafico ultimo = listaVectoresGraficos.get(id);
        
        Point pFinUltimo = ultimo.getPuntoFinal();
        
        Point pIniResNuevo = resultante.getPuntoInicial();
        
        VectorGrafico resultanteNuevo = new VectorGrafico(0, pIniResNuevo, pFinUltimo);
        resultanteNuevo.setColor(Color.GREEN);
        listaVectoresGraficos.remove(0);
        listaVectoresGraficos.add(0, resultanteNuevo);
    }
    
    public void actualizarTemporal(Point p){
        
        VectorGrafico ultimo = listaVectoresGraficos.get(id);
        Point pFinalAnt = ultimo.getPuntoFinal();
        Point pInicialNuevo = pFinalAnt;     
        
        VectorGrafico nuevo = new VectorGrafico(id, pInicialNuevo, p);
        temporal = nuevo;
    }
    
    public Point transformarALogicas(Point p){
        Point punto = new Point();
        Point anterior = listaVectoresGraficos.get(id).getPuntoFinal();
        punto.x = p.x-anterior.x;
        punto.y = anterior.y - p.y;
        return punto;
    }
    
    public String resultante(){
        Point punto = listaVectores.get(0).getPuntoFinal();
        String retorno = punto.x + "," + punto.y;
        return retorno;
    }
    
    public ArrayList<Vector> getListaVectores() {
        return listaVectores;
    }
    
    public ArrayList<VectorGrafico> getListaVectoresGraficos() {
        return listaVectoresGraficos;
    }

    public int getId() {
        return id;
    }

    public VectorGrafico getTemporal() {
        return temporal;
    }

    public void setTemporal(VectorGrafico temporal) {
        this.temporal = temporal;
    }
    
    
    
    
   
}
