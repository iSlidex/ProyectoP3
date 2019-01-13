/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.*;
import Estructuras.*;
import controlXml.controlXmlProd;
import controlXml.controlXmlProv;
import java.awt.*;
import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author leito
 */
public class tablaProductos extends javax.swing.JFrame {
controlTablas control;
listaProd cosas;
listaProv prove;
int j;
Usuario currentUser;
controlXmlProd xml= new controlXmlProd();
controlXmlProv pml= new controlXmlProv();
vistaAddProd vent;
vistaCompraVenta despues;
ArrayList<Proveedor> proveedores;
ArrayList<Producto> objeto;
  
    public tablaProductos() {
        initComponents();      
    }
        public tablaProductos(Usuario currentUser) {
        initComponents();
        control = new controlTablas(Agregar, Eliminar, Modificar, Salir, tabla, this);
        this.currentUser = currentUser;
        objeto = xml.todasLosUser();
        proveedores = pml.todasLosUser();
        prove = new listaProv(proveedores);
        cosas = new listaProd(objeto);
        control.activa_Desactiva(false);
         if (!cosas.existeProd()) {
            control.activa_Desactiva(true);        
        }
        else {
            control.activa_Desactiva(false);        
            tabla = new javax.swing.JTable();             
        }
        control.llenarTablaProd(this.cosas,tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(6).setMinWidth(0);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(0);
            tabla.getColumnModel().getColumn(6).setMaxWidth(0);
        }
        this.getContentPane().setBackground (Color.LIGHT_GRAY);
        Agregar.requestFocus();
        
    }

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Salir = new javax.swing.JButton();
        bttnRegresar = new javax.swing.JButton();
        GenerarPDF = new javax.swing.JToggleButton();
        comprarVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Laboratorio 4 Electrodomesticos");
        setResizable(false);

        jLabel3.setText("Productos");
        jLabel3.setFont(new Font("arial",Font.BOLD,18));
        jLabel3.setForeground(red);

