package Control;

import Estructuras.Producto;
import Estructuras.Proveedor;
import Estructuras.listaProd;
import Estructuras.listaProv;
import controlXml.controlXmlProd;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlEstadisticas extends controlador {
    private JButton GenerarPDF;
    private JButton Regresar;    
    private JTable Tabla;
    controlXmlProd stat = new controlXmlProd();

    public controlEstadisticas(JButton GenerarPDF, JButton Regresar, JTable Tabla, JFrame ventana) {
        super(ventana);
        this.GenerarPDF = GenerarPDF;
        this.Regresar = Regresar;
        this.Tabla = Tabla;
    }

    public controlEstadisticas(JTable Tabla, JFrame ventana) {
        super(ventana);
        this.Tabla = Tabla;
    }
    
    public controlEstadisticas(JFrame ventana) {
        super(ventana);
    }
    
     public void llenarTablaEstadisticas(listaProv prove, listaProd cosas, JTable tablaStats){  
      ArrayList<Producto> Prod;
      ArrayList<Proveedor> Prov;
      String[] columna = { "Proveedor", "Producto más vendido", "Producto menos vendido"};
      
      DefaultTableModel dtm = new DefaultTableModel(null,columna){
        @Override
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;        
        }
        Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, Producto.class, Producto.class
        };        
    };
      Prov= prove.getLista();
      Prod =cosas.getLista();
      Prov.forEach((per)-> {
            dtm.addRow(new Object[] {per.getNombre(), stat.masVendido(Prod,per.getNombre()), stat.menosVendido(Prod,per.getNombre())});
      });
      tablaStats.setModel(dtm);
      tablaStats.setFont(new Font("perpetua",Font.BOLD,16));
}
              
        public void activa_Desactiva(boolean verdadOFalso){
      if (verdadOFalso==true){ 
    if (verdadOFalso==true){
    }  
    }
        }
    
    public void activaDesactiva(boolean verdadOFalso){
      Regresar.setEnabled(verdadOFalso);     
    }  
     
     
}
