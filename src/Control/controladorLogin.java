/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author leito
 */
public class controladorLogin extends controlador{
    private JButton bttnExit;
    private JButton bttnIn;
    private JButton bttnReg;  
    private JPasswordField passTx;
    private JTextField userTx;
    
        public controladorLogin(JFrame ventana,JButton bttnExit, JButton bttnIn, JButton bttnReg, JPasswordField passTx, JTextField userTx) {
        super(ventana);
        this.bttnExit = bttnExit;
        this.bttnIn = bttnIn;
        this.bttnReg = bttnReg;
        this.passTx = passTx;
        this.userTx = userTx;
    }
        public controladorLogin(JFrame ventana,JButton bttnExit, JButton bttnIn, JPasswordField passTx, JTextField userTx) {
        super(ventana);
        this.bttnExit = bttnExit;
        this.bttnIn = bttnIn;        
        this.passTx = passTx;
        this.userTx = userTx;
    }
        
}
