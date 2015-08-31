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
        
        Point cero = new Point(0,0);        
        listaVectores.add(new Vector(id, cero));
        
        cero = new Point(350,325);
        listaVectoresGraficos.add(new VectorGrafico(id, cero,cero));
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
        Vector agregado = listaVectores.get(id);
        
        Point pAgregado = agregado.getPuntoFinal();
        
        Point pFinRes = resultante.getPuntoFinal();
        
        Point pIniResNuevo = resultante.getPuntoInicial();
        
        Point pFinResNuevo = new Point();
        
        pFinResNuevo.x = pFinRes.x +  pAgregado.x;
        pFinResNuevo.y = pFinRes.x - pAgregado.y;
        
        
        VectorGrafico resultanteNuevo = new VectorGrafico(0, pIniResNuevo, pFinResNuevo);
        listaVectoresGraficos.remove(0);
        listaVectoresGraficos.add(0, resultanteNuevo);
    }
    

    public ArrayList<Vector> getListaVectores() {
        return listaVectores;
    }
    

    public ArrayList<VectorGrafico> getListaVectoresGraficos() {
        return listaVectoresGraficos;
    }
   
}
