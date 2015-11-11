/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JButton;

/**
 *
 * @author Martin
 */
public class GestorVentanas {
    private static VentanaPrincipal principal;//=new VentanaPrincipal();
    
    public static void main(String args[]){
        
        principal=new VentanaPrincipal();
        principal.add(new JButton());
        principal.setVisible(true);
        
    }
}
