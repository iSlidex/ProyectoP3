/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Estructuras.*;

/**
 *
 * @author leito
 */
public class controlTablas extends controlador{

    List lista;
    public controlTablas(JFrame ventana) {
        super(ventana);
    }
    public controlTablas(JFrame ventana, List cosas) {
        super(ventana);
        this.lista = cosas;
    }
    
   public void llenarTabla(listaProd cosas, JTable tablaCosas ){  
      ArrayList<Producto> lista= new ArrayList<Producto>() ;
      String[] columna = { "Tipo", "Nombre", "Precio ","Objeto" };
      
      DefaultTableModel dtm = new DefaultTableModel(null,columna){
        @Override
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;        
        }
        Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, Producto.class
        };        
    };
      lista= cosas.getLista();
      for (Producto per : lista)
          {
              String [] column1 = {per.getClass().getSimpleName()};
              dtm.addRow(new Object[] {per.getTipo(), per.getNombre(),per.getPrecio(),per});
          }
      tablaCosas.setModel(dtm);
      tablaCosas.setFont(new Font("perpetua",Font.BOLD,16));
   }
   
      public void llenarTabla(listaProv cosas, JTable tablaCosas ){  
      ArrayList<Proveedor> lista= new ArrayList<Proveedor>() ;
      String[] columna = { "Tipo", "Nombre", "Precio ","Objeto" };
      
      DefaultTableModel dtm = new DefaultTableModel(null,columna){
        @Override
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;        
        }
        Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, Producto.class
        };        
    };
      lista= cosas.getLista();
      for (Proveedor per : lista)
          {
              String [] column1 = {per.getClass().getSimpleName()};
              dtm.addRow(new Object[] {per.getTipo(), per.getNombre(),per.getPrecio(),per});
          }
      tablaCosas.setModel(dtm);
      tablaCosas.setFont(new Font("perpetua",Font.BOLD,16));
   }
    
    
}
