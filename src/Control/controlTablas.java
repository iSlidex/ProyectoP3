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
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
    private JComboBox combo;

    
    private JTable tabla;
    public controlTablas(JTable tabla, JFrame ventana){
        super(ventana);    
        this.tabla = tabla;
    }

    public controlTablas(JButton Agregar, JButton Eliminar, JButton Modificar, JButton Salir, JTable tabla, JFrame ventana) {
        super(ventana);
        this.Agregar = Agregar;
        this.Eliminar = Eliminar;
        this.Modificar = Modificar;
        this.Salir = Salir;
        this.tabla = tabla;
        
    }
    
    
    public controlTablas(JFrame ventana) {
        super(ventana);
    }
//    public controlTablas(JFrame ventana, List cosas) {
//        super(ventana);
//        this.lista = cosas;
//    }
    
   public void llenarTablaProd(listaProd cosas, JTable tablaCosas ){  
      ArrayList<Producto> Prod;
      String[] columna = { "Codigo", "Nombre", "Precio ","Proveedor", "Unidades", "Vendidos","Objeto" };
      
      DefaultTableModel dtm = new DefaultTableModel(null,columna){
        @Override
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;        
        }
        Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class,java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, Producto.class
        };
        
//        @Override
//            public Class getColumnClass(int column) {
//                switch (column) {
//                    case 0:
//                        return String.class;
//                    case 1:
//                        return String.class;
//                    case 2:
//                        return String.class;
//                    case 3:
//                        return String.class;
//                    case 4:
//                        return Integer.class;
//                    case 5:
//                        return Integer.class;
//                    case 6:
//                        return Producto.class;
//                    default:
//                        return Object.class;
//                }
//            }      
            
    };
      
      Prod= cosas.getLista();
      Prod.forEach((per) -> {
          dtm.addRow(new Object[] {per.getId(), per.getNombre(),per.getPrecio(),per.getProv(), per.getUnidades(), per.getVendidos(),per});
        });
      while (dtm.getRowCount()<27){
          dtm.addRow(new Object[]{"","","","","","",null});          
      }
      tablaCosas.setModel(dtm);
//      tablaCosas.setAutoCreateRowSorter(true);
      tablaCosas.setFont(new Font("perpetua",Font.BOLD,16));
      
   }
   
      public void llenarTabla(listaProv cosas, JTable tablaCosas ){  
      ArrayList<Proveedor> Prov;
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
      Prov.forEach((per) -> {
          dtm.addRow(new Object[] {per.getNombre(), per.getDireccion(),per.getTelefono(),per});
        });
      
      while (dtm.getRowCount()<27){
          dtm.addRow(new Object[]{"","","",null});          
      }
      tablaCosas.setModel(dtm);
      tablaCosas.setFont(new Font("perpetua",Font.BOLD,16));
   }
     public void llenarTabla(listaUser user, JTable tablaCosas ){  
      ArrayList<Usuario> Prov;
      String[] columna = { "Nombre", "Correo", "Tipo de Usuario ","Objeto" };
      
      DefaultTableModel dtm = new DefaultTableModel(null,columna){
        @Override
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;        
        }
        Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, Producto.class
        };        
    };
      Prov= user.getLista();
      Prov.forEach((per) -> {
          dtm.addRow(new Object[] {per.getNombre(), per.getCorreo(),per.getClass().getSimpleName(),per});
        });
      while (dtm.getRowCount()<27){
          dtm.addRow(new Object[]{"","","",null});          
      }
      tablaCosas.setModel(dtm);
      tablaCosas.setFont(new Font("perpetua",Font.BOLD,16));
   } 
    public void turn (boolean boo){
        
    }
        public void activa_Desactiva(boolean verdadOFalso){
      Modificar.setEnabled(verdadOFalso);
      Eliminar.setEnabled(verdadOFalso);
      if (verdadOFalso==true){
MouseListener b = new MouseListener() {

    @Override
    public void mouseClicked(MouseEvent me) {}
    @Override
    public void mousePressed(MouseEvent me) {}
    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {
        Modificar.setForeground(Color.blue);
        Modificar.setFont(new Font("vrinda",3,15));
    }

    @Override
    public void mouseExited(MouseEvent me) {
        Modificar.setForeground(Color.black);
        Modificar.setFont(new Font("vrinda",Font.BOLD,15));
    }
    };
    Modificar.addMouseListener(b);
    }
    if (verdadOFalso==true){
MouseListener c = new MouseListener() {

    @Override
    public void mouseClicked(MouseEvent me) {}
    @Override
    public void mousePressed(MouseEvent me) {}
    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {
        Eliminar.setForeground(Color.blue);
        Eliminar.setFont(new Font("vrinda",3,15));
    }

    @Override
    public void mouseExited(MouseEvent me) {
        Eliminar.setForeground(Color.black);
        Eliminar.setFont(new Font("vrinda",Font.BOLD,15));
    }
    };
    Eliminar.addMouseListener(c);
    }  
    }
    
    public void activaDesactiva(boolean verdadOFalso){
      Agregar.setEnabled(verdadOFalso);     
    }
    public void llenarComboProv(){
        
    }
    
}
