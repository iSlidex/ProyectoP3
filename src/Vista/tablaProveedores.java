/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import Estructuras.Proveedor;
import Estructuras.Usuario;
import Estructuras.listaProv;
import controlXml.controlXmlProv;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author leito
 */
public class tablaProveedores extends javax.swing.JFrame {
listaProv proveedores;
controlXmlProv xml=new controlXmlProv();
controlTablas control;
Usuario currentUser;
ArrayList<Proveedor> objeto;
vistaAddProv vent;
    /**
     * Creates new form vistaProveedores
     */
    public tablaProveedores() {
        initComponents();
        control = new controlTablas(Agregar, Eliminar, Modificar, Salir, tabla, this);
    
    }
    public tablaProveedores(Usuario currentUser) {
        initComponents();
        control = new controlTablas(Agregar, Eliminar, Modificar, Salir, tabla, this);
        this.currentUser = currentUser;
        objeto = xml.todasLosUser();
        proveedores = new listaProv(objeto);
        control.activa_Desactiva(false);
         if (!proveedores.existeProv()) {
            control.activa_Desactiva(true);        
        }
        else {
            control.activa_Desactiva(false);        
            tabla = new javax.swing.JTable();             
        }
        control.llenarTabla(this.proveedores,tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(3).setMinWidth(0);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(0);
            tabla.getColumnModel().getColumn(3).setMaxWidth(0);
        }
        //this.getContentPane().setBackground (Color.LIGHT_GRAY);
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
        jButton1 = new javax.swing.JButton();
        bttnRegresar = new javax.swing.JButton();
        Estadisticas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Proveedores");
        jLabel3.setFont(new Font("arial",Font.BOLD,18));
        jLabel3.setForeground(red);

        Agregar.setText("Agregar");
        Agregar.setFont(new Font("vrinda",Font.BOLD,15));
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Proveedor", "Direccion", "Telefono", "Objeto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            tabla.getColumnModel().getColumn(3).setMinWidth(0);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(0);
            tabla.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        Salir.setFont(new Font("vrinda",Font.BOLD,15));
        Salir.setText("Salir");
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

        jButton1.setFont(new Font("vrinda",Font.BOLD,15));
        MouseListener aa = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {}

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                jButton1.setForeground(blue);
                jButton1.setFont(new Font("vrinda",3,15));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                jButton1.setForeground(black);
                jButton1.setFont(new Font("vrinda",Font.BOLD,15));
            }
        };
        jButton1.addMouseListener(aa);
        jButton1.setText("Ver Productos");

        bttnRegresar.setFont(new Font("vrinda",Font.BOLD,15));
        MouseListener bb = new MouseListener() {
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
        bttnRegresar.addMouseListener(bb);
        bttnRegresar.setText("Regresar");
        bttnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRegresarActionPerformed(evt);
            }
        });

        Estadisticas.setText("Estadísicas");
        Estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(359, 359, 359))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Estadisticas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Salir)
                    .addComponent(jButton1)
                    .addComponent(bttnRegresar)
                    .addComponent(Estadisticas))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarMouseClicked

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
     /*   if (vent==null){
        this.vent = new vistaAddProv(this.currentUser,proveedores,null);
        vent.setVisible(true);
   }*/ this.vent = new vistaAddProv(this.currentUser,proveedores,null);
       
       control.activaVentana(this.vent,this);
    }//GEN-LAST:event_AgregarActionPerformed

    private void AgregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgregarKeyPressed
       
    }//GEN-LAST:event_AgregarKeyPressed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
       if (!(tabla.getSelectedRow()==-1)){
            Proveedor provActual = (Proveedor) tabla.getValueAt(tabla.getSelectedRow(),3);
            
            control.activaVentana(new vistaAddProv(this.currentUser,this.proveedores,provActual),this);
       }else
                    JOptionPane.showMessageDialog(this, "Selecciona una casilla");
    }//GEN-LAST:event_ModificarActionPerformed

    private void ModificarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ModificarKeyPressed
        if(evt.getKeyCode()==(KeyEvent.VK_ENTER))
        this.ModificarActionPerformed(new ActionEvent(this, 0, ""));
    }//GEN-LAST:event_ModificarKeyPressed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        if (!(tabla.getSelectedRow()==-1)){
            Proveedor cosaActual = (Proveedor) tabla.getValueAt(tabla.getSelectedRow(),3);
            xml.borrarCosa(this.proveedores.indiceProv(cosaActual));
            this.proveedores.eliminarProv(cosaActual);        
            control.activaVentana(new tablaProveedores(currentUser), this);
        }else
        JOptionPane.showMessageDialog(this, "Selecciona una casilla");
    }//GEN-LAST:event_EliminarActionPerformed

    private void EliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EliminarKeyPressed
        if(evt.getKeyCode()==(KeyEvent.VK_ENTER))
        this.EliminarActionPerformed(new ActionEvent(this, 0, ""));
    }//GEN-LAST:event_EliminarKeyPressed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tablaMouseClicked

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

    private void EstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticasActionPerformed
        control.activaVentana(new vistaEstadisticasProveedor(currentUser), this);
    }//GEN-LAST:event_EstadisticasActionPerformed

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
            java.util.logging.Logger.getLogger(tablaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Estadisticas;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Salir;
    private javax.swing.JButton bttnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