        Agregar.setFont(new Font("vrinda",Font.BOLD,15));
        Agregar.setText("Agregar");
        MouseListener a = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                Agregar.setForeground(blue);
                Agregar.setFont(new Font("vrinda",3,15));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                Agregar.setForeground(black);
                Agregar.setFont(new Font("vrinda",Font.BOLD,15));
            }
        };
        Agregar.addMouseListener(a);
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        Agregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgregarKeyPressed(evt);
            }
        });

        Modificar.setFont(new Font("vrinda",Font.BOLD,15));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        Modificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ModificarKeyPressed(evt);
            }
        });

        Eliminar.setFont(new Font("vrinda",Font.BOLD,15));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        Eliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EliminarKeyPressed(evt);
            }
        });

        tabla.setAutoCreateRowSorter(true);
        tabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Nombre", "Precio", "Proveedor", "Unidades", "Vendidos", "Objeto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(6).setMinWidth(0);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(0);
            tabla.getColumnModel().getColumn(6).setMaxWidth(0);
        }
        tabla.getAccessibleContext().setAccessibleName("");
        tabla.getAccessibleContext().setAccessibleDescription("");

        Salir.setFont(new Font("vrinda",Font.BOLD,15));
        MouseListener d = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                Salir.setForeground(blue);
                Salir.setFont(new Font("vrinda",3,15));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                Salir.setForeground(black);
                Salir.setFont(new Font("vrinda",Font.BOLD,15));
            }
        };
        Salir.addMouseListener(d);
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Salir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SalirKeyPressed(evt);
            }
        });

        bttnRegresar.setText("Regresar");
        bttnRegresar.setFont(new Font("vrinda",Font.BOLD,15));
        MouseListener de = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                bttnRegresar.setForeground(blue);
                bttnRegresar.setFont(new Font("vrinda",3,15));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                bttnRegresar.setForeground(black);
                bttnRegresar.setFont(new Font("vrinda",Font.BOLD,15));
            }
        };
        bttnRegresar.addMouseListener(de);
        bttnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRegresarActionPerformed(evt);
            }
        });
        bttnRegresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bttnRegresarKeyPressed(evt);
            }
        });

        GenerarPDF.setText("Imprimir");
        GenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarPDFActionPerformed(evt);
            }
        });

        comprarVender.setText("Comprar/Vender");
        comprarVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GenerarPDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comprarVender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addComponent(bttnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Salir)
                    .addComponent(bttnRegresar)
                    .addComponent(GenerarPDF)
                    .addComponent(comprarVender))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarMouseClicked

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
       this.vent = new vistaAddProd(this.currentUser,cosas,null);
       control.activaVentana(this.vent,this);
    }//GEN-LAST:event_AgregarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        if (!(tabla.getSelectedRow()==-1)){
         Producto cosaActual = (Producto) tabla.getValueAt(tabla.getSelectedRow(),6);           
        
         control.activaVentana(new vistaAddProd(this.currentUser,this.cosas,cosaActual),this);
         }else
            JOptionPane.showMessageDialog(this, "Selecciona una casilla");
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
       if (!(tabla.getSelectedRow()==-1)){
        Producto cosaActual = (Producto) tabla.getValueAt(tabla.getSelectedRow(),6);
        xml.borrarCosa(this.cosas.indiceProd(cosaActual));
        this.cosas.eliminarProd(cosaActual);
        
        tablaProductos ventana = new tablaProductos(currentUser);
        control.activaVentana(ventana, this);
        }else
            JOptionPane.showMessageDialog(this, "Selecciona una casilla");
    }//GEN-LAST:event_EliminarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tablaMouseClicked

    private void AgregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgregarKeyPressed
         if(evt.getKeyCode()==(KeyEvent.VK_ENTER))
            this.AgregarActionPerformed(new ActionEvent(this, 0, ""));
    }//GEN-LAST:event_AgregarKeyPressed

    private void ModificarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ModificarKeyPressed
         if(evt.getKeyCode()==(KeyEvent.VK_ENTER))
            this.ModificarActionPerformed(new ActionEvent(this, 0, ""));
    }//GEN-LAST:event_ModificarKeyPressed

    private void EliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EliminarKeyPressed
         if(evt.getKeyCode()==(KeyEvent.VK_ENTER))
            this.EliminarActionPerformed(new ActionEvent(this, 0, ""));        
    }//GEN-LAST:event_EliminarKeyPressed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       System.exit(0); 
    }//GEN-LAST:event_SalirActionPerformed

    private void SalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalirKeyPressed
         if(evt.getKeyCode()==(KeyEvent.VK_ENTER))
           System.exit(0);      
    }//GEN-LAST:event_SalirKeyPressed

    private void bttnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRegresarActionPerformed
        if(currentUser instanceof Administrador)
            control.activaVentana(new vistaAdmin((Administrador) currentUser),this);
        else control.activaVentana(new VistaEmpleado((Empleado) currentUser),this);
    }//GEN-LAST:event_bttnRegresarActionPerformed

    private void bttnRegresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bttnRegresarKeyPressed
        if(evt.getKeyCode()==(KeyEvent.VK_ENTER))
            this.bttnRegresarActionPerformed(new ActionEvent(this, 0, "")); 
    }//GEN-LAST:event_bttnRegresarKeyPressed

    private void GenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarPDFActionPerformed
        try {
            MessageFormat headerFormat = new MessageFormat("Lista de Productos\n\n"); //Encabezado
            MessageFormat footerFormat = new MessageFormat("CONSTRUCTORES 3000 C.A."); //Pie de página
            tabla.print(JTable.PrintMode.FIT_WIDTH, headerFormat, footerFormat);
        } catch (PrinterException e) {
            Logger.getLogger(tablaProductos.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_GenerarPDFActionPerformed

    private void comprarVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarVenderActionPerformed
       if (!(tabla.getSelectedRow()==-1)){
        Producto cosaActual = (Producto) tabla.getValueAt(tabla.getSelectedRow(),6);
        Integer index = cosas.indiceProd(cosaActual);  
        this.despues = new vistaCompraVenta(this.currentUser, cosas, cosaActual.getUnidades(), cosaActual.getProv(), cosaActual.getNombre(), cosaActual, index);
        control.activaVentana(despues, this);
       }else
            JOptionPane.showMessageDialog(this, "Selecciona una casilla");
    }//GEN-LAST:event_comprarVenderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(tablaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new tablaProductos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JToggleButton GenerarPDF;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Salir;
    private javax.swing.JButton bttnRegresar;
    private javax.swing.JButton comprarVender;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
