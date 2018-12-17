/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Control.*;
import Estructuras.Administrador;
import Estructuras.Usuario;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author leito
 */
public class verifDatosAdmin extends javax.swing.JFrame {
boolean verif,success;
controladorLogin control;
vistaRegistro hold;
ArrayList <Usuario> users;
    /**
     * Creates new form verifDatosAdmin
     */

     public verifDatosAdmin() {
        initComponents();
        this.verif=true;
        this.success = false;
        control = new controladorLogin(this, bttnCont, bttnCont, passTx, userTx);
        
    }
    public verifDatosAdmin(vistaRegistro ventana,ArrayList <Usuario> users) {
        initComponents();
        this.verif=true;
        this.success = false;
        control = new controladorLogin(this, bttnCont, bttnCont, passTx, userTx);
        this.hold=ventana;
        this.users= users;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnCont = new javax.swing.JButton();
        bttnCancel = new javax.swing.JButton();
        passTx = new javax.swing.JPasswordField();
        userTx = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        bttnCont.setText("Continuar");
        bttnCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnContActionPerformed(evt);
            }
        });

        bttnCancel.setText("Cancelar");
        bttnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCancelActionPerformed(evt);
            }
        });

        passTx.setText("jPasswordField1");
        passTx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passTxMouseClicked(evt);
            }
        });
        passTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxActionPerformed(evt);
            }
        });

        userTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario :");

        jLabel2.setText("Contraseña :");

        jLabel3.setText("Para continuar debe ingresar credenciales de ");

        jLabel4.setText("Administrador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userTx, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passTx, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnCont)
                        .addGap(18, 18, 18)
                        .addComponent(bttnCancel)))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnCont)
                    .addComponent(bttnCancel))
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnContActionPerformed
       Usuario act = control.log(users);
       if(act!=null){
           if(Arrays.toString(act.getClave()).equals(Arrays.toString(passTx.getPassword()))){
               if(act instanceof Administrador ){
                vistaRegistro ventana= new vistaRegistro(true,hold);
                    ventana.setVisible(true);
                    this.setVisible(false);
               }else{
                    JOptionPane.showMessageDialog(this,"Usuario no es adiministrador");
               }
           }
       }else JOptionPane.showMessageDialog(this,"Ingrese un usuario valido");
        
        

    }//GEN-LAST:event_bttnContActionPerformed

    private void passTxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxMouseClicked
       if (verif){
       passTx.setText("");
       this.verif=false;
       }
    }//GEN-LAST:event_passTxMouseClicked

    private void passTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxActionPerformed
       if (verif){
       passTx.setText("");
       this.verif=false;
       }
    }//GEN-LAST:event_passTxActionPerformed

    private void userTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxActionPerformed

    private void bttnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bttnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(verifDatosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verifDatosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verifDatosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verifDatosAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verifDatosAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnCancel;
    private javax.swing.JButton bttnCont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passTx;
    private javax.swing.JTextField userTx;
    // End of variables declaration//GEN-END:variables
}
