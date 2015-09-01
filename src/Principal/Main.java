/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import ventanas.IngresoCoordenadas;
import ventanas.Login;
import ventanas.MenuPrincipal;
import ventanas.NuevoUsuario;
import ventanas.VentanaSumaVectoresCoordenadas;
import ventanas.VentanaSumaVectoresGrafico;

/**
 *
 * @author USUARIO
 */
public class Main {
    
    public static void main(String[] args){
     //   new VentanaSumaVectoresGrafico();
        new Login();
        new NuevoUsuario();
        new MenuPrincipal();
        new IngresoCoordenadas();
    }
    
}
