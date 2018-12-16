/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Estructuras.Usuario;
import Estructuras.Empleado;
import Estructuras.Administrador;
import Estructuras.listaUser;
import controlXml.controlXmlUser;
import java.util.Arrays;
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
        public boolean isAdm(Usuario user){            
            return (user instanceof Administrador);
        }
        public boolean logIn(String correo,char[] clave,listaUser users){             
            controlXmlUser control = new controlXmlUser();
            Usuario user=control.buscarUsuario(correo);
            if(user!=null)
            return Arrays.equals(user.getClave(), clave);
            else return false;
        }
}
