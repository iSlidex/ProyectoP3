package Vista;

import Control.controlAgregar;
import Control.controlCompraVenta;
import Estructuras.Acciones;
import Estructuras.Producto;
import Estructuras.Proveedor;
import Estructuras.Usuario;
import Estructuras.listaProd;
import Estructuras.listaProv;
import controlXml.controlXmlProd;
import controlXml.controlXmlProv;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class vistaCompraVenta extends javax.swing.JFrame {
    Usuario currentUser;
    controlXmlProv xml=new controlXmlProv();
    controlXmlProd pml=new controlXmlProd();
    listaProd prods;
    Proveedor provAct;
    Producto prod;
    Acciones ac;
    ArrayList<Proveedor>  proveedores;
    ArrayList<Producto>  productos;
    controlCompraVenta control;
    Integer unidades; //Esto lo pasaremos a la ventana siguiente
    public boolean success = true;
    
    public vistaCompraVenta() {
        initComponents();
    }
    
    public vistaCompraVenta(Usuario currentUser, listaProv prove) {
        initComponents();
        this.getContentPane().setBackground (Color.LIGHT_GRAY);
        this.productos= pml.todasLosUser();
        prods = new listaProd (productos);
        control = new controlCompraVenta(productos, aceptar, cancelar, unidadesCVTx, selAccion, selProd, selProv, this);
        proveedores = xml.todasLosUser();
        control.llenarComboProv(proveedores); 
        
    }
    
    public vistaCompraVenta(Usuario currentUser, listaProv prove, String accion, String prov, String prod, String unidades) {
        /*Regresar de vistaCompraVentaDespues */
        initComponents();
        this.getContentPane().setBackground (Color.LIGHT_GRAY);
        this.productos= pml.todasLosUser();
        control = new controlCompraVenta(productos, aceptar, cancelar, unidadesCVTx, selAccion, selProd, selProv, this);
        proveedores = xml.todasLosUser();
        control.llenarComboProv(proveedores); 
        this.selAccion.setSelectedItem(accion);
        this.selProv.setSelectedItem(prov);
        control.llenarComboProd(this.productos, prov);
        this.selProd.setSelectedItem(prod);
        this.unidadesCVTx.setText(unidades);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        selAccion = new javax.swing.JComboBox<>();
        selProv = new javax.swing.JComboBox<>();
        selProd = new javax.swing.JComboBox<>();
        unidadesCVTx = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menú compra/venta");

        jLabel2.setText("Acción:");

        jLabel3.setText("Proveedor:");

        jLabel4.setText("Producto:");

        jLabel5.setText("Unidades:");

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        selAccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Compra", "Venta" }));
        selAccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                selAccionFocusLost(evt);
            }
        });

        selProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        selProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                selProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                selProvFocusLost(evt);
            }
        });

        selProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        selProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                selProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                selProdFocusLost(evt);
            }
        });

        unidadesCVTx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                unidadesCVTxFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unidadesCVTx, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(selProd, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selProv, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selAccion, javax.swing.GroupLayout.Alignment.LEADING, 0, 109, Short.MAX_VALUE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelar)
                        .addGap(132, 132, 132))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(selAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(selProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(selProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(unidadesCVTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String accion = selAccion.getSelectedItem().toString();
        success = control.validarDatos();
        if (success) {
        String proveedor = selProv.getSelectedItem().toString();
        String producto = selProd.getSelectedItem().toString();
        prod = pml.buscarnombre(producto,proveedor);
        success = control.validarCompraVenta(prod.getUnidades(),accion);
            if (success){
                this.unidades=Integer.parseInt(unidadesCVTx.getText());
                control.activaVentana(new vistaCompraVentaDespues(currentUser, prods,this.unidades, accion,proveedor,producto), this);
            }
            else {
                JOptionPane.showMessageDialog(null,"Revise los siguientes campos:\n" +control.mensajeErrorCV(accion,this.unidades));
            }
       }
       else {
           JOptionPane.showMessageDialog(null,"Revise los siguientes campos:\n" +control.mensajeErrorCV(accion,this.unidades));
       }
               
    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        control.activaVentana(new tablaProductos(currentUser), this);
    }//GEN-LAST:event_cancelarActionPerformed

    private void selProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_selProvFocusGained

    }//GEN-LAST:event_selProvFocusGained

    private void selProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_selProvFocusLost
        String value = selProv.getSelectedItem().toString();
        control.comboSet(selProv,value);
        if (!(selProv.getSelectedItem().toString().equals("Seleccionar"))){
            control.llenarComboProd(this.productos, selProv.getSelectedItem().toString());
        }
    }//GEN-LAST:event_selProvFocusLost

    private void selProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_selProdFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_selProdFocusGained

    private void selProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_selProdFocusLost
        String value = selProd.getSelectedItem().toString();
        control.comboSet(selProd,value);
    }//GEN-LAST:event_selProdFocusLost

    private void unidadesCVTxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unidadesCVTxFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadesCVTxFocusLost

    private void selAccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_selAccionFocusLost
       String value = selAccion.getSelectedItem().toString();
       control.comboSet(selAccion,value);
    }//GEN-LAST:event_selAccionFocusLost


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
            java.util.logging.Logger.getLogger(vistaCompraVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaCompraVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaCompraVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaCompraVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaCompraVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> selAccion;
    private javax.swing.JComboBox<String> selProd;
    private javax.swing.JComboBox<String> selProv;
    private javax.swing.JTextField unidadesCVTx;
    // End of variables declaration//GEN-END:variables
}
