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
import Estructuras.*;
import controlXml.controlXmlUser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

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
    
    public Usuario crearUser(){
        Usuario user = null;
        if (this.booAdm.isSelected()) {
            user=new Administrador(this.nombreTx.getText(), this.correoTx.getText(),this.passTx.getPassword());            
        }else 
            user=new Empleado(this.nombreTx.getText(), this.correoTx.getText(), this.passTx.getPassword());
        return user;
    }
           public boolean sePuedeAgregarU() throws InputMismatchException{
        //Verifica que los campos de proveedor sean correctos
        boolean sePuede = true;
        if ((nombreTx.getText().equals("")) || (passTx.getPassword().equals("")) || (correoTx.getText().equals("")) || (confPass.getPassword().equals(""))){
            sePuede = false;
        }
        else if (nombreTx.getText().matches("^[0-9]*"))
            //Nombre propio con numeros?
            sePuede = false;
        
        else if ((Arrays.toString(passTx.getPassword()).length()<8) && (!(Arrays.toString(passTx.getPassword()).matches("^[0-9]*"))))
            //Contraseña muy debil, debe al menos tener numeros
            sePuede = false;
        
        else if (!(Arrays.equals(passTx.getPassword(), confPass.getPassword())))
            //Contraseñas no coinciden
            sePuede = false;
        else if (!(correoTx.getText().matches("^[a-zA-Z_0-9]*\\@\\[a-zA-Z]\\.\\[a-zA-Z]")))
            //Correo invalido
            sePuede = false;    
    return sePuede;
    }
    
    public boolean nombreInvalido(){
      if((!nombreTx.getText().equals("")))
          return nombreTx.getText().matches("^[0-9]*");   
      else return false;
    }
    
    public boolean correoInvalido(){
       if((!correoTx.getText().equals("")))
            return correoTx.getText().matches("^[a-zA-Z_0-9]*\\@\\[a-zA-Z]\\.\\[a-zA-Z]");        
        else return false;   
    }
    
    public boolean claveInvalida(){
        if((!passTx.getPassword().equals("")) && (!(confPass.getPassword().equals(""))))
            if ((Arrays.equals(passTx.getPassword(), confPass.getPassword())))
                return((Arrays.toString(passTx.getPassword()).length()<8) && (!(Arrays.toString(passTx.getPassword()).matches("^[0-9]*"))));
            else return false;        
        else return false;   
    }    
    
    public ArrayList<String> mensajeErrorPR(){
        ArrayList<String> msg=new ArrayList<>();             
        if(nombreInvalido())msg.add("Nombre");
        if(correoInvalido())msg.add(" Correo");
        if(claveInvalida())msg.add(" Contraseña");
        return msg;
    }

}
