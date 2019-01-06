package Vista;
import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Control.*;
import Estructuras.Administrador;
import Estructuras.Empleado;
import Estructuras.Producto;
import Estructuras.Proveedor;
import Estructuras.Usuario;
import Estructuras.listaProd;
import Estructuras.listaProv;
import controlXml.controlPDFProd;
import controlXml.controlXmlProd;
import controlXml.controlXmlProv;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class vistaEstadisticasProveedor extends javax.swing.JFrame {
listaProv proveedores;
listaProd productos;
controlXmlProv xml=new controlXmlProv();
controlXmlProd pml=new controlXmlProd();
controlEstadisticas control;
Usuario currentUser;
ArrayList<Proveedor> objeto;
ArrayList<Producto> cosa;
tablaProveedores vent;

    public vistaEstadisticasProveedor() {
        initComponents();
    }
    
     public vistaEstadisticasProveedor(Usuario currentUser) {
        initComponents();
        control = new controlEstadisticas(GenerarPDF, Regresar, tablaStats, this);
        this.currentUser = currentUser;
        objeto = xml.todasLosUser();
        cosa = pml.todasLosUser();
        proveedores = new listaProv(objeto);
        productos = new listaProd(cosa);
        control.activa_Desactiva(false);
         if (!proveedores.existeProv()) {
            control.activa_Desactiva(true);        
        }
        else {
            control.activa_Desactiva(false);        
            tablaStats = new javax.swing.JTable();             
        }
        control.llenarTablaEstadisticas(this.proveedores, this.productos, tablaStats);
        this.getContentPane().setBackground (Color.LIGHT_GRAY);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaStats = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        GenerarPDF = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaStats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Proveedor", "Producto más vendido", "Producto menos vendido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaStats);
        if (tablaStats.getColumnModel().getColumnCount() > 0) {
            tablaStats.getColumnModel().getColumn(0).setResizable(false);
            tablaStats.getColumnModel().getColumn(1).setResizable(false);
            tablaStats.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setText("Estadísticas de proveedor");

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        GenerarPDF.setText("Generar PDF");
        GenerarPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenerarPDFMouseClicked(evt);
            }
        });
        GenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarPDFActionPerformed(evt);
            }
        });
        GenerarPDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GenerarPDFKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(240, 240, 240))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(GenerarPDF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Regresar)
                                .addGap(31, 31, 31))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar)
                    .addComponent(GenerarPDF))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerarPDFMouseClicked
        // Generar PDF para esto, falta
    }//GEN-LAST:event_GenerarPDFMouseClicked

    private void GenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarPDFActionPerformed
        String a="";
        int b;
        
        TableModel tableModel = tablaStats.getModel();
        int cols = tableModel.getColumnCount();
        int fils = tableModel.getRowCount();
        for(int i=0; i<fils; i++) {
            a=a+(i+1)+".\n";
            b=1;
            for(int j=0; j<cols; j++){
                if (b==1)
                    a=a+"Proveedor: ";
                if (b==2)
                    a=a+"Producto mas vendido: ";
                if (b==3)
                    a=a+"Producto menos vendido: ";
                a=a+tableModel.getValueAt(i,j)+"\n";
                b++;
            }
            a=a+"\n\n";
        }
        
        
        controlPDFProd pdf=new controlPDFProd();
        pdf.crear_PDF("Estadisticas","Estadisticas",a);
    }//GEN-LAST:event_GenerarPDFActionPerformed

    private void GenerarPDFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GenerarPDFKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerarPDFKeyPressed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        control.activaVentana(new tablaProductos(currentUser), this);
    }//GEN-LAST:event_RegresarActionPerformed


    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaEstadisticasProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaEstadisticasProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaEstadisticasProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaEstadisticasProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaEstadisticasProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GenerarPDF;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaStats;
    // End of variables declaration//GEN-END:variables
}
