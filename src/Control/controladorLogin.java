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
import Vista.VistaLogin;
import controlXml.controlXmlUser;
import java.util.ArrayList;
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
    controlXmlUser control = new controlXmlUser();
    
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

    public controladorLogin(JFrame ventana, JPasswordField passTx, JTextField userTx) {
        super(ventana);
        this.passTx = passTx;
        this.userTx = userTx;
    }
        public boolean isAdm(String correo){
            controlXmlUser control = new controlXmlUser();
            Usuario user=control.buscarUsuario(correo);            
            return (user instanceof Administrador);
        }
        public boolean logIn(String correo,char[] clave){            
            Usuario user=control.buscarPersona(correo);            
            return Arrays.toString(clave).equals(Arrays.toString(user.getClave()));            
        }
        public Usuario logIn2(String correo,char[] clave){             
            controlXmlUser control = new controlXmlUser();
            Usuario user=control.buscarUsuario(correo);
            if(user!=null)
                return user;
            return null;
        }
        public Usuario log(ArrayList<Usuario> users){
           for(Usuario act : users){
           if (act.getCorreo().equals(userTx.getText())) 
              return act; 
           }
        return null;
       }
}

