/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Estructuras.Producto;
import java.util.ArrayList;
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
    Producto prod;

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
    
     public ArrayList<String> aviso(int flag, Producto prod){
         /*El flag sera enviado desde la vista admin, sera 1 si hay algun mensaje de error*/
        ArrayList<String> msg=new ArrayList<>();             
        if(flag==1){
            msg.add("Nombre:"+prod.getNombre()+"\n");
            msg.add("Proveedor:"+prod.getProv()+"\n");
            msg.add("Precio:"+prod.getPrecio()+"\n");
            msg.add("ID:"+prod.getId()+"\n");
            msg.add("Unidades:"+prod.getUnidades()+"\n");
        }
        return msg;
    }
    
}
