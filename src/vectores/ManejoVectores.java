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
    
    
//    /**
//     * Retorna el vector resultante de una suma de vectores
//     * @param v1 El primer vector de la suma
//     * @param v2 El último vector agregado a la suma
//     * @return
//     */
//    public static Vector vectorResultante(Vector v1, Vector v2){
//        Vector resultante = new Vector();
//        Point pInicial = v1.getPuntoInicial();
//        Point pFinal = v2.getPuntoFinal();
//        return resultante;
//    }

    public ArrayList<Vector> getListaVectores() {
        return listaVectores;
    }
    

    public ArrayList<VectorGrafico> getListaVectoresGraficos() {
        return listaVectoresGraficos;
    }
    
    
    
    public boolean agregarVector(Point p1, Point p2) {
        Vector v = listaVectores.get(id + 1);
        if (v.getPuntoInicial().equals(p1) && v.getPuntoFinal().equals(p2)) {
            id++;
            listaVectores.add(new Vector(id, p1, p2));
            
            
            return true;
        } else {
            return false;
        }
    }
    
    public void agregarVectorGrafico(){
        
        
        
    }

    
}
