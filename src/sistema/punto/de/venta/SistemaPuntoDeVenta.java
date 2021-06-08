/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.punto.de.venta;

import Views.System;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.UIManager;

/**
 *
 * @author Miguel
 */
public class SistemaPuntoDeVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            
        }
        System system = new System();
        system.setExtendedState(MAXIMIZED_BOTH);
        system.setVisible(true);
    }
    
}
