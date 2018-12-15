/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import static java.awt.Color.red;
import javax.swing.*;
/**
 *
 * @author leito
 */
public class controlador {
    private JButton bttnExit;
    private JButton bttnIn;
    private JButton bttnReg;  
    private JPasswordField passTx;
    private JTextField userTx;
//control vista login
    public controlador(JButton bttnExit, JButton bttnIn, JButton bttnReg, JPasswordField passTx, JTextField userTx) {
        this.bttnExit = bttnExit;
        this.bttnIn = bttnIn;
        this.bttnReg = bttnReg;
        this.passTx = passTx;
        this.userTx = userTx;
    }
        public static boolean isNum(String strNum) {
    boolean ret = true;
    try {

        Double.parseDouble(strNum);

    }catch (NumberFormatException e) {
        ret = false;
    }
    return ret;
}
            public void cambiaBorde(JComponent nuevoBorde){
        nuevoBorde.setBorder(BorderFactory.createLineBorder(red));
    }
    
    
}
