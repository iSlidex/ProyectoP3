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
import java.util.regex.Pattern;

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
    controlXmlUser xml =new controlXmlUser();

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
    
    public static boolean correoEsValido(String email) 
    { 
        String raiz = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(raiz); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
    
           public boolean sePuedeAgregarU() throws InputMismatchException{
        //Verifica que los campos de proveedor sean correctos
        boolean sePuede = true;
        if (xml.buscarPersona(correoTx.getText())!=null){
            System.out.println(xml.buscarPersona(correoTx.getText()).getNombre());
            //Usuario existe
            sePuede = false; 
        }else       if ((nombreTx.getText().equals("")) || (passTx.getPassword().equals("")) || (correoTx.getText().equals("")) || (confPass.getPassword().equals(""))){
            sePuede = false;
        }
        else if (nombreTx.getText().matches("^[0-9]*"))
            //Nombre propio con numeros?
            sePuede = false;
        
        else if ((!(Arrays.toString(passTx.getPassword()).matches("^(?=.*[0-9])(?=.*[a-zA-Z]).{8,}$"))))
            //Contraseña muy debil, debe al menos tener numeros
            sePuede = false;
        
        else if (!(Arrays.equals(passTx.getPassword(), confPass.getPassword())))
            //Contraseñas no coinciden
            sePuede = false;
        

        else if (!(correoEsValido(correoTx.getText())))
            //Correo invalido
            sePuede = false;  
        
    return sePuede;
    }
    
    public boolean nombreInvalido(){
      if(!(nombreTx.getText().equals(new JTextField().getText())))
          return nombreTx.getText().matches("^[0-9]*");   
      else return false;
    }
    public boolean existeUser(){
            return(xml.buscarPersona(correoTx.getText())!=null);
    }
    
    public boolean correoInvalido(){
       if((!correoTx.getText().equals("")))
            return (correoEsValido(correoTx.getText()));        
        else return false;   
    }
    
    public boolean claveDebil(){

            return !(Arrays.toString(passTx.getPassword()).matches("^(?=.*[0-9])(?=.*[a-zA-Z]).{8,}$"));
       
    }   
    
    public boolean claveCoincide(){
    if (Arrays.equals(passTx.getPassword(), confPass.getPassword()))
        return true;
    else return false;
    }
    
    
    public ArrayList<String> mensajeErrorPR(){
        ArrayList<String> msg=new ArrayList<>();             
        if(nombreInvalido()||nombreTx.getText().length()<=1)msg.add(" <br>-Nombre\n");
        if(!correoInvalido())msg.add(" <br>-Correo: Debe poseer el siguiente formato\n nombre@direccion.dominio\n");
        if(claveDebil() || (!(claveCoincide()))){            
            if (claveDebil()|| !passTx.getPassword().toString().isEmpty())
                msg.add(" <br>-Contraseña es muy débil, debe tener al menos 8 caracteres y tener al menos un caracter numerico\n");
            if (!(claveCoincide()))
                msg.add(" <br>-Contraseña y Confirmar contraseña deben ser iguales\n");
        }
        if (existeUser())
            msg.add(" <br>-El usuario existe\n");
        return msg;
    }

}
