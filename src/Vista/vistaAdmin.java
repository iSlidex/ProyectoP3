/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Control.*;
import Estructuras.Administrador;
/**
 *
 * @author leito
 */
public class vistaAdmin extends javax.swing.JFrame {
controlVistaAdm control;
    /**
     * Creates new form vistaAdmin
     */
    public vistaAdmin() {
        initComponents();
        control = new controlVistaAdm(bttnBack, bttnExit, bttnRegNu, bttnViewProd, bttnViewProv, bttnViewU, this);
        }
        public vistaAdmin(Administrador currentUser) {
        initComponents();
        control = new controlVistaAdm(bttnBack, bttnExit, bttnRegNu, bttnViewProd, bttnViewProv, bttnViewU, this);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnViewU = new javax.swing.JButton();
        bttnViewProv = new javax.swing.JButton();
        bttnViewProd = new javax.swing.JButton();
        bttnRegNu = new javax.swing.JButton();
        bttnBack = new javax.swing.JButton();
        bttnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bttnViewU.setText("Ver Usuarios");
        bttnViewU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnViewUActionPerformed(evt);
            }
        });

        bttnViewProv.setText("Ver Proveedores");

        bttnViewProd.setText("Ver Productos");

        bttnRegNu.setText("Registrar Nuevo Usuario");
        bttnRegNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRegNuActionPerformed(evt);
            }
        });

        bttnBack.setText("Cerrar Sesion");
        bttnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnBackActionPerformed(evt);
            }
        });

        bttnExit.setText("Salir");
        bttnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnExitActionPerformed(evt);
            }
        });

        jLabel1.setText("Menu Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bttnViewU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnViewProv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnViewProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnRegNu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addComponent(bttnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bttnViewU)
                .addGap(18, 18, 18)
                .addComponent(bttnViewProv)
                .addGap(18, 18, 18)
                .addComponent(bttnViewProd)
                .addGap(18, 18, 18)
                .addComponent(bttnRegNu)
                .addGap(18, 18, 18)
                .addComponent(bttnBack)
                .addGap(18, 18, 18)
                .addComponent(bttnExit)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnViewUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnViewUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnViewUActionPerformed

    private void bttnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bttnExitActionPerformed

    private void bttnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnBackActionPerformed
        control.activaVentana(new VistaLogin(), this);
    }//GEN-LAST:event_bttnBackActionPerformed

    private void bttnRegNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRegNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnRegNuActionPerformed

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
            java.util.logging.Logger.getLogger(vistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnBack;
    private javax.swing.JButton bttnExit;
    private javax.swing.JButton bttnRegNu;
    private javax.swing.JButton bttnViewProd;
    private javax.swing.JButton bttnViewProv;
    private javax.swing.JButton bttnViewU;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
