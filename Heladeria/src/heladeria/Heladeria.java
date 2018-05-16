/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heladeria;

import vista.frmPrincipal;

/**
 *
 * @author alumno
 */
public class Heladeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal formulario=new frmPrincipal();
        
        formulario.setExtendedState(formulario.MAXIMIZED_BOTH);
        formulario.setVisible(true);
        
        
    }
    
}
