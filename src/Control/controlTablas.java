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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author leito
 */
public class controlTablas extends controlador{
    private JButton Agregar;
    private JButton Eliminar;
    private JButton Modificar;
    private JButton Salir;
    private JLabel jLabel3;
    private JScrollPane jScrollPane1;
    private JTable tabla;
    List lista;

    public controlTablas(JButton Agregar, JButton Eliminar, JButton Modificar, JButton Salir, JLabel jLabel3, JScrollPane jScrollPane1, JTable tabla, List lista, JFrame ventana) {
        super(ventana);
        this.Agregar = Agregar;
        this.Eliminar = Eliminar;
        this.Modificar = Modificar;
        this.Salir = Salir;
        this.jLabel3 = jLabel3;
        this.jScrollPane1 = jScrollPane1;
        this.tabla = tabla;
        this.lista = lista;
    }
    
    
    public controlTablas(JFrame ventana) {
        super(ventana);
    }
    public controlTablas(JFrame ventana, List cosas) {
        super(ventana);
        this.lista = cosas;
    }
    
   public void llenarTabla(listaProd cosas, JTable tablaCosas ){  
      ArrayList<Producto> Prod= new ArrayList<>() ;
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
      Prod= cosas.getLista();
      for (Producto per : Prod)
          {
              dtm.addRow(new Object[] {per.getTipo(), per.getNombre(),per.getPrecio(),per});
          }
      tablaCosas.setModel(dtm);
      tablaCosas.setFont(new Font("perpetua",Font.BOLD,16));
   }
   
      public void llenarTabla(listaProv cosas, JTable tablaCosas ){  
      ArrayList<Proveedor> Prov= new ArrayList<>() ;
      String[] columna = { "Nombre", "Direccion", "Telefono ","Objeto" };
      
      DefaultTableModel dtm = new DefaultTableModel(null,columna){
        @Override
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;        
        }
        Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, Producto.class
        };        
    };
      Prov= cosas.getLista();
      for (Proveedor per : Prov)
          {
             dtm.addRow(new Object[] {per.getNombre(), per.getDireccion(),per.getTelefono(),per});
          }
      tablaCosas.setModel(dtm);
      tablaCosas.setFont(new Font("perpetua",Font.BOLD,16));
   }
    
    
}
