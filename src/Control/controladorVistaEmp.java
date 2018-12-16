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
public class controladorVistaEmp extends controlador {
    private JButton bttnAddProd;
    private JButton bttnAddProv;
    private JButton bttnBack;
    private JButton bttnExit;
    private JButton bttnOpUser;
    private JButton bttnProd;
    private JButton bttnProv;

    public controladorVistaEmp(JButton bttnAddProd, JButton bttnAddProv, JButton bttnBack, JButton bttnExit, JButton bttnOpUser, JButton bttnProd, JButton bttnProv, JFrame ventana) {
        super(ventana);
        this.bttnAddProd = bttnAddProd;
        this.bttnAddProv = bttnAddProv;
        this.bttnBack = bttnBack;
        this.bttnExit = bttnExit;
        this.bttnOpUser = bttnOpUser;
        this.bttnProd = bttnProd;
        this.bttnProv = bttnProv;
    }
    
}
