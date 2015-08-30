/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

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
    int id =0;
    
    public ManejoVectores(){
        listaVectores = new ArrayList<>();
        listaVectoresGraficos = new ArrayList<>();
        listaVectores.add(new Vector(0, new Point(0,0), new Point(0,0)));
    }
    
    
    public boolean agregarVector(Point p1, Point p2) {
        Vector v = listaVectores.get(id);
        if (v.getPuntoInicial().equals(p1) && v.getPuntoFinal().equals(p2)) {
            id++;
            Vector nuevo = new Vector(id, p1, p2);
            listaVectores.add(nuevo);
            actualizarVectorResultante();
            agregarVectorGrafico(nuevo);           
            return true;
        } else {
            return false;
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
        VectorGrafico ultimo = listaVectoresGraficos.get(id);
        Point pFinalNuevo = new Point(ultimo.getPuntoFinal().x + agregado.getPuntoFinal().x, ultimo.getPuntoFinal().y + agregado.getPuntoFinal().y);
        VectorGrafico nuevo = new VectorGrafico(id, ultimo.getPuntoFinal(), pFinalNuevo);
        listaVectoresGraficos.add(nuevo);
    }
    
    public void actualizarVectorGráfico(){
        VectorGrafico resultante = listaVectoresGraficos.get(0);
        VectorGrafico ultimo = listaVectoresGraficos.get(id);
        VectorGrafico resultanteNuevo = new VectorGrafico(0, resultante.getPuntoInicial(), ultimo.getPuntoFinal());
        listaVectoresGraficos.add(0, resultanteNuevo);        
    }
    

    public ArrayList<Vector> getListaVectores() {
        return listaVectores;
    }
    

    public ArrayList<VectorGrafico> getListaVectoresGraficos() {
        return listaVectoresGraficos;
    }
   
}
