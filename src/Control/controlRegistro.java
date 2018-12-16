/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author leito
 */
public class controlRegistro extends controlador {
    private JCheckBox booAdm;
    private JButton bttnCancel;
    private JButton bttnReg;
    private JPasswordField confPass;
    private JTextField correoTx;
    private JTextField nombreTx;
    private JPasswordField passTx;

    public controlRegistro(JCheckBox booAdm, JButton bttnCancel, JButton bttnReg, JPasswordField confPass, JTextField correoTx, JTextField nombreTx, JPasswordField passTx, JFrame ventana) {
        super(ventana);
        this.booAdm = booAdm;
        this.bttnCancel = bttnCancel;
        this.bttnReg = bttnReg;
        this.confPass = confPass;
        this.correoTx = correoTx;
        this.nombreTx = nombreTx;
        this.passTx = passTx;
    }
    
}
