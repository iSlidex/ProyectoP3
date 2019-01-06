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
public class controlVistaAdm extends controlador {
    private JButton bttnBack;
    private JButton bttnExit;
    private JButton bttnRegNu;
    private JButton bttnViewProd;
    private JButton bttnViewProv;
    private JButton bttnViewU;
    Producto prod;

    public controlVistaAdm(JButton bttnBack, JButton bttnExit, JButton bttnRegNu, JButton bttnViewProd, JButton bttnViewProv, JButton bttnViewU, JFrame ventana) {
        super(ventana);
        this.bttnBack = bttnBack;
        this.bttnExit = bttnExit;
        this.bttnRegNu = bttnRegNu;
        this.bttnViewProd = bttnViewProd;
        this.bttnViewProv = bttnViewProv;
        this.bttnViewU = bttnViewU;
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
