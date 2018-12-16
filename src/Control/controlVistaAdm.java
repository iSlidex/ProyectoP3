/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author leito
 */
public class controlVistaAdm extends controlador {
    private JButton bttnBack;
    private JButton bttnExit;
    private JButton bttnRegNu;
    private JButton bttnViewProd;
    private JButton bttnViewProv;
    private JButton bttnViewU;

    public controlVistaAdm(JButton bttnBack, JButton bttnExit, JButton bttnRegNu, JButton bttnViewProd, JButton bttnViewProv, JButton bttnViewU, JFrame ventana) {
        super(ventana);
        this.bttnBack = bttnBack;
        this.bttnExit = bttnExit;
        this.bttnRegNu = bttnRegNu;
        this.bttnViewProd = bttnViewProd;
        this.bttnViewProv = bttnViewProv;
        this.bttnViewU = bttnViewU;
    }
    
}
