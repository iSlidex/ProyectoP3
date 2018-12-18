/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Control.*;
import Estructuras.Producto;
import Estructuras.Proveedor;
import Estructuras.Usuario;
import Estructuras.listaProd;
import controlXml.controlXmlProd;
import controlXml.controlXmlProv;
import java.util.ArrayList;

    /**
/**
 *
 * @author leito
 */
public class vistaAddProd extends javax.swing.JFrame {
Usuario currentUser;
controlAgregar control;
boolean modificando;
controlXmlProv xml=new controlXmlProv();
controlXmlProd xml2=new controlXmlProd();
listaProd prods;
Proveedor provAct;
Producto prod;
ArrayList<Proveedor>  list;

    /**
     * Creates new form vistaAddProd
     */
    public vistaAddProd() {
        initComponents();
    }
    public vistaAddProd(Usuario currentUser,listaProd prods,Producto prod) {
        initComponents();
        control =new controlAgregar(jComboBox1, bttnCancel, bttnCont, codigoTx, nombreTx, precioTx, this);
        this.prods = prods;
        this.prod=prod;
        list = xml.todasLosUser();
        control.llenarComboProv(list);
        if(prod!=null){
            modificando=true;
            jComboBox1.setSelectedItem(prod.getProv());
            nombreTx.setText(prod.getNombre());
            codigoTx.setText(prod.getId());
            precioTx.setText(Double.toString(prod.getPrecio()));
        }else modificando=false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnCancel = new javax.swing.JButton();
        nombreTx = new javax.swing.JTextField();
        precioTx = new javax.swing.JTextField();
        codigoTx = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bttnCont = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bttnCancel.setText("Cancelar");

        nombreTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxActionPerformed(evt);
            }
        });

        codigoTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTxActionPerformed(evt);
            }
        });

        jLabel1.setText("Añadir Producto: ");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Precio: ");

        jLabel4.setText("Codigo:");

        bttnCont.setText("Continuar");
        bttnCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnContActionPerformed(evt);
            }
        });

        jLabel5.setText("Proveedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(bttnCont)
                        .addGap(31, 31, 31)
                        .addComponent(bttnCancel)
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreTx)
                                    .addComponent(codigoTx)
                                    .addComponent(precioTx)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(precioTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(codigoTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnCont)
                    .addComponent(bttnCancel))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxActionPerformed

    private void bttnContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnContActionPerformed
        Producto p = new Producto();
        if (modificando) {
                int index = prods.indiceProd(prod);                
                this.prods.eliminarProd(prod);
                control.agregarProd(jComboBox1.getSelectedItem().toString(),prods,p,index);                
                xml2.actualizarCosa(p, index);
            }else{
               Producto prov = control.añadirProd(jComboBox1.getSelectedItem().toString(),prods);      
               xml2.agregarCosa(prov);
            }
        control.activaVentana(new tablaProveedores(currentUser), this);
    }//GEN-LAST:event_bttnContActionPerformed

    private void codigoTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTxActionPerformed

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
            java.util.logging.Logger.getLogger(vistaAddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaAddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaAddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaAddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaAddProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCancel;
    private javax.swing.JButton bttnCont;
    private javax.swing.JTextField codigoTx;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombreTx;
    private javax.swing.JTextField precioTx;
    // End of variables declaration//GEN-END:variables
}
